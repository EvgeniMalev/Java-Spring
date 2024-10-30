package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

@Service
public class PersonService {

    @Autowired
    private Jaxb2Marshaller marshaller;

    public String convertToXml(Person person) {
        try {
            StringWriter writer = new StringWriter();
            marshaller.marshal(person, new StreamResult(writer));
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error converting to XML", e);
        }
    }

    public Person convertFromXml(String xml) {
        try {
            return (Person) marshaller.unmarshal(new StreamSource(new StringReader(xml)));
        } catch (Exception e) {
            throw new RuntimeException("Error converting from XML", e);
        }
    }
}
