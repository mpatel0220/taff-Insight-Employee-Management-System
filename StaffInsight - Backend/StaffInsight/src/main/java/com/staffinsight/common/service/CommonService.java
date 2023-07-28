package com.staffinsight.common.service;
import com.staffinsight.exception.ClassNotFoundException;
import com.staffinsight.payload.ApiResponse;

import java.util.List;
public interface CommonService {

    ApiResponse<?> registerUserType(List<String> userTypeStrings);

    ApiResponse<?> registerEmploymentType(List<String> employmentTypeStrings);

    ApiResponse<?> registerGender(List<String> genderStrings);

    ApiResponse<?> registerNamePrefix(List<String> namePrefixStrings);

    ApiResponse<?> registerMaritalStatus(List<String> maritalStatusStrings);

    ApiResponse<?> getEmploymentTypes() throws ClassNotFoundException;

    ApiResponse<?> getUserTypes() throws ClassNotFoundException;

    ApiResponse<?> getGenders() throws ClassNotFoundException;

    ApiResponse<?> getNamePrefixes() throws ClassNotFoundException;

    ApiResponse<?> getMaritalStatuses() throws ClassNotFoundException;

}
