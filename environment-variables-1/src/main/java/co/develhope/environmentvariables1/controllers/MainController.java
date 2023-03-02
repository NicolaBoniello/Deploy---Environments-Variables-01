package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @Value("${myCustomProps.authCode}")
    private String authCode;

    @Value("${myCustomProps.devName}")
    private String devName;

    @GetMapping("/value/environments")
    public String greetings(){
        return "Hello " + devName + " ! Your auth code is " + authCode;
    }
}