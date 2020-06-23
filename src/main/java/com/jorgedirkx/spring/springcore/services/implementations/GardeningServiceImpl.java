package com.jorgedirkx.spring.springcore.services.implementations;

import com.jorgedirkx.spring.springcore.services.GardeningService;
import com.jorgedirkx.spring.springcore.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//annotation statement ? Spring will be activated
@Component
public class GardeningServiceImpl implements GardeningService {

    private final GardeningTool tool;

    //setting an actual tool; GardeningTool from the container
    @Autowired
    public GardeningServiceImpl(@Qualifier("outsideTool") GardeningTool tool) {
        this.tool = tool;
    }

    @Override
    public void garden() {
        System.out.println("start gardening");
        tool.doGardenJob();
    }
}
