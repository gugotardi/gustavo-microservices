package br.com.erudio.controllers;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubtractionController {

    SimpleMath math = new SimpleMath();
    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value !");

        }

        return math.sub(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));


    }
}
