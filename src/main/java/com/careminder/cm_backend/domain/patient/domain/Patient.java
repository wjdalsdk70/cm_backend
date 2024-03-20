package com.careminder.cm_backend.domain.patient.domain;

import com.careminder.cm_backend.domain.staff.domain.Role;
import com.careminder.cm_backend.domain.staff.domain.Staff;
import com.careminder.cm_backend.domain.staff.domain.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Staff staff;

    private String firstName;
    private String secondName;
    private Severity severity;
    private MedicalProgress medicalProgress;
    private Integer age;
}
