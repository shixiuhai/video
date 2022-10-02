package video.com.video.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import video.com.video.entity.SysUser;
import video.com.video.mapper.SysUserMapper;
import video.com.video.service.SysUserService;

@Service
public class SysUserImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService{
    
}
