# springboot集成dubbo

## windows 下Zookeeper的安装
[安装链接](https://blog.csdn.net/tanhongwei1994/article/details/89959218)

## 创建多个module模块的springboot项目
 dubbo-api 是提供接口
 
 dubbo-consumer是消费者
 
 dubbo-provider是生产者

```
    <packaging>pom</packaging>  父类型都为pom类型
    <packaging>jar</packaging> 内部调用或者是作服务使用
    <packaging>war</packaging>  需要部署的项目

```


# dubbo-admin
[dubbo-admin github地址](https://github.com/apache/incubator-dubbo-admin)