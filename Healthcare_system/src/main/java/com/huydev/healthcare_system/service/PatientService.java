package com.huydev.healthcare_system.service;

import com.huydev.healthcare_system.exception.ResourceNotFoundException;
import com.huydev.healthcare_system.model.patient.Patient;
import com.huydev.healthcare_system.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository repository;

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public Optional<Patient>getPatientById(Long id){
        return repository.findById(id);
    }
    public Patient createPatient(Patient patient) {
        return repository.save(patient);
    }

    public Patient updatePatient(Long patientId, Patient patientDetails) {
        return repository.findById(patientId)
                .map(patient -> {
                    patient.setDateOfBirth(patientDetails.getDateOfBirth());
                    patient.setGender(patientDetails.getGender());
                    patient.setAddress(patientDetails.getAddress());
                    return repository.save(patient);
                }).orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
    }

    public void deletePatient(Long patientId) {
        repository.deleteById(patientId);
    }
}
