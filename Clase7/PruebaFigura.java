public class PruebaFigura {
    public static void main(String[] args) {

        Coordenada centro1 = new Coordenada(0, 0);
        Coordenada centro2 = new Coordenada(5, 5);

        TrianguloEq t = new TrianguloEq(centro1, 4);
        Rectangulo r = new Rectangulo(centro2, 6, 3);

        System.out.println("Triángulo equilátero:");
        System.out.println(t);
        System.out.println("Área: " + t.area());

        System.out.println("\nRectángulo:");
        System.out.println(r);
        System.out.println("Área: " + r.area());

        System.out.println("\nDesplazando figuras...\n");

        t.desplazar(2, 2);
        r.desplazar(-3, 1);

        System.out.println("Triángulo después de desplazar:");
        System.out.println(t);
        System.out.println("Área: " + t.area());

        System.out.println("\nRectángulo después de desplazar:");
        System.out.println(r);
        System.out.println("Área: " + r.area());
    }
}




