public abstract class Electrodomestico {
    /**
     * Atributos de la clase Electrodomestico
     */
    private java.lang.Float PrecioBase = 0.0f;
    private java.lang.String Color = " ";
    private java.lang.String Consumo = " ";
    private java.lang.Integer Peso = 0;

    /**
     * Constructor de la clase abstracta que tiene valores por defecto
     */
    public Electrodomestico() {
        this.PrecioBase = 100f;
        this.Color = "blanco";
        this.Consumo = "F";
        this.Peso = 5;
    }

    public Electrodomestico(java.lang.Float precioBase,java.lang.Integer peso) {
        this.PrecioBase = precioBase;
        this.Color = "blanco";
        this.Consumo = "F";
        this.Peso = peso;
    }

    /**
     * Calcula el precio final a partir del peso que se definia en la tabla
     * @return
     */
    public float precioFinal(){

        return 0;
    }



}
