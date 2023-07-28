package com.staffinsight.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EntityExistsException extends Exception {

    public EntityExistsException(String message) {
        super(message);
    }

}
