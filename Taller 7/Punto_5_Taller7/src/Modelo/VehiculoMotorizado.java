package Modelo;

import java.util.Scanner;

public class VehiculoMotorizado {

    private String Fabricante;
    private String Modelo;
    private int AñoFabrica;
    private int Kilometraje;
    private String Tipo_Vehiculo;

    Scanner leer = new Scanner(System.in);

    public VehiculoMotorizado() {
    }
    

    public VehiculoMotorizado(String Fabricante, String Modelo, int AñoFabrica, int Kilometraje, String Tipo_Vehiculo) {
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.AñoFabrica = AñoFabrica;
        this.Kilometraje = Kilometraje;
        this.Tipo_Vehiculo = Tipo_Vehiculo;
    }

   


    public String getTipo_Vehiculo() {
        return Tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String Tipo_Vehiculo) {
        this.Tipo_Vehiculo = Tipo_Vehiculo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAñoFabrica() {
        return AñoFabrica;
    }

    public void setAñoFabrica(int AñoFabrica) {
        this.AñoFabrica = AñoFabrica;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
   

    public  void Introducirdatos() {
        System.out.println("-------------------------------------");
        System.out.println("Ingrese los datos del vehiculo");
        System.out.println("-------------------------------------");
        System.out.println("Ingrese que tipo de vehiculo es: ");
        String tipo = leer.nextLine();
        setTipo_Vehiculo(tipo);
        System.out.println("Ingrese el fabricante del vehiculo: ");
        String fabri = leer.nextLine();
        setFabricante(fabri);
        System.out.println("Ingrese el modelo del vehiculo: ");
        String Model = leer.nextLine();
        setModelo(Model);
        System.out.println("Ingrese el año de fabrica del vehiculo: ");
        int Año = leer.nextInt();
        setAñoFabrica(Año);
        System.out.println("Ingrese el kilometraje del vehiculo: ");
        int Km = leer.nextInt();
        setKilometraje(Km);
    }

    public void ObtenerdatosV() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("El vehiculo es un " + getTipo_Vehiculo() + "\n"
                + "El vehiculo fue fabricado por: " + getFabricante() + "\n"
                + "Su modelo es: " + getModelo() + "\n"
                + "Su año de fabricacion es: " + getAñoFabrica() + "\n"
                + "Su Kilometraje es: " + getKilometraje() + "\n");
        System.out.println("-------------------------------------------------------------------");

    }

    

}
