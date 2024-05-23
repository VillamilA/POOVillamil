package HERENCIAS;

public class Vivienda {
    int numero;
    String propietario;

    public Vivienda (int numero, String propietario){
        this.numero =  numero;
        this.propietario = propietario;
    }
    public void Imprimir(){
        System.out.println(" El numero de casa es: "+ numero+" y el propietario es: "+propietario);
    }
}
class Departamento extends Vivienda{
    int metros;
    int piso;

    public Departamento (int numero, String propietario, int metros, int piso){
        super(numero, propietario);
        this.metros=metros;
        this.piso = piso;
    }
    public void Anuncio(){
        System.out.println("El departamento tiene "+ metros+ "metros de tamaño, con "+ piso +" pisos");

    }
}
class Casa extends Vivienda{
    int habitaciones;
    String ubicacion;
    public Casa (int numero, String propietario, String ubicacion, int habitaciones) {
        super(numero, propietario);
        this.habitaciones = habitaciones;
        this.ubicacion = ubicacion;
    }
    public void Mensaje(){
        System.out.println("La casa numero "+ numero+ "la direccion es "+ubicacion+" cuenca con "+habitaciones+" habitaciones");
    }
}