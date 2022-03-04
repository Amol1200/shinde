package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/controller2")

public class demo2 {


@GetMapping("/test5")
public String test5() {
return "response from test5";
}
@GetMapping("/test6")
public String test6() {
return "response from test6";
}




}