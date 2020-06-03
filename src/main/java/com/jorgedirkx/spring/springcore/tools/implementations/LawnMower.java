package com.jorgedirkx.spring.springcore.tools.implementations;

import com.jorgedirkx.spring.springcore.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("outsideTool")
public class LawnMower implements GardeningTool {

    @Override
    public void doGardenJob() {
        System.out.println("mowowowowowowowow");
    }
}
