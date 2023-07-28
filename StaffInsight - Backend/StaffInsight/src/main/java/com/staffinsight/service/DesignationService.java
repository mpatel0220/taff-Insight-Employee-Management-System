package com.staffinsight.service;

import com.staffinsight.exception.ClassNotFoundException;
import com.staffinsight.exception.EntityExistsException;
import com.staffinsight.payload.ApiResponse;
import com.staffinsight.payload.DesignationReq;

public interface DesignationService {

    ApiResponse<?> createDesignation(DesignationReq designationReq) throws EntityExistsException;

    ApiResponse<?> updateDesignation(DesignationReq designationReq, Long designationId) throws ClassNotFoundException, EntityExistsException;

    ApiResponse<?> viewDesignation(Long designationId) throws ClassNotFoundException;

    ApiResponse<?> removeDesignation(Long designationId) throws ClassNotFoundException;

    ApiResponse<?> viewAllDesignations() throws ClassNotFoundException;

}
