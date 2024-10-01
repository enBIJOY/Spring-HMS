package com.hms.controller;

import com.hms.model.PatientDischarge;
import com.hms.service.PatientDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientDischargeController {

    @Autowired
    private PatientDischargeService patientDischargeService;

    @PostMapping("/discharge")
    public PatientDischarge postDischarge (@RequestBody PatientDischarge patientDischarge){
        return patientDischargeService.savePatientDischarge(patientDischarge);
        //return PatientDischargeService.savePatientDischarge(patientDischarge);
    }
}
