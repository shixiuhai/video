package video.com.video.service;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import video.com.video.common.utils.PageUtils;
import video.com.video.entity.VideoInformation;


import java.util.List;
public interface VideoInformationService extends IService<VideoInformation>{
    List<VideoInformation> getResult();

    PageUtils findAll(LambdaQueryWrapper<VideoInformation> queryWrapper);
    
}
