package com.jobscheduler.dashboard.dao;

import com.jobscheduler.dashboard.model.Trigger;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * TriggerDao :
 *
 * @author wuhuachuan712@163.com
 * @date 16/10/9
 */

@Mapper
public interface TriggerDao{
    @Select("select SCHED_NAME as schedName from QRTZ_TRIGGERS")
    List<Trigger> findAll();
}