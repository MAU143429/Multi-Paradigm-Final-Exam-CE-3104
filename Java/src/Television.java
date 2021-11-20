/**
 * Clase Television que hereda de la clase Electrodomestico
 */
public class Television extends Electrodomestico{
    /**
     * Atributos de la clase Television
     */
    private java.lang.Integer Resolucion = 0;
    private java.lang.Boolean SinHDMI = false;

    /**
     * Constructor de la clase Television, hereda de electrodomestico, utiliza super para
     * obtener los atributos
     * @param resolucion
     * @param sinHDMI
     */
    public Television(java.lang.Integer resolucion, java.lang.Boolean sinHDMI) {
        super();
        this.Resolucion = resolucion;
        this.SinHDMI = sinHDMI;
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
        // Si tiene una resolucion mayor o igual a 1080p se incrementa el precio en 30%
        if(Resolucion >= 1080){
            java.lang.Float precioTelevision = 0f;
            precioTelevision = super.precioFinal() * 0.30f;
            System.out.println("Precio lavadora: " + super.precioFinal());
            return precioTelevision;
        }
        else if(SinHDMI){
            java.lang.Float precioTelevision = 0f;
            System.out.println("Precio lavadora: " + super.precioFinal());
            precioTelevision = super.precioFinal() + 50f;
            return precioTelevision;
        }
        else{
            return super.precioFinal();
        }
    }
}
