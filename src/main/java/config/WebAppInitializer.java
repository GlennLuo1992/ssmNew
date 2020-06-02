package config;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private final static Logger LOG = Logger.getLogger(WebAppInitializer.class);

    @Override
    protected Class<?>[] getRootConfigClasses() {
        LOG.info("--------->初始化root config");
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        LOG.info("--------->初始化servlet config");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        LOG.info("--------->初始化mapping");
        return new String[]{"/"};
    }
}
