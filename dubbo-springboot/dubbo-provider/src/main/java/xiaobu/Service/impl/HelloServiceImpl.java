package xiaobu.Service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import xiaobu.service.HelloService;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2019/5/8 17:31
 * @description V1.0
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello,I'm"+name;
    }
}
