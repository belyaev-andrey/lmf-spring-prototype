package org.acme.spring.event.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoAppConfig.class);
        HelloBean bean = ctx.getBean(HelloBean.class);
        System.out.println(bean.sayHello());
    }

}
