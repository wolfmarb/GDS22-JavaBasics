public class Aufgabe2Lösung {
    //erzeugen mit /** ...*/
    /**
     * Ausführung aller arithmetischer Operationen und Ausgabe
     * @parom args
     */

    public static void main(String[] args) {
       //deklarieren
        int a = 3;
        int b = 2;
        int result;

        //addieren
        result = a + b;
        System.out.println("result Addition = " + result);

        //subtrahieren
        result = a - b;
        System.out.println("result Subtraktion = " + result);

        //multiplizieren
        System.out.println("Multiplikation: " + (a*b));

        //dividieren typ anpassen auf double // geht auch mit 1.0 // ist nur für die eine Berechnung
        double div = (double) a / (1.0* b);
        System.out.println("dividieren: " + div);

        //modulo
        result = a % b;
        System.out.println("result modulo = " + result);

        // a++
        System.out.println("a++");
        //ich erwarte 3
        System.out.println(a++);
        System.out.println("a=" +a);   //ich erwarte mir 4
        // ++b
        System.out.println();

        //strg k zum commi
    }

}
