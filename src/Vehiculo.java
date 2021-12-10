public abstract class Vehiculo {

    public String color;
    public String marca;
    public String modelo;
    private int velocidad = 0;
    public int precio = 0;
    public String personalizacion = "";


    public void acelerar() {
        velocidad += 30;
    }

    public void frenar() {
        velocidad -= 30;
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public abstract String getInformacion();

}
