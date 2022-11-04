package com.vueespring.utils;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class SchedulerUtils {
    public SimpleScheduleBuilder getInterval(Integer type){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .repeatForever();
            simpleScheduleBuilder.withIntervalInHours(48/type);
        return simpleScheduleBuilder;
    }
}
