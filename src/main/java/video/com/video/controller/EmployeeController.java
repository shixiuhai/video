package video.com.video.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import javafx.print.PageLayout;
import video.com.video.common.utils.R;
import video.com.video.entity.Employee;
import video.com.video.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/*
 * public是公开的，可以通过对象跨类调用。 
 * public static 是静态公开的，可以通过类名直接调用
 */
// 所有的结果都会封装成R对象

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    /*
     * @param request
     * @param employee
     * @return 
     */
    @PostMapping("/login")
    // R<Employee> 是一个返回值 类型
    // 再login 方法里面来接收参数
    public R login(HttpServletRequest request, @RequestBody Employee employee){
        // 对密码进行md5加密
        String password=employee.getPassword();
        password=DigestUtils.md5DigestAsHex(password.getBytes());
        log.error("---------");
        log.error("密码的md5是" + password);
        log.error("---------");
        // 2. 根据页面提交的用户名查询数据库
        // 返回的是一个从数据库里面查询到的对象
        // Employee emp =new LambdaQueryWrapper<>(employeeService)
        //     .eq(Employee::getUsername,employee.getUsername())
        //     .one();
        


        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<Employee>();
            // 实现查询语句相关
            // queryWrapper.eq(StringUtils.isNotEmpty(),)
            queryWrapper.eq(Employee::getUsername,1);
        // 调用执行查询
        // 更新是update
        // 删除是remove
        
        Employee emp = employeeService.getOne(queryWrapper);

        log.info(emp.getIdNumber());
        // Employee emp = new Employee();
        // 新问题有 java类里面私有方法可以被继承嘛
        // java接口里面的私有方法需要实现以及可以被继承嘛
 
        return R.ok();
    }
    

    
}
