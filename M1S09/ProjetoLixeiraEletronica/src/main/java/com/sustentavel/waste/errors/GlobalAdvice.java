package com.sustentavel.waste.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sustentavel.waste.dtos.errors.ErrorResponseDto;
import com.sustentavel.waste.errors.exceptions.NotFoundException;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;


@ControllerAdvice
public class GlobalAdvice {// EX2: Criar tratamento de exceções
@ExceptionHandler(NoSuchElementException.class)


    public ResponseEntity<ErrorResponseDto> handleNoSuchElementException(NoSuchElementException e) { 
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponseDto(
                "404",
                "Recurso não encontrado",
                e.getCause() != null ? e.getCause().getMessage() : null,
                e.getClass().getSimpleName()
        ));
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleNotFoundException(NotFoundException e) { 
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponseDto(
                "404",
                e.getMessage(),
                e.getCause() != null ? e.getCause().getMessage() : null,
                e.getClass().getSimpleName()
        ));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDto> handleValidationException(MethodArgumentNotValidException e) { 
        String message = e.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .collect(Collectors.joining(", "));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponseDto(
                "400",
                message,
                null,
                e.getClass().getSimpleName()
        ));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGenericException(Exception e) { // EX3: Tratar exceções genéricas
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponseDto(
                "500",
                "Erro interno no servidor",
                e.getCause() != null ? e.getCause().getMessage() : null,
                e.getClass().getSimpleName()
        ));
        }

}