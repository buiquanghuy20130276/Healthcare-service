package com.huydev.healthcare_system.model.medicalRecord;

import com.huydev.healthcare_system.model.doctor.Doctor;
import com.huydev.healthcare_system.model.patient.Patient;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "medical_records")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @Column(length = 1000)
    private String diagnosis;

    @Column(length = 1000)
    private String treatment;

    @Column(length = 1000)
    private String prescription;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

}
