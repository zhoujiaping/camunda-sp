package org.wt.camunda

import org.camunda.bpm.engine.RuntimeService
import org.springframework.stereotype.Service

import javax.annotation.Resource

@Service
class LoanService {
    @Resource RuntimeService runtimeService

    def loanApply(){
        runtimeService.startProcessInstanceByKey('somekey',[:])
    }
}
