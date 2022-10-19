package com.spinic.eshop.exceptions;

import org.apache.logging.log4j.util.Strings;

public class Error {

    private static final long serialVersionUID = 1L;

    /**
     * App error code, which is different from HTTP error code.
     */
    private String errorCode;

    /**
     * Short, human-readable summary of the problem
     */
    private String message;

    /**
     * HTTP status code.
     */
    private Integer status;

    /**
     * URL of request that produced the error.
     */
    private String url = "Not available";

    /**
     * Method of request that produced the error.
     */
    private String reqMethod = "Not available";

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReqMethod() {
        return reqMethod;
    }

    public Error setReqMethod(String method) {
        if (Strings.isNotBlank(method)) {
            this.reqMethod = method;
        }
        return this;
    }

}
