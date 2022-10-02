package video.com.video.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import video.com.video.entity.VideoParse;
import video.com.video.mapper.VideoParseMapper;
import video.com.video.service.VideoParseService;

@Service
public class VideoParseImpl extends ServiceImpl<VideoParseMapper,VideoParse> implements VideoParseService{
    
}
