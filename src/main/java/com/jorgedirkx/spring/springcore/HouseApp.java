package com.jorgedirkx.spring.springcore;

import com.jorgedirkx.spring.springcore.services.GardeningService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {

    public static void main(String[] args) {
        //try with resources
        try(ConfigurableApplicationContext applicationContext =
                //de spring container:
                new AnnotationConfigApplicationContext(HouseConfiguration.class)){

            //get a bean out of the container, use:
            //if you would run the class now output would be: ....
            //{CleaningTool cleaningTool= applicationContext.getBean(s:"broom", CleaningTool.class);

            //get a bean out of the container, use:
            applicationContext.getBean(GardeningService.class).garden();
            //applicationContext.getBean( "jil", CleaningService.class);

        }
        catch (Exception ex){
            ex.printStackTrace();
        }




    }

}
