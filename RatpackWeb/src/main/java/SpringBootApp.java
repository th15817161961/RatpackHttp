import cn.com.ratpack.settings.StartRatpack;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Howell on 12/12/16.
 */
@SpringBootApplication
@StartRatpack
@ComponentScan({
        "cn.com.ratpack"
})
@MapperScan({
        "cn.com.ratpack"
})
public class SpringBootApp   {
    public static void main(String... args) throws Exception {
        SpringApplication.run(SpringBootApp.class, args);
    }

}


