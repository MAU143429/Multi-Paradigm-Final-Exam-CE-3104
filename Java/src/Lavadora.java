public class Lavadora extends Electrodomestico{
    /**
     * Atributos de la clase Lavadora
     */
    private java.lang.Integer Carga = 0;


    /**
     * Constructor de la clase Lavadora, utiliza super para obtener los atributos
     * de la clase padre Electrodomestico
     * @param precioBase
     * @param color
     * @param consumo
     * @param peso
     */
    public Lavadora(Float precioBase, String color, String consumo, Integer peso) {
        super(precioBase, color, consumo, peso);
    }

    /**
     * Metodo que calcula el precio final, se sobreescribe a partir del metodo de la
     * clase padre Electrodomestico
     * @return
     */
    @Override
    public float precioFinal(){
        return 0;
    }
}
