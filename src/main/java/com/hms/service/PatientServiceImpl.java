package com.hms.service;

import com.hms.model.Patient;
import com.hms.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepo patientRepo;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return List.of();
    }

    @Override
    public Patient fetchPatientById(int userId) {
        return patientRepo.findById(userId).get();
    }

    @Override
    public void deletePatientById(int userId) {
        patientRepo.deleteById(userId);
    }

    @Override
    public Patient updatePatient(int userId, Patient patient) {
        Patient patientDB = patientRepo.findById(userId).get();

//        if (Objects.nonNull(patient.getUsername()) &&
//                !"".equalsIgnoreCase(patient.getUsername())) {
//            patientDB.setUsername(patient.getUsername());
//        }

        if (Objects.nonNull(patient.getPassword()) &&
                !"".equalsIgnoreCase(patient.getPassword())) {
            patientDB.setPassword(patient.getPassword());
        }
//        if (Objects.nonNull(patient.getFullName()) &&
//                !"".equalsIgnoreCase(patient.getFullName())) {
//            patientDB.setFullName(patient.getFullName());
//        }
        if (Objects.nonNull(patient.getPhone()) &&
                !"".equalsIgnoreCase(patient.getPhone())) {
            patientDB.setPhone(patient.getPhone());
        }
        if (Objects.nonNull(patient.getAge()) &&
                patient.getAge() > 0) {
            patientDB.setAge(patient.getAge());
        }
        if (Objects.nonNull(patient.getAddress()) &&
                !"".equalsIgnoreCase(patient.getAddress())) {
            patientDB.setAddress(patient.getAddress());
        }
//        if (Objects.nonNull(patient.getUserType()) &&
//                !"".equalsIgnoreCase(patient.getUserType())) {
//            patientDB.setUserType(patient.getUserType());
//        }
        return patientRepo.save(patientDB);
    }
}
