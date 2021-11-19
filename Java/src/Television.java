public class Television extends Electrodomestico{

    // SE LE PONEN LOS VALORES POR DEFECTO PERO LOS OTROS DOS SI LOS RECIBE
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
// LO SOBREESCRIBE Y CALCULA EL PRECIO DE ACUERDO CON LA RESOLUCION
    // SERA EL PRECIO QUE DA EL DE ELECTRODOMESTICO + IF  SUMA 50 AL PRECIO + IF tiene  1080P
    // suma 50
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
