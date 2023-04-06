public class Traductor {
    String[] morse ={"·—","—···","—·—·","—··","·","··—·","——·","····","··","·———","—·—","·—··","——","—·","——·——","———","·——·","——·—","·—·","···","—","··—","···—","·——","—··—","—·——","——··"};
    String[] alfabeto ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String traduccion = "";
    String traduccionM = "";
    public String traducir(String dato){

        String mayuscula = "";
        String letra     = "";

        //codigo para que reciba  parametros en mayuscula a minuscula//
        mayuscula = dato.toUpperCase();

        for (int i=1; i<=dato.length(); i++){

            letra = mayuscula.substring(i-1, i);

            for (int j=0; j<alfabeto.length; j++){
                if (letra.equals(alfabeto[j])){
                    traduccion = traduccion + morse[j] + " / " ;
                }
            }
        }

        return traduccion;
    }
    public String traducirEsp(String dato) {
        String[] palabra;
        palabra = dato.split(" ");
        for (int i= 0; i <palabra.length; i++) {
            for (int j= 0; j <morse.length; j++) {
                if (palabra[i].equals(morse[j])){
                    traduccionM = traduccionM + alfabeto[j] +" ";
                }
            }
        }
        return traduccionM;
    }



}
