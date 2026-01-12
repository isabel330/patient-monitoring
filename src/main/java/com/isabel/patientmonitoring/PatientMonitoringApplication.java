package com.isabel.patientmonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.isabel.patientmonitoring")
public class PatientMonitoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMonitoringApplication.class, args);
    }
}
