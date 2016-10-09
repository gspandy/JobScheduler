package com.jobscheduler.dashboard.controller;

import com.jobscheduler.dashboard.service.JobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * JobController :
 *
 * @author wuhuachuan712@163.com
 * @date 16/10/9
 */

@Slf4j
@RestController
public class JobController {

    @Autowired
    private JobService jobService;
}
