package com.example.springboot;

import org.openapitools.api.DefaultApiController;
import org.openapitools.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MyApiController extends DefaultApiController {

    public MyApiController(NativeWebRequest request) {
        super(request);
    }

    @ApiOperation(value = "", nickname = "rootGet", notes = "", response = Pet.class, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Pet.class) })
    @RequestMapping(value = "/", produces = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<Pet> rootGet() {
        val pet = new Pet()
                .name("pochi")
                .age(2);
        return new ResponseEntity<>(pet, HttpStatus.OK);
    }
}
