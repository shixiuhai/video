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
public class SysRole implements Serializable {
     /**
     * <pre>
     * 角色id
     * </pre>
     */
    private Integer	id;

    /**
     * <pre>
     * 角色名
     * </pre>
     */
    private String	name;

    /**
     * <pre>
     * 描述
     * </pre>
     */
    private String	description;
    
}
