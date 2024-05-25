package modelos;

public class TasaCambio {
    private String codigoDivisaEntrada;
    private String codigoDivisaSalida;
    private double tasaConversion;

    public TasaCambio(TasaCambioER tasaCambioER) {
        this.codigoDivisaEntrada = tasaCambioER.base_code();
        this.codigoDivisaSalida = tasaCambioER.target_code();
        this.tasaConversion = tasaCambioER.conversion_rate();
    }

    public String getCodigoDivisaEntrada() {
        return codigoDivisaEntrada;
    }

    public String getCodigoDivisaSalida() {
        return codigoDivisaSalida;
    }

    public double getTasaConversion() {
        return tasaConversion;
    }

    @Override
    public String toString() {
        return """
               (1 %s = %.2f %s)
               """.formatted(codigoDivisaEntrada, tasaConversion, codigoDivisaSalida);
    }
}
