package com.staffinsight.common.repository;

import com.staffinsight.common.entity.UserType;
import com.staffinsight.common.payload.UserTypeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {

    @Query("SELECT NEW com.staffinsight.common.payload.UserTypeDto(u.userTypeId,u.userType) FROM UserType u WHERE u.isActive = true")
    List<UserTypeDto> findAllActiveUserTypes();


}