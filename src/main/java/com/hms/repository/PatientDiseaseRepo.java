package com.hms.repository;

import com.hms.model.PatientDisease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDiseaseRepo extends JpaRepository<PatientDisease, String> {
}
