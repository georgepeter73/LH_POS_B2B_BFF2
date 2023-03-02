package com.lh.pos.bff.service;

import com.lh.pos.bff.AbstractTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@EnableConfigurationProperties

public class XmlProcessingServiceTest extends AbstractTest {
    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
    }
    @Autowired
    XmlProcessingService xmlProcessingService;

    @Test
    public void processTest(){
        xmlProcessingService.process();
    }

}
