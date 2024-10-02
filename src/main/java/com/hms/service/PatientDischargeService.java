package com.hms.service;

import com.hms.model.PatientDischarge;

import java.util.List;


public interface PatientDischargeService {
    public PatientDischarge savePatientDischarge(PatientDischarge patientDischarge);

    public List<PatientDischarge> getAllPatientDischarge();

    public PatientDischarge fetchPatientById(Long patientId);

    public void deletePatientById(Long patientId);

    public PatientDischarge updatePatient(Long patientId, PatientDischarge patientDischarge);
}
