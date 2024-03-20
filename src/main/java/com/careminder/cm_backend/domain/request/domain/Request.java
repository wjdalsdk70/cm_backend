package com.careminder.cm_backend.domain.request.domain;

import com.careminder.cm_backend.domain.staff.domain.Staff;
import com.careminder.cm_backend.domain.tablet.domain.Tablet;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Entity
@Data
public class Request {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "staff")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "tablet")
    private Tablet tablet;

    private State state;
    private Boolean isQuestion;
    private String text;
//    private recording 음성 기록
    private Date createAt;
//    response
//    private Time responseTime;

}
