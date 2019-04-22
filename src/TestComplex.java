/**
 * TODO:   -Schreiben Sie eine Testklasse, die die gesamte Funktionalität
 *          der Klasse Complex ausführlich testet.
 *          Die Testklasse benutzt jede Variable der Klasse Complex mindestens
 *          einmal und ruft jede Methode mindestens 3-mal mit verschiedenen Argumenten auf.
 *         -Commentare für javadoc
 *
 * */

public class TestComplex {
    public static void main(String[] args) {

        Complex eins = new Complex();
        Complex zwei = new Complex(1.0, 2.0);
        Complex drei = new Complex(1.5, 2.5);
        Complex vier = new Complex(2.0, 3.0);
        Complex zweiCopyConstructor = new Complex(zwei);
        Complex dreiCopyConstructor = new Complex(drei);
        Complex vierCopyConstructor = new Complex(vier);

        System.out.println("####### constructor #######");
        System.out.println(zwei.toString());
        System.out.println(zweiCopyConstructor.toString());
        System.out.println(drei.toString());
        System.out.println(dreiCopyConstructor.toString());
        System.out.println(vier.toString());
        System.out.println(vierCopyConstructor.toString());

        System.out.println("####### clone #######");
        System.out.println("eins.clone() " + eins.clone().toString());
        System.out.println("zwei.clone() " + zwei.clone().toString());
        System.out.println("drei.clone() " + drei.clone().toString());

        System.out.println("####### @Overrite equals & hashCode #######");
        System.out.println("eins.equals(zwei) = " + eins.equals(zwei));
        System.out.println("eins.hashCode() = " + eins.hashCode());
        System.out.println("zwei.hashCode() = " + zwei.hashCode());
        System.out.println("zwei.equals(zweiCopyConstructor) = " + zwei.equals(zweiCopyConstructor));
        System.out.println("zwei.hashCode() = " + zwei.hashCode());
        System.out.println("zweiCopyConstructor.hashCode() = " + zweiCopyConstructor.hashCode());
        System.out.println("drei.equals(zwei) = " + drei.equals(zwei));
        System.out.println("drei.hashCode() = " + drei.hashCode());
        System.out.println("zwei.hashCode() = " + zwei.hashCode());
    }
}
