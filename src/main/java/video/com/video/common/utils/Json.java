package video.com.video.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.*;

public class Json {

    /**
     * 对象序列化为JSON字符串
     *
     * @param object
     * @return
     */
    public static String toJsonString(Object object) {
        return JSON.toJSONString(object);
    }

    public static <T> T fromJson(String jsonStr, Class<T> clazz) {
        return JSON.parseObject(jsonStr, clazz);
    }

    public static JSONObject parseXML(String data) {
        JSONObject jsonObject;
        org.dom4j.Document document = null;
        try {
            document = DocumentHelper.parseText(data);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        List<Element> list = document.getRootElement().elements();
            jsonObject = new JSONObject();
        for (Element aList : list) {
            jsonObject.put(aList.getName(), aList.getData());
        }
        return jsonObject;

    }
}
