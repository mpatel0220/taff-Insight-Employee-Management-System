package com.staffinsight.common.service.impl;

import com.staffinsight.common.entity.*;
import com.staffinsight.common.payload.*;
import com.staffinsight.common.repository.*;
import com.staffinsight.common.service.CommonService;
import com.staffinsight.exception.ClassNotFoundException;
import com.staffinsight.payload.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CommonServiceImpl implements CommonService {

    private final UserTypeRepository userTypeRepository;
    private final EmploymentTypeRepository employmentTypeRepository;
    private final GenderRepository genderRepository;
    private final NamePrefixRepository namePrefixRepository;
    private final MaritalStatusRepository maritalStatusRepository;

    @Override
    public ApiResponse<?> registerUserType(List<String> userTypesString) {
        List<UserType> userTypeList = userTypesString.stream().map(UserType::new).toList();

        List<UserType> userTypes = userTypeRepository.saveAll(userTypeList);

        return ApiResponse.builder()
                .status(1)
                .data(userTypes)
                .build();
    }

    @Override
    public ApiResponse<?> registerEmploymentType(List<String> employmentTypeStrings) {
        List<EmploymentType> employmentTypeList = employmentTypeStrings.stream().map(EmploymentType::new).toList();

        List<EmploymentType> employmentTypes = employmentTypeRepository.saveAll(employmentTypeList);

        return ApiResponse.builder()
                .status(1)
                .data(employmentTypes)
                .build();
    }

    @Override
    public ApiResponse<?> registerGender(List<String> genderStrings) {
        List<Gender> genderList = genderStrings.stream().map(Gender::new).toList();

        List<Gender> genders = genderRepository.saveAll(genderList);

        return ApiResponse.builder()
                .status(1)
                .data(genders)
                .build();
    }

    @Override
    public ApiResponse<?> registerNamePrefix(List<String> namePrefixStrings) {
        List<NamePrefix> namePrefixList = namePrefixStrings.stream().map(NamePrefix::new).toList();

        List<NamePrefix> namePrefixes = namePrefixRepository.saveAll(namePrefixList);

        return ApiResponse.builder()
                .status(1)
                .data(namePrefixes)
                .build();
    }

    @Override
    public ApiResponse<?> registerMaritalStatus(List<String> maritalStatusStrings) {
        List<MaritalStatus> maritalStatusList = maritalStatusStrings.stream().map(MaritalStatus::new).toList();

        List<MaritalStatus> maritalStatuses = maritalStatusRepository.saveAll(maritalStatusList);

        return ApiResponse.builder()
                .status(1)
                .data(maritalStatuses)
                .build();
    }

    @Override
    public ApiResponse<?> getEmploymentTypes() throws ClassNotFoundException {
        List<EmploymentTypeDto> employmentTypes = employmentTypeRepository.findAllActiveEmploymentTypes();

        if (employmentTypes.isEmpty()) throw new ClassNotFoundException("Employment types not found");

        return ApiResponse.builder()
                .status(1)
                .data(employmentTypes)
                .build();
    }

    @Override
    public ApiResponse<?> getUserTypes() throws ClassNotFoundException {
        List<UserTypeDto> userTypes = userTypeRepository.findAllActiveUserTypes();

        if (userTypes.isEmpty()) throw new ClassNotFoundException("User types not found");

        return ApiResponse.builder()
                .status(1)
                .data(userTypes)
                .build();
    }

    @Override
    public ApiResponse<?> getGenders() throws ClassNotFoundException {
        List<GenderDto> genders = genderRepository.findAllActiveGenders();

        if (genders.isEmpty()) throw new ClassNotFoundException("Genders not found");

        return ApiResponse.builder()
                .status(1)
                .data(genders)
                .build();
    }

    @Override
    public ApiResponse<?> getNamePrefixes() throws ClassNotFoundException {
        List<NamePrefixDto> namePrefixes = namePrefixRepository.findAllActiveNamePrefixes();

        if (namePrefixes.isEmpty()) throw new ClassNotFoundException("Name prefixes not found");

        return ApiResponse.builder()
                .status(1)
                .data(namePrefixes)
                .build();
    }

    @Override
    public ApiResponse<?> getMaritalStatuses() throws ClassNotFoundException {
        List<MaritalStatusDto> maritalStatus = maritalStatusRepository.findAllActiveMaritalStatus();

        if (maritalStatus.isEmpty()) throw new ClassNotFoundException("Marital status not found");

        return ApiResponse.builder()
                .status(1)
                .data(maritalStatus)
                .build();
    }

}
