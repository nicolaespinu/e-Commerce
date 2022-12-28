package com.spinic.eshop.exceptions;

public class ErrorUtils {

    public ErrorUtils() {
    }

    /**
     * Creates and returns an error object.
     *
     * @param errMsgKey
     * @param errCode
     * @param httpStatusCode
     * @param url
     * @return error
     */
    public static Error createError(
            final String errMsgKey,
            final String errCode,
            final Integer httpStatusCode,
            final String url) {
        Error error = new Error();
        error.setMessage(errMsgKey);
        error.setErrorCode(errCode);
        error.setStatus(httpStatusCode);
        error.setUrl(url);
        return error;
    }
}
