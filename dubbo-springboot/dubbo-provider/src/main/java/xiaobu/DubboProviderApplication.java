package xiaobu;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("生产者程序启动成功...");
    }
}
