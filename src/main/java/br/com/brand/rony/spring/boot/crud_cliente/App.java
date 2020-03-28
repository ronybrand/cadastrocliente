package br.com.brand.rony.spring.boot.crud_cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
@ComponentScan("br.com.brand.rony.spring.boot.crud_cliente")
public class App  extends SpringBootServletInitializer 
{
    public static void main( String[] args )
    {
//    	 SpringApplication.run(App.class, args);
//        new App().configure( new SpringApplicationBuilder(App.class)).run(args);
        ApplicationContext ctx = SpringApplication.run(App.class, args);

//        String[] beanNames = ctx.getBeanDefinitionNames();
//
//        Arrays.sort(beanNames);
//
//        for (String beanName : beanNames)
//        {
//            System.out.println(beanName);
//        }
    }
}
