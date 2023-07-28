package com.staffinsight.common.repository;

import com.staffinsight.common.entity.NamePrefix;
import com.staffinsight.common.payload.NamePrefixDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NamePrefixRepository extends JpaRepository<NamePrefix, Long> {

    @Query("SELECT NEW com.staffinsight.common.payload.NamePrefixDto(n.namePrefixId,n.namePrefix) FROM NamePrefix n WHERE n.isActive = true")
    List<NamePrefixDto> findAllActiveNamePrefixes();

}