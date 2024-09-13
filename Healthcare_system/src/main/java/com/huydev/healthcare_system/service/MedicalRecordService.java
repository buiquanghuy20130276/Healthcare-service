package com.huydev.healthcare_system.service;

import com.huydev.healthcare_system.dto.MedicalRecordCreate;
import com.huydev.healthcare_system.model.medicalRecord.MedicalRecord;
import com.huydev.healthcare_system.repository.MedicalRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalRecordService {
    private final MedicalRecordRepository repository;
    private final PatientService patientService;

    public List<MedicalRecord> getMedicalRecordsByPatientId(Long patientId) {
        var patient = patientService.getPatientById(patientId);
        if (!patient.isPresent()) {
            return null;
        }
        return repository.findByPatient(patient.get());

    }

    public MedicalRecord createMedicalRecord(Long patientId, MedicalRecordCreate recordCreate) {
        var patient = patientService.getPatientById(patientId);
        if (!patient.isPresent()) {
            return null;
        }
        var medicalRecord = MedicalRecord.builder().prescription(recordCreate.getPrescription())
                .treatment(recordCreate.getTreatment())
                .doctor(recordCreate.getDoctor())
                .createdAt(LocalDateTime.now()).build();
        return repository.save(medicalRecord);
    }
}
