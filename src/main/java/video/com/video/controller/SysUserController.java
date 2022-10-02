package video.com.video.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import video.com.video.common.utils.R;
import video.com.video.service.SysUserService;
@Slf4j
@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;
    @GetMapping("/") // required = false 表示该参数不是必须
    public R getInformation(@RequestParam(defaultValue = "3") Integer a ,
                            @RequestParam(required = false) Integer b){

        // log.error(Integer.toString(a));
        // log.error(Integer.toString(a));
        log.error(b.getClass().toString());
        return R.ok().put("result",3);
    }
    
}
