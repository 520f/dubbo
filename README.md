# dubbo是主文件，未建父项目

dubbo只是一个文件夹，里面的两个文件是两个springboot项目一个是服务端，一个是消费端。
#为什么说项目简单呢？有以下几点
1.pom文件简单：只添加了一个dubbo相关jar包 

2.代码开发简单：application未做太多配置，且全部使用注解开发

3.为减少学习成本，项目中只有与dubbo相关代码，不掺加一点冗余代码