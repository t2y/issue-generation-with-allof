package com.example.springboot;

import org.openapitools.api.PetApiController;
import org.openapitools.model.Cat;
import org.openapitools.model.Dog;
import org.openapitools.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MyPetController extends PetApiController {

    @Autowired
    private MyHelper helper;

    public MyPetController(NativeWebRequest request) {
        super(request);
    }

    @ApiOperation(value = "", nickname = "petCatGet", notes = "", response = Cat.class, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Cat.class) })
    @RequestMapping(value = "/pet/cat", produces = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<Cat> petCatGet() {
        val cat = new Cat();
        helper.setNameAndAge(cat);
        cat.house("myhome");
        return new ResponseEntity<>(cat, HttpStatus.OK);
    }

    @ApiOperation(value = "", nickname = "petDogGet", notes = "", response = Dog.class, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Dog.class) })
    @RequestMapping(value = "/pet/dog", produces = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<Dog> petDogGet() {
        val dog = new Dog();
        helper.setNameAndAge(dog);
        dog.bark("bowwow");
        return new ResponseEntity<>(dog, HttpStatus.OK);
    }

    @ApiOperation(value = "", nickname = "petGet", notes = "", response = Pet.class, tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Pet.class) })
    @RequestMapping(value = "/pet", produces = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<Pet> petGet() {
        val pet = new Pet();
        helper.setNameAndAge(pet);
        return new ResponseEntity<>(pet, HttpStatus.OK);
    }
}