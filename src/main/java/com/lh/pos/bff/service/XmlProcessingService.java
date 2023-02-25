package com.lh.pos.bff.service;

import com.lh.pos.mismo34.DEAL;
import com.lh.pos.mismo34.MESSAGE;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.xml.bind.*;
import java.io.*;

@Service
public class XmlProcessingService {

    public void process(){
        JAXBContext jaxbContext;
        try
        {
            Resource resource = new ClassPathResource("sample.xml");
            MESSAGE message = unmarshall(resource.getFile());

        }
        catch (Exception  e)
        {
            e.printStackTrace();
        }
    }
    public MESSAGE unmarshall(File file) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(MESSAGE.class);
        return (MESSAGE) context.createUnmarshaller()
                .unmarshal(file);
    }
}
