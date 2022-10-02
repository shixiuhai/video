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
public class SysPermission implements Serializable{
    private int id;
    private String name;
    private int parent_id;
    private String url;
    private String perms;
    private int type;
    private String ico;
    private int order_num;
    
}
