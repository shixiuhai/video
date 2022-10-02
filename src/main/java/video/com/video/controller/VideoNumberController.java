package video.com.video.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;

import lombok.extern.slf4j.Slf4j;
import video.com.video.common.utils.R;
import video.com.video.entity.VideoInformationUrl;
import video.com.video.entity.VideoNumber;
import video.com.video.service.VideoInformationUrlService;
import video.com.video.service.VideoNumberService;

// 先添加日志注解
@Slf4j
@RestController
@RequestMapping("/videoNumber")
public class VideoNumberController {
    // 自动注入videoNumberService
    @Autowired
    private VideoNumberService videoNumberService;
    // 自动注入 videoInformationUrlService
    @Autowired
    private VideoInformationUrlService videoInformationUrlService;
    
    
    // 增加
    @PostMapping("/")
    public R test(HttpServletRequest request, @RequestBody VideoNumber videoNumber){
        log.info("增加接口调用成功");
        return R.ok().put(videoNumber);
        

    }
    // 删除
    @DeleteMapping("/")
    public R test1(){
        log.info("删除接口调用成功");
        return R.ok().put("删除接口");

    }

    // 修改
    @PutMapping("/")
    public R test3(){
        log.info("修改接口调用成功");
        return R.ok().put("修改接口");
    }

    // 查询
    @GetMapping("")
    public R getVideoNumber(@RequestParam(defaultValue = "3",required = false) Integer videoId){
        // 构建条件语句
        LambdaQueryWrapper<VideoNumber> videoNumberQuery = new LambdaQueryWrapper<VideoNumber>()
            .eq(VideoNumber::getVideoInformationId,videoId);
        // 执行查询操作
        List<VideoNumber> videoNumberList= videoNumberService.list(videoNumberQuery);
        // 定义一个url链接礼包存放链接
        List<VideoInformationUrl> videoInformationUrlList = new  ArrayList<VideoInformationUrl>();
        for(VideoNumber videoNumberItem:videoNumberList){
            // 进行变量查询链接
            LambdaQueryWrapper<VideoInformationUrl> videoInformationQuery=new LambdaQueryWrapper<VideoInformationUrl>()
                .eq(VideoInformationUrl::getVideoNumberId,videoNumberItem.getId());
            // 
            // VideoInformationUrl videoInformationUrl=videoInformationUrlService.getOne(videoInformationQuery);
            videoInformationUrlList.add(videoInformationUrlService.getOne(videoInformationQuery));

            

        }
        // 返回所有的url

        return R.ok().put(videoInformationUrlList);
        
        

    }

    
}
