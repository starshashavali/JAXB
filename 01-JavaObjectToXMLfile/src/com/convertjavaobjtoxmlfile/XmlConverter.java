package com.convertjavaobjtoxmlfile;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;

public class XmlConverter {
    
    // Convert Java object to XML file
    public static void objectToXml(Object object, String filename) throws FileNotFoundException {
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)));
        encoder.writeObject(object);
        encoder.close();
    }
    
    // Convert XML file to Java object
    public static Object xmlToObject(String filename) throws FileNotFoundException {
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)));
        Object object = decoder.readObject();
        decoder.close();
        return object;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        // Example usage: convert a Person object to XML and back again
        
        Person person = new Person("John", "Doe", 30);
        
        // Convert Java object to XML file
        objectToXml(person, "person.xml");
        
        // Convert XML file to Java object
        Person person2 = (Person) xmlToObject("person.xml");
        
        System.out.println(person2.getFirstName()); // John
        System.out.println(person2.getLastName()); // Doe
        System.out.println(person2.getAge()); // 30
        
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    // Getters and setters
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

