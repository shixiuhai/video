// 定义包的位置
package video.com.video.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import video.com.video.entity.Employee;
// 导入apache的mybatis库
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
