package video.com.video.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import video.com.video.entity.SysPermission;
import video.com.video.mapper.SysPermissionMapper;
import video.com.video.service.SysPermissionService;

@Service
public class SysPermissionImpl extends ServiceImpl<SysPermissionMapper,SysPermission>  implements SysPermissionService {
    
}
