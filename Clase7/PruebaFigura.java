public class PruebaPolig {
    public static void main (String[] args) {
        Coordenada centro = new Coordenada(1,1);
        Rectangulo rect1 = new Rectangulo(7, 4);

        System.out.println(rect1.area());
        System.out.println()

        PoligonoIrreg polig = new PoligonoIrreg(7);
        System.out.println(polig);

        Coordenada coord = new Coordenada(5,1);
        polig.modificarVertice(2, coord);
        System.out.println(polig);
    }
}