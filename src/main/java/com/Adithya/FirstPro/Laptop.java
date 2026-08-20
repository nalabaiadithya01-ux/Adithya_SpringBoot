package com.Adithya.FirstPro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    CPU cpu;

    public void laptop(){
        System.out.println("Apple laptop");
        cpu.cpu();
    }
}
