package com.huydev.healthcare_system.repository;

import com.huydev.healthcare_system.model.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
