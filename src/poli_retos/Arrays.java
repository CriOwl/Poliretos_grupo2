package poli_retos;

import java.util.Scanner;

public class Arrays {
    public String frase;
    public int[]porcentajesStr;
    public Integer tamanio;
    public char[][][] matriz_letras;
    public Arrays(String frase, String porcentajes_carga){
            this.frase=frase;
            this.porcentajesStr=porcentajes_carga;
    }
    public void Array01() {
        String palabras;
        int indice=0;
        Scanner separador=new Scanner(frase);
        int[] porcentajes;
        //-----------------------
        System.out.println("Ingrese los porcentajes de carga para cada palabra (separados por comas):");
        while(separador.hasNext()){
            palabras+=separador.next();
        }
        String[] porcentajesArr = porcentajesStr.split(",");
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = Integer.parseInt(porcentajesArr[i].trim());
        }
        for (int i = 0; i < palabras.length; i++) {
            int longitud = palabras[i].length();
            int caracteresCargados = (longitud * porcentajes[i]) / 100;
            System.out.print("[");
            for (int j = 0; j < longitud; j++) {
                if (j < caracteresCargados) {
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentajes[i] + "% " + palabras[i].substring(0, caracteresCargados));
            System.out.println();
        }
    }

    private void g2_arrays03(){
        for (int filas = 0; filas < tamanio; filas++) {
            for (int columnas = 0; columnas < tamanio; columnas++) {
                System.out.print(matriz_letras[0][filas][columnas]);
            }
            System.out.print("        ");
            for (int columnas = 0; columnas < tamanio; columnas++) {
                System.out.print(matriz_letras[1][filas][columnas]);
            }
            System.out.println();
        }
}


    public static void g2_arrays03(String nombre) {
        System.out.println("\nPlano de coordenadas para la función f(x) = 2x:");
        int ejeY = nombre.length(); 
        for (int y = 0; y <= ejeY; y++) {
            if (y < ejeY) {
                System.out.printf("%3d |", ejeY - y);
            } else {
                System.out.printf("%3d |", 0);
                System.out.print(" _");
            }
            for (int x = 0; x < nombre.length(); x++) {
                if (y == x) { 
                    System.out.print(" " + nombre.charAt(x) + " ");
                } else {
                    System.out.print("   "); 
                }
            }
            System.out.println(); 
        }
        System.out.print("      ");
        for (int x = 0; x < nombre.length(); x++) {
            System.out.printf("%3d", x); 
        }
        System.out.println();
    }

    public void Array04(){
        char nombre[] = {'G','A','R','Y'};
        char apellido[] = {'D','E','F','A','S'};

        int max = Math.max(nombre.length, apellido.length);

        for (int f = 0; f < max; f++) {
            for (int c = 0; c < max; c++) {
                if (f < nombre.length && f == c)
                    System.out.print(nombre[c] + " ");
                else
                    System.out.print(" ");

                if (f == max - c - 1 && f < apellido.length)
                    System.out.print(apellido[f] + " ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    //Array 05
    public void g2_array05() {
        System.out.print("\n- Serie A05.\n");
        System.out.println("Ingrese su nombre completo");
        //------------------------------------------
        String nombreCompleto = this.frase;
        System.out.println("");
        String[] palabras = nombreCompleto.split(" ");
        String primerPalabra = palabras[0];
        int tamanoMatriz = primerPalabra.length();

        char[][] matriz = new char[tamanoMatriz][tamanoMatriz];

        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }
        for (int k = 0; k < palabras.length; k++) {
            primerPalabra = palabras[k];
            for (char letra : primerPalabra.toCharArray()) {
                int x, y;

                x = (int) (Math.random() * tamanoMatriz);
                y = (int) (Math.random() * tamanoMatriz);

                if (matriz[x][y] != ' ') {
                    matriz[x][y] = '*';
                } else {
                    matriz[x][y] = letra;
                }

            }

        }
        mostrarMatriz(matriz, tamanoMatriz);
        System.out.println(" ");
    }

    public void mostrarMatriz(char[][] matriz, int tamanoMatriz) {
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                try {
                    Thread.sleep(200); // Esperar 200 ms entre letras
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (matriz[i][j] == ' ') {
                    System.out.print("  ");
                } else {
                    System.out.print(matriz[i][j]+" ");
                
                }

            }
            System.out.println(" ");
        }
    }
}
