public class Main {
    public static void main(String[] args) {
        Traductor taduccion = new Traductor();

        String alfabeto = "";
        alfabeto = taduccion.traducir("sapos");
        System.out.println(alfabeto);

        System.out.println();

        String alfabetoM = "";
        alfabetoM =taduccion.traducirEsp("···  ·—  ·——·  ——— ···");
        System.out.println(alfabetoM);

    }
}