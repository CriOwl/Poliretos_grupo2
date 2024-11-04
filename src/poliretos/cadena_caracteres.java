package poliretos;

public class cadena_caracteres {
    public String palabra;
    public int tipo;
    public String eliminacion;

    public cadena_caracteres(String palabra, int tipo) {
        this.palabra = palabra;
        this.tipo = tipo;
        girar_palabras();
        System.out.println(palabra.length());
    }

    public cadena_caracteres(String palabra, int tipo, String eliminacion) {
        this.palabra = palabra;
        this.tipo = tipo;
        this.eliminacion = eliminacion;
        eliminar_vocales();
        eliminar_letras();
       
    }

    private void contar_vocales() {
        this.palabra = this.palabra.toLowerCase();
        char[] palabra = this.palabra.toCharArray();
        int vocales = 0;
        for (int caracter = 0; caracter < this.palabra.length(); caracter++) {
            vocales = (palabra[caracter] == 'a' || palabra[caracter] == 'e' || palabra[caracter] == 'i'
                    || palabra[caracter] == 'o' || palabra[caracter] == 'u') ? vocales + 1 : vocales;
        }
        System.out.println(vocales);
    }

    private void contar_letras() {
        palabra = palabra.toLowerCase();
        char[] frase = palabra.toCharArray();
        int consonantes = 0;
        for (int caracter = 0; caracter < palabra.length(); caracter++) {
            consonantes = (frase[caracter] == 'a' || frase[caracter] == 'e' || frase[caracter] == 'i'
                    || frase[caracter] == 'o' || frase[caracter] == 'u') ? consonantes : consonantes + 1;
        }
        System.out.println(consonantes);
    }

    private void eliminar_vocales() {
        palabra = palabra.toLowerCase();
        char eliminacion = this.eliminacion.charAt(0);
        char[] frase = palabra.toCharArray();
        if (eliminacion == 'a' || eliminacion == 'e' || eliminacion == 'i' || eliminacion == 'o'
                || eliminacion == 'u') {
            for (int caracter = 0; caracter < palabra.length(); caracter++) {
                if (frase[caracter] == eliminacion) {
                    frase[caracter] = ' ';
                }
                System.out.print(frase[caracter]);
            }
        }
    }

    private void eliminar_letras() {
        palabra = palabra.toLowerCase();
        char eliminacion = this.eliminacion.charAt(0);
        char[] frase = palabra.toCharArray();
        for (int caracter = 0; caracter < palabra.length(); caracter++) {
            if (frase[caracter] == eliminacion) {
                frase[caracter] = ' ';
            }
            System.out.print(frase[caracter]);
        }

    }
    private void girar_palabras(){
     char[] frase= palabra.toCharArray();
     for (int caracter = (palabra.length()-1); caracter >= 0; caracter--) {
                 System.out.print(frase[caracter]);
     }
    }
}