package org.hp.springboot.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author hepan
 * @create 2018-04-25 下午2:50
 **/
@Getter
public class TaskScoreEvent extends ApplicationEvent {

    private TaskBean taskBean;

    public TaskScoreEvent(Object source,TaskBean bean) {
        super(source);

        this.taskBean=bean;
    }


}
