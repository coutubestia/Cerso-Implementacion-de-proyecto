public abstract class Vehiculo {
    
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    } 

//Constructor es el metodo que me permite crear objetos de la clase

    public abstract void arrancar();

}
