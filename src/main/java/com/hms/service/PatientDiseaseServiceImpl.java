package com.hms.service;

import com.hms.model.PatientDisease;
import com.hms.repository.PatientDiseaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientDiseaseServiceImpl implements PatientDiseaseService{
    @Autowired
    public PatientDiseaseRepo patientDiseaseRepo;

    @Override
    public PatientDisease savePatientDisease(PatientDisease patientDisease) {
        return patientDiseaseRepo.save(patientDisease);
    }
}
