package Vista;

import Modelo.*;
public class Vista {

    public static void main(String[] args) {
        VehiculoMotorizado vehiculo = new Motocicleta();
        vehiculo.Introducirdatos();
        vehiculo.ObtenerdatosV();
        CapacidadLimite l = new CapacidadLimite();
        l.Pasajeros();
        VehiculoMotorizado vehiculo2 = new Automovil();
        vehiculo2.Introducirdatos();
        vehiculo2.ObtenerdatosV();
        CapacidadLimite p = new CapacidadLimite();
        p.Pasajeros();
        
    
        
    }

}
