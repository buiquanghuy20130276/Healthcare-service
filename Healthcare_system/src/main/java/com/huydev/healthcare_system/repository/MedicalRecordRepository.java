package com.huydev.healthcare_system.repository;

import com.huydev.healthcare_system.model.medicalRecord.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
}
