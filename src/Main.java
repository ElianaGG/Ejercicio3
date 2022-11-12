public class Main {
    public static void main(String[] args) {

        Utils utilidades = new Utils();

        System.out.println("El resultado es: " + utilidades.suma(10,20,30));

        Coche miCoche = new Coche(1);
        System.out.println("Cantidad de puertas: " + miCoche.getPuertas());
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        System.out.println("Cantidad de puertas: " + miCoche.getPuertas());
    }
}
