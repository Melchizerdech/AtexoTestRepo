package com.example.springpack.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloReadMe()
    {
        return "Greeting this is the readme, the working url are as follow : " +
                "/showHand will show an unsorted 10 cards hand " +
                "/sortedHand will show the same 10 cards hand sorted depending on a strength order defined " +
                "the first time showHand was called " +
                "/reset will create a new strength order.";
    }
}
