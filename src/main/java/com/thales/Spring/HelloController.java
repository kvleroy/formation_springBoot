package com.thales.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/HelloWorld")
public class HelloController {

  @ResponseBody
  @GetMapping
  public String getHello() {
    return "Bonjour!";
  }