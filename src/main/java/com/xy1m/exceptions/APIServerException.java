package com.xy1m.exceptions;

public class APIServerException extends APIException {

    public APIServerException(String cause) {
        super(cause);
    }

    public APIServerException(int responseCode) {
        super("Failed to perform API call with response code [%d], unknown cause.", responseCode);
    }
}
