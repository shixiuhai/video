package video.com.video.controller;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import video.com.video.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression.DateTime;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import video.com.video.entity.VideoInformation;
import video.com.video.enumeration.VideoArea;
import video.com.video.enumeration.VideoType;
import video.com.video.service.VideoInformationService;

@Slf4j
@RestController
@RequestMapping("/videoInformation")
public class VideoInformationController {
    @Autowired
    private VideoInformationService videoInformationService;
    // 获取视频信息
    @GetMapping("")
    // 返回类型是一个R类型
    public R getInformation(@RequestParam(required = false) String videoName ,
                            @RequestParam(required = false,defaultValue = "") String startTime,
                            // 2022-09-03 10:58:38
                            @RequestParam(required = false,defaultValue = "") String endTime,
                            @RequestParam(required = false) String type,
                            @RequestParam(required = false) String area,
                            @RequestParam(required = false,defaultValue = "1") Integer page,
                            @RequestParam(required = false,defaultValue = "4") Integer pageSize ){
            // Page需要传入泛型 ,要做分页插件配置
            Page<VideoInformation> pageInfo = new Page<VideoInformation>(page,pageSize);
            LambdaQueryWrapper<VideoInformation> querywrapper = new LambdaQueryWrapper<VideoInformation>()
                .like(!StringUtils.isEmpty(videoName),VideoInformation::getVideoName, videoName)
                // .or().between((!StringUtils.isEmpty(startTime)&&!StringUtils.isEmpty(endTime)), VideoInformation::getReleaseTime, startTime, endTime)
                .between((!StringUtils.isEmpty(startTime)&&!StringUtils.isEmpty(endTime)), VideoInformation::getReleaseTime, startTime, endTime)
                // 通过枚举类获取type
                // .or().eq( !StringUtils.isEmpty(type),VideoInformation::getType,VideoType.getType(type))
                .eq( !StringUtils.isEmpty(type),VideoInformation::getType,VideoType.getType(type))
                // 通过枚举类获取Area
                // .or().eq(!StringUtils.isEmpty(area),VideoInformation::getArea,VideoArea.getType(area))
                .eq(!StringUtils.isEmpty(area),VideoInformation::getArea,VideoArea.getType(area))
                // 降序排列
                .orderByDesc(VideoInformation::getId);
            
            videoInformationService.page(pageInfo, querywrapper);
            log.info("视频信息查询成功");
            return R.ok().put(pageInfo);
    }

    
}