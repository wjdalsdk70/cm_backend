package com.careminder.cm_backend.domain.staff.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Staff {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;
//    private String password;
//    private String firstName;
//    private String secondName;

    @Enumerated(EnumType.STRING)
    private Role role; //Careworker, Patient

    @Enumerated(EnumType.STRING)
    private Type type; //Helper, Nurse, Doctor
    private String nfc;

}
