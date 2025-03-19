package com.bakeryandcakes.Alice.and.cakes;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syruptype", havingValue = "chocolate")
public class ChocolateSyrup implements  Syrup {
    public String getSyrupType(){
        return "Chocolate Syrup";
    }
}
