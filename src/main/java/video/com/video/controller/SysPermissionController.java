package video.com.video.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import lombok.extern.slf4j.Slf4j;
import video.com.video.common.utils.R;
import video.com.video.entity.SysPermission;
import video.com.video.service.SysPermissionService;

@Slf4j
@RestController
@RequestMapping("/permission")
public class SysPermissionController {
    // 自动注入service接口
    @Autowired
    private SysPermissionService sysPermissionService;
    @GetMapping("")
    public R getPermission(@RequestParam(defaultValue="1") Integer a,
                           @RequestParam(defaultValue = "3") Integer b){

        QueryWrapper<SysPermission> queryWrapper = new QueryWrapper<SysPermission>();
        queryWrapper.eq("id",a);
        queryWrapper.or().in("id",a);
        SysPermission syspermission= sysPermissionService.getOne(queryWrapper);
        return R.ok().put(syspermission);
    }

    
}
