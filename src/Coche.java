public class Coche extends Vehiculo implements Producto {


    public int caballos;
    public int numPuertas;
    static int capacidadMaletero;
    public Radio radio;


    public Coche() {
        color = "";
        caballos = 0;
        marca = "";
        modelo = "";
        numPuertas = 3;
        capacidadMaletero = 1000;
        radio = new Radio();
        precio = 0;
        personalizacion = "";

    }


    public Coche(String color, int caballos, String marca, String modelo, int numPuertas, int capacidadMaletero, int precio, String personalizacion) {

        this.color = color;
        this.caballos = caballos;
        this.marca = marca;
        this.modelo = modelo;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.setVelocidad(0);
        radio = new Radio();
        this.precio = precio;
        this.personalizacion = personalizacion;

    }


    @Override
    public String toString() {
        return "Coche [caballos=" + caballos + ", numPuertas=" + numPuertas + ", capacidadMaletero=" + capacidadMaletero
                + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", radio =" + (radio == null ? "no hay" : "si hay") + ", precio = " + (getPrecio() + precio) + ",  personalizacion = " + (getDescripcion() + " con configuraci�n : " + personalizacion) + "]";
    }


    public int getCaballos() {
        return caballos;
    }


    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }


    public int getNumPuertas() {
        return numPuertas;
    }


    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }


    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }


    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }


    public Radio getRadio() {
        return radio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    @Override
    public String getInformacion() {

        return "La informaci�n del coche es: " + toString();
    }


    public class Radio {

        private float emisora = 0f;
        private boolean encendida = false;

        void encender() {
            encendida = true;
        }

        void apagar() {
            encendida = false;
        }

        public float getEmisora() {
            return emisora;
        }

        public void setEmisora(float emisora) {
            this.emisora = emisora;
        }
    }


    @Override
    public int getPrecio() {

        return 15000;

    }

    public String getDescripcion() {

        return "Coche base";
    }

}
