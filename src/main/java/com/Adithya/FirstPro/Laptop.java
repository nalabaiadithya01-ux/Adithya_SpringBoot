package com.Adithya.FirstPro;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{

    public Laptop(){
        System.out.println("laptop object created");
    }

    @Override
    public void compile(){
        System.out.println("compiling in laptop");
    }
}
