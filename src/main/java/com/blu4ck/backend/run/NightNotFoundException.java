package com.blu4ck.backend.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NightNotFoundException extends RuntimeException{
public NightNotFoundException(){
    super("Night Not Found");
}
}
