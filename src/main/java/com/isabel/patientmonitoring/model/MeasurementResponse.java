package com.isabel.patientmonitoring.model;

public class MeasurementResponse {

    private String patientId;
    private Double temperature;
    private String timestamp;
    private String status;

    public MeasurementResponse(String patientId,
                               Double temperature,
                               String timestamp,
                               String status) {
        this.patientId = patientId;
        this.temperature = temperature;
        this.timestamp = timestamp;
        this.status = status;
    }

    public String getPatientId() {
        return patientId;
    }

    public Double getTemperature() {
        return temperature;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }
}
