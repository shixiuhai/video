package video.com.video.entity;
// import com.baomidou.mybatisplus.annotation.FieldFill;
// import com.baomidou.mybatisplus.annotation.IdType;
// import com.baomidou.mybatisplus.annotation.TableField;
// import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.io.Serializable;
// import java.math.BigDecimal;
// import java.time.LocalDateTime;

@Data
public class VideoInformationUrl implements Serializable {
     /**
     * <pre>
     * 
     * </pre>
     */
    private Integer	id;

    /**
     * <pre>
     * 对应的剧集id
     * </pre>
     */
    private Integer	videoNumberId;

    /**
     * <pre>
     * 视频链接
     * </pre>
     */
    private String	videoUrl;
    
}
