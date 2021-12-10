public class Moto extends Vehiculo implements Producto {

    public int caballos;
    public String cuentaquilometros;

    public Moto() {

        color = "";
        caballos = 0;
        marca = "";
        modelo = "";
        cuentaquilometros = "";
        precio = 0;
        personalizacion = "";
    }


    public Moto(String cuentaquilometros, String color, int caballos, String marca, String modelo, int precio, String personalizacion) {

        this.cuentaquilometros = cuentaquilometros;
        this.color = color;
        this.caballos = caballos;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.personalizacion = personalizacion;

    }


    @Override
    public String toString() {
        return "Moto [cuentaquilometros=" + cuentaquilometros + ", color=" + color + ", marca=" + marca + ", modelo="
                + modelo + ", precio=" + (getPrecio() + precio) + ", personalizacion=" + (getDescripcion() + personalizacion) + "]";
    }


    @Override
    public String getInformacion() {

        return "La informaci�n de la moto es la siguiente: " + toString();
    }


    @Override
    public int getPrecio() {

        return 5000;
    }

    @Override
    public String getDescripcion() {

        return "Moto base + configuraci�n : ";
    }

}
