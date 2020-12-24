package com.mqtt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.mqtt.models.Family;


@RestController
@RequestMapping("/myservice")
public class JsonController {

    @GetMapping("/family/{familyId}")
    public Family retrieveFamily(@PathVariable long familyId) {

        Family aFamily = new Family(10, "12 Close", "London", "Smith");
        return aFamily;
    }



}




