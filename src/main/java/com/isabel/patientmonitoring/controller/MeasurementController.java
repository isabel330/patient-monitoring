package com.isabel.patientmonitoring.controller;
import com.isabel.patientmonitoring.model.MeasurementResponse;
import com.isabel.patientmonitoring.model.MeasurementRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;
@RestController
@RequestMapping("/api/v1/measurements")
public class MeasurementController {


    @PostMapping
    public MeasurementResponse receiveMeasurement(
            @Valid @RequestBody MeasurementRequest request) {

        return new MeasurementResponse(
                request.getPatientId(),
                request.getTemperature(),
                Instant.now().toString(),
                "RECEIVED"
        );
    }

}