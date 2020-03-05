package org.monse.Tarjetas;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    

    public String nuevoMetodo(String nombre, String edad);
}

