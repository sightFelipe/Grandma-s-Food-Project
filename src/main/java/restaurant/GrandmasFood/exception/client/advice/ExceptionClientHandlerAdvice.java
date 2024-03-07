package restaurant.GrandmasFood.exception.client.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restaurant.GrandmasFood.exception.ErrorInfo;
import restaurant.GrandmasFood.exception.IErrorCode;
import restaurant.GrandmasFood.exception.client.NotFoundException;

import java.time.LocalDateTime;
@RestControllerAdvice
public class ExceptionClientHandlerAdvice {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorInfo> notFoundInfoResponse(NotFoundException ex) {
        ErrorInfo notFoundInfo = new ErrorInfo(IErrorCode.NOT_FOUND_CODE_ERROR, LocalDateTime.now(), ex.getMessage(), ex.getClass().getSimpleName());
        return new ResponseEntity<>(notFoundInfo, HttpStatus.NOT_FOUND);
    }

}
