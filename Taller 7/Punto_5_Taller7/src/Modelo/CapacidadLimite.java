package Modelo;

import java.util.Scanner;

public class CapacidadLimite extends VehiculoMotorizado{
    private int numero_pasajeros;

   Scanner leer2 = new Scanner(System.in);

    public CapacidadLimite() {
    }


    public CapacidadLimite(int numero_pasajeros) {
        this.numero_pasajeros = numero_pasajeros;
    }

    
    public int getNumero_pasajeros() {
        return numero_pasajeros;
    }

    public void setNumero_pasajeros(int numero_pasajeros) {
        this.numero_pasajeros = numero_pasajeros;
    }
    public void Pasajeros(){
        System.out.println("Ingrese el numero de pasajeros: ");
        int N = leer.nextInt();
        setNumero_pasajeros(N);
        System.out.println("El numero de pasajeros del vehiculo: "+getNumero_pasajeros());
        if (getNumero_pasajeros()>4) {
            System.out.println("No se cumple las medidas de seguridad exigidas");
        } else {
            System.out.println("cumple las medidas de seguridad exigidas");
        }
        
    }
        
         
}
