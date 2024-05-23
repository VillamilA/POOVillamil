package HERENCIAS;

public class Principal {
    public static void main (String [] args){
        Vivienda v1 = new Vivienda(123, "Angel");
        v1.Imprimir();
        Departamento d1 = new Departamento(45, "Angel", 100, 3);
        d1.Anuncio();
        Casa c1 = new Casa(41, "Angel", "La floresta", 6);
        c1.Mensaje();
    }
}
