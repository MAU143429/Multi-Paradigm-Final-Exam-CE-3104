public class Television extends Electrodomestico{

    /**
     * Constructor de la clase Television, hereda de electrodomestico, utiliza super para
     * obtener los atributos
     * @param precioBase
     * @param color
     * @param consumo
     * @param peso
     */
    public Television(Float precioBase, String color, String consumo, Integer peso) {
        super(precioBase, color, consumo, peso);
    }
}
