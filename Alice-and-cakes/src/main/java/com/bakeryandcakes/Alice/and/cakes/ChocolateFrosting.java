package com.bakeryandcakes.Alice.and.cakes;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frostingtype", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    public String getFrostingType(){
        return "Chocolate frosting";
    }
}
