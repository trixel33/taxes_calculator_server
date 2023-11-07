package com.server.restserver.service.impl;

import com.server.restserver.Exceptions.LessOrZeroException;
import com.server.restserver.service.SimpleHorsePowerProvider;
import org.springframework.stereotype.Service;

@Service
public class SimpleHorsePowerProviderService implements SimpleHorsePowerProvider {
    @Override
    public String provideHorsePower(String horsepower) {


        try {
            int hp = Integer.parseInt(horsepower);
            if (hp > 250) {
                return ("Your vehicle has " + horsepower + " horse powers. You'll have to pay big taxes.");
            } else if (hp<=0) {
                throw new LessOrZeroException();
//                Exception ex1 = new LessOrZeroException();
//                return  (((LessOrZeroException) ex1).message());
            }
            else {
                return ("Your vehicle has " + horsepower + " horse powers. Your taxes will be normal.");
            }
        } catch (LessOrZeroException ex1) {
            return (ex1.message());
        }
    }
}