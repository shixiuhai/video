package video.com.video.impl;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import video.com.video.common.utils.PageUtils;
import video.com.video.entity.VideoInformation;
import video.com.video.mapper.VideoInformationMapper;
import video.com.video.service.VideoInformationService;

import java.util.List;
// 实现类
@Service
public class VideoInformationImpl extends ServiceImpl<VideoInformationMapper,VideoInformation> implements VideoInformationService {
    @Override
    public List<VideoInformation> getResult(){
        return baseMapper.getResult();
    }

    @Override
    public PageUtils findAll(LambdaQueryWrapper<VideoInformation> queryWrapper) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
