package com.server.restserver.service.impl;

import com.server.restserver.Exceptions.LessOrZeroException;
import com.server.restserver.service.TaxesCalculatorInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TaxesCalculatorService implements TaxesCalculatorInterface {

    @Transactional
    @Override
    public String calculateTaxes(String hp) {
        try {
            int a = Integer.parseInt(hp) * 30;
            if (a<=0) {
                throw new LessOrZeroException();
               }
            return ("Yor taxes pays per year for a vehicle with " + hp + " h.p. will be " + Integer.toString(a));
        } catch (LessOrZeroException e) {
            System.out.println ("Exception handled");
            return "You've entered a zero or a value less than zero";
        }
    }
}
//    private int hp;
//
//    public TaxesCalculatorService(String horsepower) {
//        this.hp = Integer.parseInt(horsepower);
//    }


