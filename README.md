### How to start this project
```
cd /opt/micro && git clone https://github.com/zhengzizhi/spring-cloud-zuul-feign-ribbon.git

cd /opt/micro/spring-cloud-zuul-feign-ribbon/eureka-server && mvn clean && mvn spring-boot:run
cd /opt/micro/spring-cloud-zuul-feign-ribbon/service-hi-node1 && mvn clean && mvn spring-boot:run
cd /opt/micro/spring-cloud-zuul-feign-ribbon/service-hi-node2 && mvn clean && mvn spring-boot:run
cd /opt/micro/spring-cloud-zuul-feign-ribbon/service-hi-node3 && mvn clean && mvn spring-boot:run
cd /opt/micro/spring-cloud-zuul-feign-ribbon/service-ribbon && mvn clean && mvn spring-boot:run
cd /opt/micro/spring-cloud-zuul-feign-ribbon/service-feign && mvn clean && mvn spring-boot:run
cd /opt/micro/spring-cloud-zuul-feign-ribbon/service-zuul && mvn clean && mvn spring-boot:run
cd /opt/micro/spring-cloud-zuul-feign-ribbon/service-ui1 && mvn clean && mvn spring-boot:run
```
### Home Page
http://localhost:8787
