package com.hms.controller;

import com.hms.model.Patient;
import com.hms.model.PatientDischarge;
import com.hms.service.PatientDischargeService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientDischargeController {

    @Autowired
    private PatientDischargeService patientDischargeService;

    @GetMapping("/discharge")
    public List<PatientDischarge> getAllPatientDischarge() {
        return patientDischargeService.getAllPatientDischarge();
    }

    @PostMapping("/discharge")
    public PatientDischarge postDischarge (@RequestBody PatientDischarge patientDischarge){
        return patientDischargeService.savePatientDischarge(patientDischarge);
        //return PatientDischargeService.savePatientDischarge(patientDischarge);
    }

    @GetMapping("/discharge/{id}")
    public PatientDischarge fetchPatientById(@PathVariable("id") Long patientId){
        return patientDischargeService.fetchPatientById(patientId);
    }
    @DeleteMapping("/discharge/{id}")
    public String deletePatientById(@PathVariable("id") Long patientId){
        patientDischargeService.deletePatientById(patientId);
        return "Patient Deleted Successfully!!";
    }
    @PutMapping("/discharge/{id}")
    public PatientDischarge updatePatient(@PathVariable ("id") Long patientId, @RequestBody PatientDischarge patientDischarge){
        return patientDischargeService.updatePatient(patientId, patientDischarge);
    }
}
