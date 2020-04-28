package com.betterarrow;

import com.betterarrow.observer.pattern.spring.EatEventPublisherAware;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class EventSpringApplicationTests {
@Resource
private EatEventPublisherAware eatEventPublisherAware;
    @Test
    public void contextLoads() {

        eatEventPublisherAware.refreshEvent();
    }

}
