package com.betterarrow.observer.pattern.spring.config;

import com.betterarrow.observer.pattern.spring.EatEvent;
import com.betterarrow.observer.pattern.spring.EatEventListener;
import com.betterarrow.observer.pattern.spring.EatEventPublisherAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这三个一定要配置成bean
 *
 * @author dax
 * @since 2019/7/8 22:16
 */
@Configuration
public class EventConfig {

    @Bean
    public ApplicationEvent eatEvent() {
        return new EatEvent(true);
    }

    @Bean
    public ApplicationListener eatEventListener() {
        return new EatEventListener();
    }

    @Bean
    public ApplicationEventPublisherAware eatEventPublisherAware() {
        return new EatEventPublisherAware();
    }

}
