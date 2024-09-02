package com.ivoronline.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class PersonDTO {

  //PROPERTIES
  @JsonSetter(nulls = Nulls.SKIP)
  public String  name = "Unknown";
  public Integer age;
  
}
