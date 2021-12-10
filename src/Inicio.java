public class Inicio {

    public static void main(String[] args) {

        Coche c1 = new Coche("Verde", 100, "Opel", "Corsa", 5, 750, 2000, "P.Corsa Green");

        System.out.println("La informaci�n de c1 es:" + c1.getInformacion());


        Coche c2 = new Coche("Rojo", 150, "Bmw", "s1", 3, 800, 5000, "P.s1 Red");


        System.out.println("La informacion de c2 es:" + c2.getInformacion());


        Coche c3 = new Coche();
        c3.numPuertas = 4;
        c3.capacidadMaletero = 500;
        Coche c4 = new Coche();
        c4.numPuertas = 5;
        c4.capacidadMaletero = 550;

        System.out.println(c3.capacidadMaletero);
        System.out.println(c4.capacidadMaletero);


        //Coge el �ltimo valor que le damos a la variable "capacidadMaletero",
        //ya que si indicamos la variable como static esta comparte el valor para todos los objetos de la misma clase.


        Moto m1 = new Moto("Digital", "Blanca y Azul", 150, "Bmw", "Cruise", 1150, "P.White&Blue");

        System.out.println(m1.getInformacion());


    }

}
