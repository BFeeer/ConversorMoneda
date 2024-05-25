package modelos;

public class Conversion {
    private TasaCambio tasaCambio;
    private double montoDivisaEntrada;
    private double montoDivisaSalida;


    public Conversion(TasaCambio tasaCambio, double montoDivisaEntrada) {
        this.tasaCambio = tasaCambio;
        this.montoDivisaEntrada = montoDivisaEntrada;
        this.montoDivisaSalida = convertir();
    }

    public TasaCambio getTasaCambio() {
        return tasaCambio;
    }

    private double convertir(){
        if (tasaCambio != null){
            if (montoDivisaEntrada > 0){
                return montoDivisaEntrada * tasaCambio.getTasaConversion();
            }
        }
        return 0.00;
    }

    @Override
    public String toString() {
        if (tasaCambio != null){
            return """
                   %.2f %s = %.2f %s
                   """.formatted(montoDivisaEntrada,tasaCambio.getCodigoDivisaEntrada(),
                        montoDivisaSalida, tasaCambio.getCodigoDivisaSalida());
        }
        return "Ocurrió un error al seleccionar la divisa";
    }

}
