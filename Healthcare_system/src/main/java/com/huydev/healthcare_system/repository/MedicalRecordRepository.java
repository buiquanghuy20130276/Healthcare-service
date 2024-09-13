package com.huydev.healthcare_system.repository;

import com.huydev.healthcare_system.model.medicalRecord.MedicalRecord;
import com.huydev.healthcare_system.model.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    List<MedicalRecord> findByPatient(Patient patient);
}
