package Poliretopack;

import java.util.Scanner;

public class InicialDeNombre {
    public void mostrarinicial() {
        Scanner sc = new Scanner(System.in);
        int tamaño;

        do {
            System.out.println(
                    "Ingrese el tamaño de la letra que sea mayor o igual que 5 y que sea impar: ");
            tamaño = sc.nextInt();

            if (tamaño < 5 || tamaño % 2 == 0) {
                System.out.println("El tamaño ingresado no es valido");
            }
        } while (tamaño < 5 || tamaño % 2 == 0);

        // Dibujo de la letra 'S'
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == 0 || i == tamaño - 1 || i == tamaño / 2) {
                    // Fila superior, inferior o del medio: llenar toda la fila
                    System.out.print("+");
                } else if (i < tamaño / 2) {
                    // Mitad superior (sin contar la fila media): solo borde izquierdo
                    if (j == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    // Mitad inferior (sin contar la fila media): solo borde derecho
                    if (j == tamaño - 1) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        
         sc.close();
    }
}