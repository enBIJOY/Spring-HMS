package com.hms.repository;

import com.hms.model.PatientDischarge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDischargeRepo extends JpaRepository<PatientDischarge, Long> {
}
