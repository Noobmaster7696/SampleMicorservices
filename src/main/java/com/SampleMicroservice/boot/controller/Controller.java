package com.SampleMicroservice.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
@RequestMapping(value="/getSample")
public String sample()
{
	return "Hello World !";
}
}
