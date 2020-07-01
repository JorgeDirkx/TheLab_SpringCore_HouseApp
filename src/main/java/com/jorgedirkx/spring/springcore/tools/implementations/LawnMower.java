package com.jorgedirkx.spring.springcore.tools.implementations;

import com.jorgedirkx.spring.springcore.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//communicating with Spring; make a bean out of this class. Scan for components in HouseConfiguration ?
//add @ComponentScan in public class Houseconfiguration OR use @bean as stated in HouseConfiguration.
//make a LawnMower bean and put in container
@Component
//
@Primary
@Qualifier("outsideTool")
public class LawnMower implements GardeningTool {

    @Override
    public void doGardenJob() {
        System.out.println("mowowowowowowowow");
    }
}
