package org.wt.camunda

import org.camunda.bpm.engine.RuntimeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import javax.annotation.PostConstruct

@Component
class Starter {

    @Autowired
    private RuntimeService runtimeService;

    @PostConstruct
    void init(){
        runtimeService.startProcessInstanceByKey("Process_0kzd3hj");
    }
}
