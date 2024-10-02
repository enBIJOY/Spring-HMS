package com.hms.service;

import com.hms.model.PatientDisease;

import java.util.List;

public interface PatientDiseaseService {
    public PatientDisease savePatientDisease(PatientDisease patientDisease);

    public List<PatientDisease> getAllPatietDisease();
}
