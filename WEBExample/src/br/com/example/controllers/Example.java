package br.com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Example {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        String message = "<br><h1>Hello World<h1><br>";
        return new ModelAndView("welcome", "message", message);
    }
}