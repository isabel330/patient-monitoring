package com.isabel.patientmonitoring.model;

import jakarta.validation.constraints.*;

public class MeasurementRequest {

    @NotBlank(message = "patientId must not be blank")
    private String patientId;

    @NotNull
    @DecimalMax(value = "45.0", message = "temperature must be <= 45")
    private Double temperature;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
