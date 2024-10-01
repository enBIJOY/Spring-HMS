package com.hms.controller;

import com.hms.model.PatientDisease;
import com.hms.service.PatientDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class PatientDiseaseController {
    @Autowired
    private PatientDiseaseService patientDiseaseService;


    @PostMapping("/patient/disease")
    public PatientDisease savePatientDisease (@RequestBody PatientDisease patientDisease){
        return patientDiseaseService.savePatientDisease(patientDisease);
    }

}
