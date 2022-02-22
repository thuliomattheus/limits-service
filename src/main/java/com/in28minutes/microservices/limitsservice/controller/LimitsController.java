package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.config.Configuration;
import com.in28minutes.microservices.limitsservice.entity.Limits;

@RestController
@RequestMapping("/limits")
public class LimitsController {

  /*
  @Value("${limits-service.minimum}")
  private int minimumLimit;

  @Value("${limits-service.maximum}")
  private int maximumLimit;
  */

  @Autowired
  private Configuration config;

  @GetMapping
  public Limits retrieveLimits() {
    return new Limits(config.getMinimum(), config.getMaximum());
  }
}
