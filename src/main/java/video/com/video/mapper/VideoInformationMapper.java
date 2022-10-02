package video.com.video.mapper;
// BaseMapper
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
// 导入实体类
import video.com.video.entity.VideoInformation;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface VideoInformationMapper extends BaseMapper<VideoInformation> {
    List<VideoInformation> getResult();
}