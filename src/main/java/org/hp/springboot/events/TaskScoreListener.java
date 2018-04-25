package org.hp.springboot.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author hepan
 * @create 2018-04-25 下午3:02
 **/

@Component
public class TaskScoreListener {

    @EventListener
    public void register(TaskScoreEvent taskScoreEvent){
        TaskBean bean=taskScoreEvent.getTaskBean();
        System.out.println(bean);
    }

    @EventListener
    public void score(TaskScoreEvent taskScoreEvent){
        TaskBean bean=taskScoreEvent.getTaskBean();
        System.out.println(bean);
    }


}
