public class App {
    public static void main(String[] args) throws Exception {



        Vehiculo moto = new Moto ("honda","CVR 200", 29);

        moto.arrancar();

        Vehiculo auto = new Auto ("Renault","Duster", 5);

        auto.arrancar();
        
    }
}

