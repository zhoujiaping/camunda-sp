package org.wt.camunda

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.springframework.stereotype.Component

@Component
class Step1 implements JavaDelegate {

    public void execute(DelegateExecution delegate) throws Exception {
        System.out.println("step1 invoked.");
    }

}