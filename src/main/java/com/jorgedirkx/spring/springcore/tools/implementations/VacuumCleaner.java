package com.jorgedirkx.spring.springcore.tools.implementations;

import com.jorgedirkx.spring.springcore.tools.CleaningTool;

public class VacuumCleaner implements CleaningTool {
    public VacuumCleaner() {
        System.out.println("constructing a vacuumcleaner bean");

    }

    @Override
    public void doCleanJob() {
        System.out.println("Wuuuuuuum");
    }
}
