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
        if(0 <= Peso && Peso <= 19){
            return 10f;
        }
        else if(20 <= Peso && Peso <= 49){
            return 50f;
        }
        else if(50 <= Peso && Peso <= 79){
            return 80f;
        }
        else if(Peso >= 80){
            return 100f;
        }
        else{
            return 0f;
        }
    }
}
