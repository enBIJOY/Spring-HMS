package com.hms.service;

import com.hms.model.Patient;

import java.util.List;

public interface PatientService {
    public Patient savePatient(Patient patient);

    List<Patient> getAllPatient();


    public Patient fetchPatientById(int patientId);

    //public void deletePatientById(int userId);

    //public Patient updatePatient(int userId, Patient patient);
}
