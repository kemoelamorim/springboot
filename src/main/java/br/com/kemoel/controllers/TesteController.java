package br.com.kemoel.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TesteController {
  
  @RequestMapping(value="/")
  public String getName() {
      return "Kemoel";
  }
  
}
