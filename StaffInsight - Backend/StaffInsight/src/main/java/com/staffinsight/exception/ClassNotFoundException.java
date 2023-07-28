package com.staffinsight.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ClassNotFoundException extends Exception {

    public ClassNotFoundException(String message) {
        super(message);
    }

}
