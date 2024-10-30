package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @GetMapping(value = "/toXml", produces = MediaType.APPLICATION_XML_VALUE)
    public String convertToXml(@RequestParam Long id, @RequestParam String name, @RequestParam int age) {
        Person person = new Person(id, name, age);
        return personService.convertToXml(person);
    }

    @PostMapping(value = "/fromXml", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person convertFromXml(@RequestBody String xml) {
        return personService.convertFromXml(xml);
    }
}
