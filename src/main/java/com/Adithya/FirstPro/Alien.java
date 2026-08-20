package com.Adithya.FirstPro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void print(){
        System.out.println("Alien Stuff");
        laptop.laptop();
    }
}
