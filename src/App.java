import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Ejercicio_3_listLevels.ListLevels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    private static ArbolBinario arbolBinario;
    private static ArbolRecorridos arbolRecorridos;
    private static final int[] VALORES = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

    public static void main(String[] args) {
        inicializarArboles(); // Inicializa árboles para otros ejercicios.

        System.out.println("\nÁrbol Binario:");
        arbolBinario.printTree();

        System.out.println("\nPreorden Iterativo:");
        arbolRecorridos.preorderIterativo(arbolBinario.getRoot());

        System.out.println("\nPreorden Recursivo:");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nPostorden:");
        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nInorden:");
        arbolRecorridos.InOrderRecursivo(arbolBinario.getRoot());

        runEjercicio3(); // Llamada al ejercicio 3.
    }

    private static void inicializarArboles() {
        arbolBinario = new ArbolBinario();
        arbolRecorridos = new ArbolRecorridos();

        for (int valor : VALORES) {
            arbolBinario.insert(valor);
        }
    }

    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();
        int[] valores = {4, 2, 7, 1, 3, 6, 9}; // Valores para el árbol de ejemplo.

        // Construcción del árbol.
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        // Imprime el árbol en formato visual.
        System.out.println("\nInput:");
        arbolBinario.printTree();

        // Obtiene los niveles del árbol.
        List<List<Node>> niveles = levels.listLevels(arbolBinario.getRoot());

        // Impresión en formato simple.
        System.out.println("\nOutput:");
        for (List<Node> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print("->");
                }
            }
            System.out.println();
        }
    }
}
