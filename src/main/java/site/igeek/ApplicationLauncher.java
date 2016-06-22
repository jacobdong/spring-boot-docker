package site.igeek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * Created by jacobdong on 16/6/22.
 */
@SpringBootApplication
public class ApplicationLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationLauncher.class);

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(ApplicationLauncher.class, args);
        LOGGER.info("====================================");
        LOGGER.info("当前环境:" + Arrays.toString(ctx.getEnvironment().getActiveProfiles()));
        LOGGER.info("应用名称:" + (ctx.getApplicationName()));
        LOGGER.info("启动时间:" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ctx.getStartupDate())));
        LOGGER.info("====================================");
    }

}
