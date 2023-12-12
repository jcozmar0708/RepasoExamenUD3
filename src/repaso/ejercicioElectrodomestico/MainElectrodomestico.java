package repaso.ejercicioElectrodomestico;

public class MainElectrodomestico {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico(200,10);
        Electrodomestico e3 = new Electrodomestico(300,"negro",'d',15);
        Electrodomestico e4 = new Electrodomestico(400,"morado",'g',20);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        System.out.println(e1.precioFinal());
        System.out.println(e2.precioFinal());
        System.out.println(e3.precioFinal());
        System.out.println(e4.precioFinal());
    }
}
