package com.staffinsight.service.Impl;

import com.staffinsight.entity.Designation;
import com.staffinsight.exception.ClassNotFoundException;
import com.staffinsight.exception.EntityExistsException;
import com.staffinsight.payload.ApiResponse;
import com.staffinsight.payload.DesignationReq;
import com.staffinsight.payload.DesignationRes;
import com.staffinsight.repository.DesignationRepository;
import com.staffinsight.service.DesignationService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DesignationServiceImpl implements DesignationService {

    private final DesignationRepository designationRepository;

    @Transactional
    @Override
    public ApiResponse<?> createDesignation(DesignationReq designationReq) throws EntityExistsException {

        // Checking if designation value already exists or not
        if (designationRepository.findDesignationByName(designationReq.getDesignation()).isPresent())
            throw new EntityExistsException("Designation value already exists");

        // Creating Designation object
        Designation designation = Designation.builder()
                .designation(designationReq.getDesignation())
                .createdOn(LocalDateTime.now())
                .isActive(true)
                .build();

        // Saving designation in db
        designationRepository.save(designation);

        return ApiResponse.builder()
                .status(1)
                .message("Designation saved Successfully")
                .build();
    }

    @Transactional
    @Override
    public ApiResponse<?> updateDesignation(DesignationReq designationReq, Long designationId) throws ClassNotFoundException, EntityExistsException {

        // Checking if designation exists or not
        if (designationRepository.findDesignationById(designationId).isEmpty())
            throw new ClassNotFoundException("Designation does not exists");

        // Checking if designation value already exists or not
        if (designationRepository.findDesignationByName(designationReq.getDesignation()).isPresent())
            throw new EntityExistsException("Designation value already exists");

        // Setting isActive false for existing Designation
        designationRepository.updateIsActiveById(false, designationId);

        // Creating Designation object
        Designation designation = Designation.builder()
                .designation(designationReq.getDesignation())
                .createdOn(LocalDateTime.now())
                .isActive(true)
                .build();

        // Saving designation in db
        designationRepository.save(designation);

        return ApiResponse.builder()
                .status(1)
                .message("Designation updated Successfully")
                .build();
    }

    @Override
    public ApiResponse<?> viewDesignation(Long designationId) throws ClassNotFoundException {

        // Checking if designation exists or not
        Designation designation = designationRepository.findDesignationById(designationId)
                .orElseThrow(() -> new ClassNotFoundException("Designation not found"));

        // Creating DesignationReq object based on existing designation
        DesignationRes designationReq = DesignationRes.builder()
                .designationId(designation.getDesignationId())
                .designation(designation.getDesignation())
                .createdOn(designation.getCreatedOn())
                .build();

        return ApiResponse.builder()
                .status(1)
                .data(designationReq)
                .build();
    }

    @Transactional
    @Override
    public ApiResponse<?> removeDesignation(Long designationId) throws ClassNotFoundException {

        // Checking if designation exists or not
        Designation designation = designationRepository.findDesignationById(designationId)
                .orElseThrow(() -> new ClassNotFoundException("Designation not found"));

        // Setting isActive false for existing Designation
        designationRepository.updateIsActiveById(false, designation.getDesignationId());

        return ApiResponse.builder()
                .status(1)
                .message("Designation removed Successfully")
                .build();

    }

    @Override
    public ApiResponse<?> viewAllDesignations() throws ClassNotFoundException {

        // Checking if designations exists or not
        List<Designation> designationList = designationRepository.findAllActiveDesignations();
        if (designationList.isEmpty())
            throw new ClassNotFoundException("Designations not found");

        // Converting designation list to designation req list
        List<DesignationRes> designationResList = designationList.stream().map(DesignationRes::new).toList();

        return ApiResponse.builder()
                .status(1)
                .data(designationResList)
                .build();
    }

}
