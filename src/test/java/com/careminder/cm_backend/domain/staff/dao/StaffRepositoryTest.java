package com.careminder.cm_backend.domain.staff.dao;

import com.careminder.cm_backend.domain.staff.domain.Staff;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class StaffRepositoryTest {

    @Autowired
    StaffRepository staffRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() {
        Staff staff = new Staff();
        staff.setUserName("wjdalsdk70");
        Long savedId = staffRepository.save(staff);
        Staff findStaff = staffRepository.find(savedId);
        Assertions.assertThat(findStaff.getId()).isEqualTo(staff.getId());
        Assertions.assertThat(findStaff.getUserName()).isEqualTo(staff.getUserName());
        Assertions.assertThat(findStaff).isEqualTo(staff);
        }
}