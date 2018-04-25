package org.hp.springboot.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author hepan
 * @create 2018-04-25 下午2:55
 **/
@Component
public class TaskService {

    @Autowired
    ApplicationContext applicationContext;

    public void score(TaskBean taskBean){
        applicationContext.publishEvent(new TaskScoreEvent(this,taskBean));
    }
}
