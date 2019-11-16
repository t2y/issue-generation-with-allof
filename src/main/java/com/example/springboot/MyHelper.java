package com.example.springboot;

import org.openapitools.model.Pet;
import org.springframework.stereotype.Component;

@Component
public class MyHelper {

    public Pet setNameAndAge(Pet pet) {
        return pet.name("kuro").age(1);
    }
}
