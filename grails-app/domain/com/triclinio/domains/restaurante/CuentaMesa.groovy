package com.triclinio.domains.restaurante

class CuentaMesa {

    Cuenta cuenta
    Mesa mesa

    //Datos genericos del dominio.
    boolean habilitado = true;
    String creadoPor = "sistemas";
    String modificadoPor = "sistemas";
    Date dateCreated;
    Date lastUpdated;


    static constraints = {
    }

    static mapping = {
        table 'rest_cuenta_mesa'
    }

}
