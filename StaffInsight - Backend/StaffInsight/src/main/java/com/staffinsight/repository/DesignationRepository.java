package com.staffinsight.repository;

import com.staffinsight.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {

    @Query("SELECT d FROM Designation d WHERE d.isActive = true AND d.designation = :designation")
    Optional<Designation> findDesignationByName(@Param("designation") String designation);

    @Modifying
    @Query("UPDATE Designation d SET d.isActive = :isActive WHERE d.designationId = :designationId")
    int updateIsActiveById(@Param("isActive") Boolean isActive, @Param("designationId") Long designationId);

    @Query("SELECT d FROM Designation d WHERE d.isActive = true")
    List<Designation> findAllActiveDesignations();

    @Query("SELECT d FROM Designation d WHERE d.isActive = true AND d.designationId = :designationId")
    Optional<Designation> findDesignationById(@Param("designationId") Long designationId);
}