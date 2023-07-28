package com.staffinsight.common.controller;


import com.staffinsight.common.service.CommonService;
import com.staffinsight.exception.ClassNotFoundException;
import com.staffinsight.payload.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/common")
@RequiredArgsConstructor
public class CommonController {

    private final CommonService commonService;

    @PostMapping("/usertypes")
    public ResponseEntity<ApiResponse<?>> registerUserTypes(@RequestBody List<String> userTypesString) {

        try {
            ApiResponse<?> response = commonService.registerUserType(userTypesString);
            return new ResponseEntity<>(response, CREATED);
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

    @PostMapping("/employmenttype")
    public ResponseEntity<ApiResponse<?>> registerEmploymentTypes(@RequestBody List<String> employmentTypesString) {

        try {
            ApiResponse<?> response = commonService.registerEmploymentType(employmentTypesString);
            return new ResponseEntity<>(response, CREATED);
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

    @PostMapping("/gender")
    public ResponseEntity<ApiResponse<?>> registerGender(@RequestBody List<String> genderString) {

        try {
            ApiResponse<?> response = commonService.registerGender(genderString);
            return new ResponseEntity<>(response, CREATED);
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

    @PostMapping("/maritalstatus")
    public ResponseEntity<ApiResponse<?>> registerMaritalStatus(@RequestBody List<String> maritalStatusString) {

        try {
            ApiResponse<?> response = commonService.registerMaritalStatus(maritalStatusString);
            return new ResponseEntity<>(response, CREATED);
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

    @PostMapping("/nameprefix")
    public ResponseEntity<ApiResponse<?>> registerNamePrefix(@RequestBody List<String> namePrefixString) {

        try {
            ApiResponse<?> response = commonService.registerNamePrefix(namePrefixString);
            return new ResponseEntity<>(response, CREATED);
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

    @GetMapping("/usertypes")
    public ResponseEntity<ApiResponse<?>> getUserTypes() throws ClassNotFoundException {

        try {
            ApiResponse<?> response = commonService.getUserTypes();
            return new ResponseEntity<>(response, OK);
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

    @GetMapping("/employmenttypes")
    public ResponseEntity<ApiResponse<?>> getEmploymentTypes() throws ClassNotFoundException {

        try {
            ApiResponse<?> response = commonService.getEmploymentTypes();
            return new ResponseEntity<>(response, OK);
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

    @GetMapping("/genders")
    public ResponseEntity<ApiResponse<?>> getGenders() throws ClassNotFoundException {

        try {
            ApiResponse<?> response = commonService.getGenders();
            return new ResponseEntity<>(response, OK);
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

    @GetMapping("/maritalstatuses")
    public ResponseEntity<ApiResponse<?>> getMaritalStatuses() throws ClassNotFoundException {

        try {
            ApiResponse<?> response = commonService.getMaritalStatuses();
            return new ResponseEntity<>(response, OK);
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

    @GetMapping("/nameprefixes")
    public ResponseEntity<ApiResponse<?>> getNamePrefixes() throws ClassNotFoundException {

        try {
            ApiResponse<?> response = commonService.getNamePrefixes();
            return new ResponseEntity<>(response, OK);
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
