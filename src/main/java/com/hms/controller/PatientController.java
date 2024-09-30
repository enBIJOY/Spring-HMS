package com.hms.controller;

import com.hms.model.Patient;
import com.hms.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping ("/patient")
    public List<Patient> getAllPatient() {
        return patientService.getAllPatient();
    }

    @PostMapping ("/patient")
    public Patient createUser(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

        @GetMapping("/patient/{id}")
        public Patient fetchUserById(@PathVariable("id") int userId){
            return patientService.fetchPatientById(userId);
    }

    @DeleteMapping("/patient/{id}")
    public String deleteUserById(@PathVariable("id") int UserId){
        patientService.deletePatientById(UserId);
        return "Patient Deleted Successfully!!";
    }
    @PutMapping("/patient/{id}")
    public Patient updateUser(@PathVariable ("id") int UserId, @RequestBody Patient patient){
        return patientService.updatePatient(UserId, patient);
    }
}
