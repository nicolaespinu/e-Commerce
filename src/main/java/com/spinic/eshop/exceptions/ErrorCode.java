package com.spinic.eshop.exceptions;


public enum ErrorCode {
    GENERIC_ERROR(
            "spinic-0001", "The system is unable to complete the request. Contact system support."),
    HTTP_MEDIATYPE_NOT_SUPPORTED(
            "spinic-0002", "Requested media type is not supported. Please use application/json or application/xml as 'Content-Type' header value"),
    HTTP_MESSAGE_NOT_WRITABLE(
            "spinic-0003", "Missing 'Accept' header. Please add 'Accept' header."),
    HTTP_MESSAGE_NOT_ACCEPTABLE(
            "spinic-0004", "Request 'Accept' header value is not supported. Please use application/xml or application/json as 'Accept' value."),
    JSON_PARSE_ERROR(
            "spinic-0005", "Make sure request payload should be a valid JSON object."),
    HTTP_MESSAGE_NOT_READABLE(
            "spinic-0006", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type'."),
    UNSUPPORTED_MEDIA_TYPE(
            "spinic-0007", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type' Unsupported Media Type"),
    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE(
            "spinic-0008", "Request 'Accept' header value is not supported. Please use application/xml or application/json as 'Accept' value.");

    private String errCode;
    private String errMsgKey;

    ErrorCode(final String errCode, final String errMsgKey) {
        this.errCode = errCode;
        this.errMsgKey = errMsgKey;
    }

    /**
     * @return the errCode
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * @return the errMsgKey
     */
    public String getErrMsgKey() {
        return errMsgKey;
    }
}
