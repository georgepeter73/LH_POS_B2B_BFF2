package com.lh.pos.bff.service;

import com.lh.pos.bff.dom.MESSAGE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class LoanApplicationService {
    @Autowired
    XmlProcessingService xmlProcessingService;
    public MESSAGE getLoanApplication(File file){
        return xmlProcessingService.readFile(file);
    }

}
