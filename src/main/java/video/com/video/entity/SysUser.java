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
public class SysUser implements Serializable {
    /**
     * <pre>
     * 用户id
     * </pre>
     */
    private String	id;

    /**
     * <pre>
     * 用户名
     * </pre>
     */
    private String	username;

    /**
     * <pre>
     * 密码
     * </pre>
     */
    private String	password;

    /**
     * <pre>
     * 电子邮箱
     * </pre>
     */
    private String	email;

    /**
     * <pre>
     * 性别 1 男，0女
     * </pre>
     */
    private String	sex;

    /**
     * <pre>
     * 是否启用
     * </pre>
     */
    private String	status;
    
}
