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
public class SysUserRole implements Serializable{
    /**
     * <pre>
     * 
     * </pre>
     */
    private Integer	id;

    /**
     * <pre>
     * 
     * </pre>
     */
    private String	userId;

    /**
     * <pre>
     * 
     * </pre>
     */

    private Integer	roleId;
    
}
