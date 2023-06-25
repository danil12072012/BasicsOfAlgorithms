package com.example.basicsofalgorithms;

public class StorageIsFullExepton extends RuntimeException {
    public StorageIsFullExepton() {
    }

    public StorageIsFullExepton(String message) {
        super(message);
    }

    public StorageIsFullExepton(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullExepton(Throwable cause) {
        super(cause);
    }

    public StorageIsFullExepton(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
