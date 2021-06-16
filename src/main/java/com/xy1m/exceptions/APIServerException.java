package com.xy1m.exceptions;

import com.xy1m.model.APIError;

public class APIServerException extends APIException {

    public APIServerException(Throwable cause) {
        super(cause, "Failed to perform API call with exception.");
    }

    public APIServerException(int responseCode, APIError error) {
        super(error, "Failed to perform API call with response code [%d], unknown cause.", responseCode);
    }

}
