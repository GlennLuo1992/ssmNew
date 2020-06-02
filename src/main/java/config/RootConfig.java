package config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import service.impl.UserServiceImpl;

@Configuration
@Import(DataSourceConfig.class)//导入数据源的配置
@ComponentScan(basePackages = {"config","dao","pojo","service"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {


}
