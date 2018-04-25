package org.hp.springboot.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hepan
 * @create 2018-04-25 下午2:57
 **/
@RestController
@RequestMapping("/task")
public class TaskController  {

    @Autowired
    private TaskService taskService;


    @RequestMapping("/score")
    public String score(){
        TaskBean taskBean=new TaskBean();
        taskBean.setName("abc");
        taskBean.setScore("98");
        taskBean.setXeguid("00010101010929293");

        taskService.score(taskBean);

        return "评分成功";
    }



}
