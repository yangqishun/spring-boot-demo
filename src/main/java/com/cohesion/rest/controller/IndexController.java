package com.cohesion.rest.controller;

import com.cohesion.rest.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.io.PipedReader;
import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Value(value = "${cohesion.secret}")
    private String secret;

    @Value(value = "${cohesion.number}")
    private int number;

    @Value(value = "${cohesion.desc}")
    private String desc;

    @Value(value = "${server.port}")
    private String port;


    @RequestMapping
    public String index(){
        return "hello world";
    }

    @RequestMapping(value = "/get/{name}")
    public HashMap<String, Object> get(@PathVariable String name){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("value", "hello world");
        map.put("secret", secret);
        map.put("number", number);
        map.put("desc", desc);
        map.put("port", port);
        return map;
    }



    @RequestMapping(value = "/find/{id}/{name}")
    public User get(@PathVariable int id, @PathVariable String name){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setDate(new Date());
        System.out.println(new Date());
        return user;
    }
}
