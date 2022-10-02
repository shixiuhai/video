package video.com.video.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import video.com.video.entity.VideoInformationUrl;
import video.com.video.mapper.VideoInformationUrlMapper;
import video.com.video.service.VideoInformationUrlService;

@Service
public class VideoInformationUrlImpl extends ServiceImpl<VideoInformationUrlMapper,VideoInformationUrl> implements VideoInformationUrlService{
    
}
