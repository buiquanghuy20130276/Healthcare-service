package com.huydev.healthcare_system.repository;

import com.huydev.healthcare_system.model.appointment.Appointment;
import com.huydev.healthcare_system.model.doctor.Doctor;
import com.huydev.healthcare_system.model.invoice.Invoice;
import com.huydev.healthcare_system.model.medicalRecord.MedicalRecord;
import com.huydev.healthcare_system.model.notification.Notification;
import com.huydev.healthcare_system.model.patient.Patient;
import com.huydev.healthcare_system.model.prescription.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {}

