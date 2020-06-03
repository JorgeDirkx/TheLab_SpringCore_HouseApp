package com.jorgedirkx.spring.springcore.tools.implementations;

import com.jorgedirkx.spring.springcore.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("outsideTool")
public class GardenHose implements GardeningTool {
    @Override
    public void doGardenJob() {
        System.out.println("swswswswswswwswswswswsw");
    }
}
