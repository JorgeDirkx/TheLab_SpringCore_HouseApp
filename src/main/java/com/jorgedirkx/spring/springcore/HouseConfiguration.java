package com.jorgedirkx.spring.springcore;


import com.jorgedirkx.spring.springcore.services.CleaningService;
import com.jorgedirkx.spring.springcore.services.implementations.CleaningServiceImpl;
import com.jorgedirkx.spring.springcore.tools.implementations.Broom;
import com.jorgedirkx.spring.springcore.tools.implementations.VacuumCleaner;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class HouseConfiguration {

    @Bean(initMethod = "startmethode")
    public Broom broom(){
        return new Broom();
    }
    @Bean
    public VacuumCleaner vacuum(){
        return new VacuumCleaner();
    }


    @Bean
    @Lazy
    public CleaningService jill(Broom broom){
        return new CleaningServiceImpl(broom);
    }
    @Bean
    @Lazy
    public CleaningService jane(VacuumCleaner vacuum){
        return new CleaningServiceImpl(vacuum);
    }
    @Bean
    @Lazy
    public CleaningService richard(Broom broom){
        return new CleaningServiceImpl(broom);
    }


}
