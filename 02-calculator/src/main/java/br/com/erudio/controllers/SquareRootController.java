package br.com.erudio.controllers;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareRootController {

    SimpleMath math = new SimpleMath();
    @RequestMapping(value="/sqt/{number}", method= RequestMethod.GET)
    public Double sqt(@PathVariable("number") String number) throws Exception {
        if(!NumberConverter.isNumeric(number)){
            throw new UnsuportedMathOperationException("Please set a numeric value !");

        }

        if(NumberConverter.convertToDouble(number)<0){
            throw new UnsuportedMathOperationException("Please insert number more than 0 !");

        }

        return math.sqt(NumberConverter.convertToDouble(number));


    }
}
