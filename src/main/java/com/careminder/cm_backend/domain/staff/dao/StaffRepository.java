package com.careminder.cm_backend.domain.staff.dao;

import com.careminder.cm_backend.domain.staff.domain.Staff;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class StaffRepository {

    @PersistenceContext
    EntityManager em;

    public Long save(Staff staff){
        em.persist(staff);
        return staff.getId();
    }

    public Staff find(Long id){
        return em.find(Staff.class,id);
    }

}
