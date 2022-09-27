package com.calculadora.jonathan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aritmetica")
public class CalculadoraAritmeticaController {

	public CalculadoraAritmeticaController() {
	}

	@RequestMapping(value = "/sumar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Integer sumar(@RequestParam("operando1") Integer operando1, @RequestParam("operando2") Integer operando2) {
		return operando1 + operando2;
	}

	@RequestMapping(value = "/multiplicar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Integer multiplicar(@RequestParam("operando1") Integer operando1,
			@RequestParam("operando2") Integer operando2) {
		return operando1 * operando2;
	}
	
	@RequestMapping(value = "/raiz", method = RequestMethod.GET, params = { "operando1" })
	public Double raiz(@RequestParam("operando1") Integer operando1) {
		 Double resultado = Math.sqrt(operando1);
		 return resultado;
	}
	
	@RequestMapping(value = "/factor", method = RequestMethod.GET, params = { "operando1" })
	public Double factor(@RequestParam("operando1") Integer operando1) {
		 Double factorial = 1.0;
		 Integer num = operando1;
		 for (int i=num;i>0;i--)
		 {
		 factorial=factorial*i;
		 }
		 return factorial;
	}
	
	@RequestMapping(value = "/primo", method = RequestMethod.GET, params = { "operando1" })
	public boolean primo(@RequestParam("operando1") Integer operando1) {
		 if (operando1 == 0 || operando1 == 1 || operando1 == 4) {
			    return false;
			  }
			  for (int x = 2; x < operando1 / 2; x++) {
				  
			    if (operando1 % x == 0)
			      return false;
			  }
			  return true;	
	}
	
}