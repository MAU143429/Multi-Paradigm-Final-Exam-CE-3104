/**
 * Clase Lavadora que hereda de la clase Electrodomestico
 */
public class Lavadora extends Electrodomestico{
    /**
     * Atributos de la clase Lavadora
     */
    private java.lang.Integer Carga = 0;

    /**
     * Constructor de la clase Lavadora, utiliza super para obtener los atributos
     * de la clase padre Electrodomestico
     * @param carga
     */
    public Lavadora(java.lang.Integer carga) {
        super();
        this.Carga = carga;
    }

   // LO SOBREESCRIBE Y CALCULA EL PRECIO DE ACUERDO CON LA CARGA
   // SERA EL PRECIO QUE DA EL DE ELECTRODOMESTICO + SI LA CARGA ES MAYOR A 30 SUMA 50 AL PRECIO
    /**
     * Metodo que calcula el precio final, se sobreescribe a partir del metodo de la
     * clase padre Electrodomestico
     * @return precio final de la lavadora
     */
    @Override
    public float precioFinal(){
        // Si el atributo carga es mayor a 30kg se incrementa el precio en 50
        if(Carga > 30){
            java.lang.Float precioLavadora = 0f;
            precioLavadora = super.precioFinal() + 50f;
            System.out.println("Precio lavadora: " + super.precioFinal());
            return precioLavadora;
        }
        else{
            return super.precioFinal();
        }
    }
}
