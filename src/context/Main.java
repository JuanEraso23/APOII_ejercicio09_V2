package context;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // Variables
        int a = 1;
        int b = 0;

        String resultado = "";

        // Ciclo
        for (int i = 0; i < 11; i++) {
            int suma = a + b;
            resultado += suma + " ";
            a = b;
            b = suma;
        }

        // Salida
        JOptionPane.showMessageDialog(
                null,
                "Serie:\n" + resultado
        );
    }
}