package com.isabel.patientmonitoring.repository;

import com.isabel.patientmonitoring.model.MeasurementRequest;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MeasurementRepository {

    private final Map<String, List<MeasurementRequest>> store = new HashMap<>();

    public void save(MeasurementRequest measurement) {
        store.computeIfAbsent(
                measurement.getPatientId(),
                k -> new ArrayList<>()
        ).add(measurement);
    }

    public List<MeasurementRequest> findByPatientId(String patientId) {
        return store.getOrDefault(patientId, Collections.emptyList());
    }
}
