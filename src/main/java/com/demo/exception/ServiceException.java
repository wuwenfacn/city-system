package com.demo.exception;




import com.demo.commons.StatusCode;
import lombok.Data;

/**
 *
 */
@Data
public class ServiceException extends BaseException {

    public ServiceException(StatusCode statusCode) {
        super(statusCode);
    }
}
