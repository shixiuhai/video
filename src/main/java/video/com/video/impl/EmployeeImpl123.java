package video.com.video.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import video.com.video.entity.Employee;
import video.com.video.mapper.EmployeeMapper;
import video.com.video.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service // 实现类必须添加Service注解，继承ServiceImpl，父类泛型< 对应实体类的Mapper映射接口, 实体类>
public class EmployeeImpl123 extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
