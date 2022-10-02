// 定义包的位置
package video.com.video.mapper;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import video.com.video.entity.SysUser;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    
}
