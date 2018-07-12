package com.ystmobile.subscribe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.ystmobile.subscribe")
//AOP调用顺序：0-log 1-login 2-right
public class AopConfig {
}
