package Poliretopack;

public class Controlador {

    public static void main(String[] args) {

        // Objeto de SerieCaracter
        SerieCaracter serie = new SerieCaracter();

        // Ejecutar método
        serie.mostrarserie();

        System.out.println();

        // Objeto de InicialNombre
        InicialDeNombre nombre = new InicialDeNombre();

        // Ejecutar método
        nombre.mostrarinicial();
    }
}