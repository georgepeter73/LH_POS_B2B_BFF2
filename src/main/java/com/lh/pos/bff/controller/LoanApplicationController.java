package com.lh.pos.bff.controller;

import com.lh.pos.bff.dom.MESSAGE;
import com.lh.pos.bff.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class LoanApplicationController {
    @Autowired
    LoanApplicationService loanApplicationService;
    @PostMapping("/api/v1/loan-application")
    public MESSAGE getLoanApplication(@RequestParam("application-xml") File file){
        return loanApplicationService.getLoanApplication(file);
    }
}
