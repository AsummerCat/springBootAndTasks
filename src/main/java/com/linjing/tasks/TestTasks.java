package com.linjing.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * @author cxc
 * @date 2019/1/11 16:27
 */
@Component
public class TestTasks {

    @Scheduled(fixedRate = 5000)
    public void test() {
        System.out.println("普通定时任务 5秒执行一次当前时间为:" + LocalTime.now());
    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void cronTest() {
        System.out.println("Cron表达式 每2秒执行一次 当前时间为:" + LocalTime.now());
    }


}
