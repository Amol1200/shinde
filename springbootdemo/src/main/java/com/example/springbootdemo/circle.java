package com.example.springbootdemo;

import org.springframework.stereotype.Component;




@Component(value="c")
public class circle implements shape{

 public String showShape() {
// TODO Auto-generated method stub
return "It is circle in shape...";
}

}