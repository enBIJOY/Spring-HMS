package com.hms.controller;

import com.hms.model.PatientDisease;
import com.hms.service.PatientDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    //@Autowired
//    private PatientDiseaseService patientDiseaseService;
//
//    @PostMapping("/disease")
//    public ResponseEntity<PatientDisease> savePatientDisease(@RequestBody PatientDisease patientDisease) {
//        return ResponseEntity.ok(patientDiseaseService.savePatientDisease(patientDisease));
//    }
}
