package poli_retos;

public class letras {
    public int filas,
            columnas;
    public char caracter;
    public char letra1;
    public char letra2;
    char[][][] letras_matriz;

    public letras(int tamanio, char letra1,char letra2, char caracter) {
        this.filas = tamanio;
        this.columnas = tamanio;
        this.letra1 = letra1;
        this.letra2 = letra2;
        this.caracter = caracter;
        letras_matriz = new char[2][tamanio][tamanio];
    }

    public  char [][][]  matriz() {
        for (int numero_letra = 0; numero_letra < 2; numero_letra++) {
            for (int filas = 0; filas < this.filas; filas++) {
                for (int columnas = 0; columnas < this.columnas; columnas++) {
                    switch (letra1) {
                        case 'a':
                            pintar_a(columnas, filas, numero_letra);
                            break;
                        case 'b':
                            pintar_b(columnas, filas, numero_letra);
                            break;
                        case 'c':
                            pintar_c(columnas, filas, numero_letra);
                            break;
                        case 'd':
                            pintar_d(columnas, filas, numero_letra);
                            break;
                        case 'e':
                            pintar_e(columnas, filas, numero_letra);
                            break;
                        case 'f':
                            pintar_f(columnas, filas, numero_letra);
                            break;
                        case 'g':
                            pintar_g(columnas, filas, numero_letra);
                            break;
                        case 'h':
                            pintar_h(columnas, filas, numero_letra);
                            break;
                        case 'i':
                            pintar_i(columnas, filas, numero_letra);
                            break;
                        case 'j':
                            pintar_j(columnas, filas, numero_letra);
                            break;
                        case 'k':
                            pintar_k(columnas, filas, numero_letra);
                            break;
                        case 'l':
                            pintar_l(columnas, filas, numero_letra);
                            break;
                        case 'm':
                            pintar_m(columnas, filas, numero_letra);
                            break;
                        case 'n':
                            pintar_n(columnas, filas, numero_letra);
                            break;
                        case 'o':
                            pintar_o(columnas, filas, numero_letra);
                            break;
                        case 'p':
                            pintar_p(columnas, filas, numero_letra);
                            break;
                        case 'r':
                            pintar_r(columnas, filas, numero_letra);
                            break;
                        case 's':
                            pintar_s(columnas, filas, numero_letra);
                            break;
                        case 't':
                            pintar_t(columnas, filas, numero_letra);
                            break;
                        case 'u':
                            pintar_u(columnas, filas, numero_letra);
                            break;
                        case 'v':
                            pintar_v(columnas, filas, numero_letra);
                            break;
                        case 'w':
                            pintar_w(columnas, filas, numero_letra);
                            break;
                        case 'x':
                            pintar_x(columnas, filas, numero_letra);
                            break;
                        default:
                            System.out.println("error");
                            ;
                    }
                }
            }
            letra1=letra2;
        }
        return letras_matriz;
    }

    private void pintar_a(int j, int i, int num) {
        if (j == 0 | i == (filas / 2) | j == columnas - 1|i==0) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_b(int j, int i, int num) {
        if (j == 0 | i == (filas / 2) | j == columnas - 1 | i == (filas - 1)|i==0) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_c(int j, int i, int num) {
        if (j == 0 | i == (this.filas - 1) | i == 0) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_d(int j, int i, int num) {
        if (j == 0 | j == columnas - 1 | i == (filas - 1)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_e(int j, int i, int num) {
        if (j == 0 | i == (filas - 1) | i == (filas / 2)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_f(int j, int i, int num) {
        if (j == 0 | i == 0 | i == (filas / 2)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_g(int j, int i, int num) {
        if (j == 0 | i == 0 | (i == (filas / 2) && j != 1) | i == (filas - 1)
                | (j == columnas - 1 && i >= (filas / 2))) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_h(int j, int i, int num) {
        if (j == 0 | j == (columnas - 1) | i == (filas / 2)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_i(int j, int i, int num) {
        if (i == 0 | j == (columnas / 2) | i == (filas - 1)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_j(int j, int i, int num) {
        if (i == 0 | j == ((columnas + 1) / 2) - 1 | (i == (filas - 1) && j <= (columnas / 2))) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_k(int j, int i, int num) {
        if (j == 0 | j == (columnas / 2) - i | (j == i - (filas / 2) && i > (filas / 2))) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_l(int j, int i, int num) {
        if (j == 0 | i == (filas - 1)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_m(int j, int i, int num) {
        if (j == 0 | j == (columnas - 1) | ((j == i || j == (columnas - 1) - i) && i <= ((filas + 1) / 2) - 1)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_n(int j, int i, int num) {
        if (j == 0 | j == (columnas - 1) | j == i) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_o(int j, int i, int num) {
        if (j == 0 | j == (columnas - 1) | i == 0 | i == filas - 1) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_p(int j, int i, int num) {
        if (j == 0 | i == ((filas + 2) / 2) - 1 | i == 0 | (j == (columnas - 1) && i <= (filas / 2))) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_r(int j, int i, int num) {
        if (j == 0 | ((i == ((filas + 2) / 2) - 1 || i == 0) && j <= (columnas / 2))
                | (j == (columnas / 2) && i <= (filas / 2)) | j == i - ((filas) / 2)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_s(int j, int i, int num) {
        if (i == 0 | (j == 0 && i <= (filas / 2)) | i == ((filas + 1) / 2) - 1
                | (j == columnas - 1 && i >= ((filas + 1) / 2))
                | i == filas - 1) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_t(int j, int i, int num) {
        if (i == (filas / 2) | j == (columnas / 2) | i == (filas - 1)) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_u(int j, int i, int num) {
        if (j == 0 | j == columnas - 1 | i == filas - 1) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_v(int j, int i, int num) {
        if ((j == i && i <= (filas / 2)) | (j == (columnas - 1) - i && i <= (filas / 2))) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_w(int j, int i, int num) {
        if (i == filas - 1 | j == 0 | j == (columnas / 2) | j == columnas - 1) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }

    private void pintar_x(int j, int i, int num) {
        if (j == i | j == (columnas - 1) - i) {
            letras_matriz[num][i][j] = caracter;
        } else {
            letras_matriz[num][i][j] = ' ';
        }
    }
}