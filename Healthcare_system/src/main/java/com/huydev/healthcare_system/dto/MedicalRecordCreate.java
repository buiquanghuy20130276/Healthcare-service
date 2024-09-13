package com.huydev.healthcare_system.dto;

import com.huydev.healthcare_system.model.doctor.Doctor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class MedicalRecordCreate {

    private Doctor doctor;

    private String diagnosis;

    private String treatment;

    private String prescription;
}
