package video.com.video.entity;
import lombok.Data;
import java.io.Serializable;

@Data
public class VideoParse implements Serializable{
    private int id;
    // 三方解析链接
    private String parseLink;
    // 三方解析链接的别称
    private String parseName;

}