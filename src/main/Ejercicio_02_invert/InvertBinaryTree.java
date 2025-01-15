package main.Ejercicio_02_invert;

import main.Materia.Models.Node;
import main.Materia.Controllers.ArbolBinario;

public class InvertBinaryTree {
    private ArbolBinario arbol;

    public InvertBinaryTree() {
        this.arbol = new ArbolBinario();
    }

    public void ejecutarEjercicio() {
        System.out.println("\n=== Ejercicio 2: Invertir Árbol Binario ===");
        int[] valores = {4, 2, 7, 1, 3, 6, 9};

        // Insertar los valores en el árbol
        for (int valor : valores) {
            arbol.insert(valor);
        }

        System.out.println("Árbol original:");
        arbol.printTree();

        // Invertir el árbol
        invertTree(arbol.getRoot());

        System.out.println("\nÁrbol invertido:");
        arbol.printTree();
    }

    private Node invertTree(Node root) {
        if (root == null) return null;

        // Intercambiar los hijos izquierdo y derecho
        Node temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        // Recursivamente invertir los subárboles
        invertTree(root.getLeft());
        invertTree(root.getRight());

        return root;
    }
}
