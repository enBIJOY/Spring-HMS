package com.hms.controller;

import com.hms.model.Patient;
import com.hms.model.PatientDisease;
import com.hms.service.PatientDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientDiseaseController {

    private final PatientDiseaseService patientDiseaseService;

    public PatientDiseaseController(PatientDiseaseService patientDiseaseService) {
        this.patientDiseaseService = patientDiseaseService;
    }

    @PostMapping("/disease")
    public PatientDisease savePatientDisease(@RequestBody PatientDisease patientDisease) {
        return patientDiseaseService.savePatientDisease(patientDisease);
    }

    @GetMapping("/disease")
    public List<PatientDisease> getAllPatientDisease() {
        return patientDiseaseService.getAllPatietDisease();
    }

    //@Autowired
//    private PatientDiseaseService patientDiseaseService;
//
//    @PostMapping("/disease")
//    public ResponseEntity<PatientDisease> savePatientDisease(@RequestBody PatientDisease patientDisease) {
//        return ResponseEntity.ok(patientDiseaseService.savePatientDisease(patientDisease));
//    }
}
