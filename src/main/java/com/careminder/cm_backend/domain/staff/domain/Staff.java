package com.careminder.cm_backend.domain.staff.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Staff {

    @Id @GeneratedValue
    private Long id;

    private String userName;
    private String password;
    private String firstName;
    private String secondName;
    private Role role; //Careworker, Patient
    private Type type; //Helper, Nurse, Doctor
    private String nfc;



}
