package video.com.video.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// mybatis 分页插件配置

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
@Configuration
public class MybatisPlusConfig {
    // Bean注解 spring来管理它
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;


    }
    
}
