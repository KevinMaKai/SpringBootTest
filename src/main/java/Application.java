import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * Copyright: www.jd.com
 * Author: makai5@jd.com
 * Created: 2017年11月27日 下午 15:25
 * Version: 1.0
 * Project Name: SpringBootTest
 * Last Edit Time: 2017年11月27日 下午 15:25
 * Update Log:
 * Comment:
 * </pre>
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}