package repaso.ejercicioElectrodomestico;

public class Electrodomestico {
    private double precio_base = 100;
    private Colores color = Colores.BLANCO;
    private ConsumoEnergetico consumo_energetico = ConsumoEnergetico.F;
    private double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public Colores getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumo_energetico() {
        return consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio_base=" + precio_base +
                ", color=" + color +
                ", consumo_energetico=" + consumo_energetico +
                ", peso=" + peso +
                '}';
    }

    private void comprobarConsumoEnergetico(char letra){
        try {
            this.consumo_energetico = ConsumoEnergetico.valueOf(String.valueOf(letra).toUpperCase());
        } catch (Exception e) {
            this.consumo_energetico = ConsumoEnergetico.F;
        }
    }

    private void comprobarColor(String color){
        try {
            this.color = Colores.valueOf(color.toUpperCase());
        } catch (Exception e) {
            this.color = Colores.BLANCO;
        }
    }

    public double precioFinal(){
        double precio_final = this.precio_base;
        switch (this.consumo_energetico) {
            case A -> precio_final+=100;
            case B -> precio_final+=80;
            case C -> precio_final+=60;
            case D -> precio_final+=50;
            case E -> precio_final+=30;
            case F -> precio_final+=10;
        }
        return precio_final;
    }
}
