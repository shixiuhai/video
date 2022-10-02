package video.com.video.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import video.com.video.entity.VideoNumber;
import video.com.video.mapper.VideoNumberMapper;
import video.com.video.service.VideoNumberService;

@Service
public class VideoNumberImpl extends ServiceImpl<VideoNumberMapper,VideoNumber> implements VideoNumberService{
    
}
