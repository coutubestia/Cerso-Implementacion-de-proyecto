public class Auto extends Vehiculo {
    
    private int puertas; 

    public Auto(String marca, String modelo, int puertas) {
        super(marca, modelo);
    
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas; 


    }

    @Override
    public void arrancar() {
    
        System.out.println("Este Vehiculo es marca " + marca + " Y su modelo es " + modelo + " Tiene " + puertas + " Puertas y arranca Con Boton" );

    }

   

    



}
