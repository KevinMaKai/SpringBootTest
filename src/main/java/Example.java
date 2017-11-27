import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * <pre>
 * Copyright: www.jd.com
 * Author: makai5@jd.com
 * Created: 2017年11月27日 下午 14:46
 * Version: 1.0
 * Project Name: SpringBootTest
 * Last Edit Time: 2017年11月27日 下午 14:46
 * Update Log:
 * Comment:
 * </pre>
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}