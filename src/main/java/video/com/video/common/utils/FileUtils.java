package video.com.video.common.utils;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 解析文件
 * @author lijiang
 * @date 2019-05-27
 */
public class FileUtils {
    /**
     * 获取项目里面文件路径
     * @param fileName
     * @return
     * @throws IOException
     */
    public static String getPath(String fileName) {
        Resource resource = new ClassPathResource(fileName);
        try {
            return resource.getFile().getPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * MultipartFile 转 File
     *
     * @param file
     * @throws Exception
     */
    public static File multipartFileToFile(MultipartFile file) throws Exception {

        File toFile = null;
        if (file.equals("") || file.getSize() <= 0) {
            file = null;
        } else {
            InputStream ins = null;
            ins = file.getInputStream();
            toFile = new File(file.getOriginalFilename());
            inputStreamToFile(ins, toFile);
            ins.close();
        }
        return toFile;
    }

    //获取流文件
    private static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除本地临时文件
     * @param file
     */
    public static void delteTempFile(File file) {
        if (file != null) {
            File del = new File(file.toURI());
            del.delete();
        }
    }
    /**
     * 删除本地临时文件
     *
     */
    public static void delteTempFile(String  path) {
            File del = new File(path);
            if (del.exists()){
                del.delete();
            }
    }

    public static String encodeBase64File(String path) throws Exception {
        File file = new File(path);
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return new BASE64Encoder().encode(buffer);
    }

    /**
     * 判断该路径是否有文件 若没有则创建文件夹
     */
    public static void mkdir(String path){
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();
        }
    }

    public static String pictureUpload(MultipartFile file,String path) {

        if (file.isEmpty()) {
            //文件空了
            return null;
        }

        //文件扩展名
        String extName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

        //使用UUID生成文件名称
        String fileName = UUID.randomUUID() + extName;

        //文件上传的全路径
        String filePath = path + fileName;

        File toFile=new File(filePath);

        if (!toFile.getParentFile().exists()){
            //文件夹不存在，先创建文件夹
            toFile.getParentFile().mkdirs();
        }
        try {
            //进行文件复制上传
            FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(toFile));
        } catch (Exception e) {
            //上传失败
            e.printStackTrace();
        }
        //返回文件名
        return fileName;

    }

    public static ResponseEntity<byte[]> downloadFile(String fileName) {
        try {
            File file = new File(fileName);
            byte[] body = null;
            InputStream is = new FileInputStream(file);
            body = new byte[is.available()];
            is.read(body);
            is.close();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", "attchement;filename=" + file.getName());
            HttpStatus statusCode = HttpStatus.OK;
            ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
            return entity;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


}
