package com.huydev.healthcare_system.controller;

import com.huydev.healthcare_system.dto.MedicalRecordCreate;
import com.huydev.healthcare_system.model.medicalRecord.MedicalRecord;
import com.huydev.healthcare_system.service.MedicalRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients/{patientId}/medical-records")
@RequiredArgsConstructor
public class MedicalRecordController {

    private final MedicalRecordService medicalRecordService;

    @GetMapping
    public ResponseEntity<List<MedicalRecord>> getMedicalRecordsByPatient(@PathVariable Long patientId) {
        return ResponseEntity.ok(medicalRecordService.getMedicalRecordsByPatientId(patientId));
    }

    @PostMapping
    public ResponseEntity<MedicalRecord> createMedicalRecord(@PathVariable Long patientId,
                                                             @RequestBody MedicalRecordCreate medicalRecordCreate) {
        MedicalRecord createdRecord = medicalRecordService.createMedicalRecord(patientId, medicalRecordCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRecord);
    }

}

