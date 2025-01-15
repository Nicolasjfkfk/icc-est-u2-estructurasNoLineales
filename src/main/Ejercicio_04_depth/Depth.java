package main.Ejercicio_04_depth;

import main.Materia.Models.Node;
import main.Materia.Controllers.ArbolBinario;

public class Depth {
    private ArbolBinario arbol;

    public Depth() {
        this.arbol = new ArbolBinario();
    }

    public void ejecutarEjercicio() {
        System.out.println("\n=== Ejercicio 4: Calcular Profundidad Máxima ===");
        int[] valores = {4, 2, 7, 1, 3, 6, 9};

        // Insertar valores en el árbol
        for (int valor : valores) {
            arbol.insert(valor);
        }

        System.out.println("Árbol:");
        arbol.printTree();

        // Calcular y mostrar la profundidad máxima
        int profundidadMaxima = calcularProfundidad(arbol.getRoot());
        System.out.println("\nProfundidad máxima del árbol: " + profundidadMaxima);
    }

    private int calcularProfundidad(Node root) {
        if (root == null) {
            return 0;
        }

        int profundidadIzquierda = calcularProfundidad(root.getLeft());
        int profundidadDerecha = calcularProfundidad(root.getRight());

        return Math.max(profundidadIzquierda, profundidadDerecha) + 1;
    }
}
