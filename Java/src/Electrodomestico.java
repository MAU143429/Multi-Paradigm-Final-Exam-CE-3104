public abstract class Electrodomestico {
    /**
     * Atributos de la clase Electrodomestico
     */
    private java.lang.Float PrecioBase = 0.0f;
    private java.lang.String Color = " ";
    private java.lang.String Consumo = " ";
    private java.lang.Integer Peso = 0;

    /**
     * Constructor de la clase abstracta
     * @param precioBase
     * @param color
     * @param consumo
     * @param peso
     */
    public Electrodomestico(Float precioBase, String color, String consumo, Integer peso) {
        this.PrecioBase = precioBase;
        this.Color = color;
        this.Consumo = consumo;
        this.Peso = peso;
    }

    /**
     * Calcula el precio final
     * @return
     */
    public float precioFinal(){
           return 0;
    }



}
