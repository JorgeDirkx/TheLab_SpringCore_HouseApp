package com.jorgedirkx.spring.springcore.tools.implementations;

import com.jorgedirkx.spring.springcore.tools.CleaningTool;
import org.springframework.beans.factory.annotation.Value;

public class Broom implements CleaningTool {


    private String brandName;
    private int broomLength;
    public int getBroomLength() {
        return broomLength;
    }
    @Value("#{160}")
    public void setBroomLength(int broomLength) {
        this.broomLength = broomLength;
    }



    public String getBrandName() {
        return brandName;
    }

    @Value("#{'sweeper'}")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Broom() {
        System.out.println("constructing a broom bean");
    }

    public void startmethode(){
        System.out.println("Broom readying to go");
    }

    public void doCleanJob(){
        System.out.println("broomerdebroom");
    }

}
