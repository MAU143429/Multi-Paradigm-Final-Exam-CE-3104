public class Main {

    public static void main(String[] args) {
        Electrodomestico []electrodomesticos = new Electrodomestico[3];
        electrodomesticos[0] = new Lavadora(40);
        electrodomesticos[1] = new Television(1080,true);
        electrodomesticos[2] = new Electrodomestico();

        for(int i = 0; i < electrodomesticos.length; i++){
            System.out.println("El precio del electrodomestico " + (i+1) + " " + "es: " + electrodomesticos[i].precioFinal());
        }
    }
}