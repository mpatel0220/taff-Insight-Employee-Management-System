package com.staffinsight.common.repository;

import com.staffinsight.common.entity.Gender;
import com.staffinsight.common.payload.GenderDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Long> {

    @Query("SELECT NEW com.staffinsight.common.payload.GenderDto(g.genderId,g.gender) FROM Gender g WHERE g.isActive = true")
    List<GenderDto> findAllActiveGenders();

}