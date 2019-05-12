public class testPolynomial {
    public static void main(String[] args) {

        PolynomialGF2 eins = new PolynomialGF2("1001");
        PolynomialGF2 zwei = new PolynomialGF2();
        PolynomialGF2 drei = new PolynomialGF2("1111");
        PolynomialGF2 vier = new PolynomialGF2("0000");

        System.out.println(eins.toString());
        System.out.println(zwei.toString());
        System.out.println(drei.toString());
        System.out.println(vier.toString());
        System.out.println(PolynomialGF2.isZero(eins));
        System.out.println(PolynomialGF2.isZero(drei));
        System.out.println(PolynomialGF2.isZero(vier));

    }
}
