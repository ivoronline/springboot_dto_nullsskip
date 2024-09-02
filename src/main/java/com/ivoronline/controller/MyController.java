package com.ivoronline.controller;

import com.ivoronline.dto.PersonDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //================================================================
  // HELLO
  //================================================================
  @RequestMapping("AddPerson")
  String addPerson(@RequestBody PersonDTO personDTO) {
    return personDTO.name + " is " + personDTO.age + " years old";
  }

}
