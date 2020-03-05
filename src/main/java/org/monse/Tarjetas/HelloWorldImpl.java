
package org.monse.Tarjetas;

import javax.jws.WebService;

@WebService(endpointInterface = "org.monse.Tarjetas.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    
    public String nuevoMetodo(String nombre, String edad) {
    	return "" +10;
    }
}

