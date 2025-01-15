package main.Ejercicio_01_insert;

import main.Materia.Controllers.ArbolBinario;

public class InsertBSTTest {
    public static void main(String[] args) {
        System.out.println("\n=== Ejercicio 1: Insertar en Árbol BST ===");

        ArbolBinario bst = new ArbolBinario();
        int[] valores = {5, 3, 7, 2, 4, 6, 8};

        // Insertar valores en el árbol BST
        for (int valor : valores) {
            bst.insert(valor);
        }

        System.out.println("\nÁrbol BST resultante:");
        bst.printTree();
    }
}