package com.staffinsight.controller;

import com.staffinsight.payload.ApiResponse;
import com.staffinsight.payload.DesignationReq;
import com.staffinsight.service.Impl.DesignationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("designations")
@RequiredArgsConstructor
public class DesignationController {

    private final DesignationServiceImpl designationService;

    @PostMapping
    public ResponseEntity<ApiResponse<?>> createDesignationHandler(@RequestBody DesignationReq designationReq) {

        try {
            ApiResponse<?> response = designationService.createDesignation(designationReq);
            return ResponseEntity.ok(response);
        } catch (Exception exception) {
            // Handle any exceptions and return an error response
            return new ResponseEntity<>(
                    ApiResponse.builder()
                            .status(2)
                            .message(exception.getMessage())
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }

    }

    @PutMapping("/{designationId}")
    public ResponseEntity<ApiResponse<?>> updateDesignationHandler(
            @RequestBody DesignationReq designationReq,
            @PathVariable Long designationId) {

        try {
            ApiResponse<?> response = designationService.updateDesignation(designationReq, designationId);
            return ResponseEntity.ok(response);
        } catch (Exception exception) {
            // Handle any exceptions and return an error response
            return new ResponseEntity<>(
                    ApiResponse.builder()
                            .status(2)
                            .message(exception.getMessage())
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/{designationId}")
    public ResponseEntity<ApiResponse<?>> viewDesignationHandler(@PathVariable Long designationId) {

        try {
            ApiResponse<?> response = designationService.viewDesignation(designationId);
            return ResponseEntity.ok(response);
        } catch (Exception exception) {
            // Handle any exceptions and return an error response
            return new ResponseEntity<>(
                    ApiResponse.builder()
                            .status(2)
                            .message(exception.getMessage())
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping("/{designationId}")
    public ResponseEntity<ApiResponse<?>> removeDesignationHandler(@PathVariable Long designationId) {

        try {
            ApiResponse<?> response = designationService.removeDesignation(designationId);
            return ResponseEntity.ok(response);
        } catch (Exception exception) {
            // Handle any exceptions and return an error response
            return new ResponseEntity<>(
                    ApiResponse.builder()
                            .status(2)
                            .message(exception.getMessage())
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping
    public ResponseEntity<ApiResponse<?>> viewAllDesignationsHandler() {

        try {
            ApiResponse<?> response = designationService.viewAllDesignations();
            return ResponseEntity.ok(response);
        } catch (Exception exception) {
            // Handle any exceptions and return an error response
            return new ResponseEntity<>(
                    ApiResponse.builder()
                            .status(2)
                            .message(exception.getMessage())
                            .build(),
                    HttpStatus.BAD_REQUEST);
        }
    }
}

