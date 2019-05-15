package xiaobu;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.tools.jar.CommandLine;

@EnableDubbo
@SpringBootApplication
public class DubboConsumerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("消费者程序启动成功....");
    }
}
