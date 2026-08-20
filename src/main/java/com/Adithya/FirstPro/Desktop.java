package com.Adithya.FirstPro;

import org.springframework.stereotype.Component;

@Component("desk")
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("desktop object created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling in desktop");
    }
}
