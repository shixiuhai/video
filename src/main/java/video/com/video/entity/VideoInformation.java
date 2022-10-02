package video.com.video.entity;
// import com.baomidou.mybatisplus.annotation.FieldFill;
// import com.baomidou.mybatisplus.annotation.IdType;
// import com.baomidou.mybatisplus.annotation.TableField;
// import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.io.Serializable;
// import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
public class VideoInformation implements Serializable {
     /**
     * <pre>
     * 
     * </pre>
     */
    private String	id;

    /**
     * <pre>
     * 视频名
     * </pre>
     */
    private String	videoName;

    // 图片地址
    private String videoImg;
    /**
     * <pre>
     * 上映时间
     * </pre>
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDateTime	releaseTime;

    /**
     * <pre>
     * 视频类型
     * </pre>
     */
    private Integer	type;

    /**
     * <pre>
     * 视频区域
     * </pre>
     */
    private Integer	area;

    /**
     * <pre>
     * 视频集数
     * </pre>
     */
    private String	episodes;

    /**
     * <pre>
     * 导演
     * </pre>
     */
    private String	director;

    /**
     * <pre>
     * 主演
     * </pre>
     */
    private String	starring;

    /**
     * <pre>
     * 视频简介
     * </pre>
     */
    private String	introduction;
    
}
