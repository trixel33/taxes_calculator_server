package com.server.restserver.rest_controller;

import com.server.restserver.service.impl.TaxesCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("calculate_taxes/")
public class CalculateTaxesController {
    TaxesCalculatorService taxesCalculatorService;

    @Autowired
    public CalculateTaxesController (TaxesCalculatorService taxesCalculatorService){
        this.taxesCalculatorService = taxesCalculatorService;
    }

    @GetMapping ("{hp}")
    public String calculateTaxes (@PathVariable String hp){
        return taxesCalculatorService.calculateTaxes(hp);
    }

}
