package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController // open gate

public class Controller {


    @GetMapping("/name")
    public String name(){
        return "My name is fahad ";
    }
    @GetMapping("/age")
    public Integer age(){
        return 25;
    }

    @GetMapping("/check")
    public String checkStatus(){
        return "EveryThing ok";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> names(){
        ArrayList<String>names = new ArrayList<>();
        names.add("Fahad");
        names.add("Abdullah");
        names.add("Sara");
        names.add("Ali");

        return names;
    }


}
