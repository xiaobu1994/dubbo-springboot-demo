package xiaobu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xiaobu.service.HelloService;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2019/5/8 17:50
 * @description V1.0
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return helloService.sayHello(name);
    }
}
