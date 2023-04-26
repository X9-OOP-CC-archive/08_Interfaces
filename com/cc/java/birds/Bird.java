package com.cc.java.birds;

import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.Ifeathers;

public class Bird implements Flyable,Ifeathers{

   
    @Override
    public String fly() {
       return "I'm a bird, I can also fly!";
    }

    @Override
    public String hasFeathers() {
      return "I'm a bird, I have feathers!";
    }



    
}
