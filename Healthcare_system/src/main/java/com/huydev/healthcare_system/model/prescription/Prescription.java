package com.huydev.healthcare_system.model.prescription;

import com.huydev.healthcare_system.model.doctor.Doctor;
import com.huydev.healthcare_system.model.patient.Patient;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "prescriptions")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescriptionId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @Temporal(TemporalType.DATE)
    private Date prescriptionDate;

    @Column(length = 1000)
    private String medicineDetails;

    @Column(length = 1000)
    private String instructions;
}
