package com.hms.service;

import com.hms.model.PatientDischarge;
import com.hms.repository.PatientDischargeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PatientDischargeServiceImpl implements PatientDischargeService {

    @Autowired
    private PatientDischargeRepo patientDischargeRepo;

    @Override
    public PatientDischarge savePatientDischarge(PatientDischarge patientDischarge) {
        return patientDischargeRepo.save(patientDischarge);
    }

    @Override
    public List<PatientDischarge> getAllPatientDischarge() {
        return List.of();
    }

    @Override
    public PatientDischarge fetchPatientById(Long patientId) {
        return patientDischargeRepo.findById(patientId).get();
    }

    @Override
    public void deletePatientById(Long patientId) {
        patientDischargeRepo.deleteById(patientId);
    }

    @Override
    public PatientDischarge updatePatient(Long patientId, PatientDischarge patientDischarge) {
        PatientDischarge patientDischargeDB = patientDischargeRepo.findById(patientId).get();

        if (Objects.nonNull(patientDischarge.getPatientName()) &&
                !"".equalsIgnoreCase(patientDischarge.getPatientName())) {
            patientDischargeDB.setPatientName(patientDischarge.getPatientName());
        }

        if (Objects.nonNull(patientDischarge.getBedNo()) &&
                !"".equalsIgnoreCase(patientDischarge.getBedNo())) {
            patientDischargeDB.setBedNo(patientDischarge.getBedNo());
        }


        if (Objects.nonNull(patientDischarge.getContactNumber()) &&
                !"".equalsIgnoreCase(patientDischarge.getContactNumber())) {
            patientDischargeDB.setContactNumber(patientDischarge.getContactNumber());
        }

        if (Objects.nonNull(patientDischarge.getDate()) &&
                !"".equalsIgnoreCase(patientDischarge.getDate())) {
            patientDischargeDB.setDate(patientDischarge.getDate());
        }


        return patientDischargeRepo.save(patientDischargeDB);
    }
}
