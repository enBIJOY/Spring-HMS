package com.hms.service;

import com.hms.model.PatientDischarge;
import com.hms.repository.PatientDischargeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientDischargeServiceImpl implements PatientDischargeService {

    @Autowired
    private PatientDischargeRepo patientDischargeRepo;

    @Override
    public PatientDischarge savePatientDischarge(PatientDischarge patientDischarge) {
        return patientDischargeRepo.save(patientDischarge);
    }
}
