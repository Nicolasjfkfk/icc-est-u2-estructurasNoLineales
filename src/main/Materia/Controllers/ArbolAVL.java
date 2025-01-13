package main.Materia.Controllers;

import main.Materia.Models.Node;

public class ArbolAVL {
    private Node root;

    public void insert(int value) {
        System.out.println("\n* Nodo a insertar: " + value);
        root = insert(root, value);
        System.out.println("Estructura actual del árbol:");
        printTreeStructure(root);
    }

    private Node insert(Node nodo, int value) {
        if (nodo == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1);
            System.out.println("Nodo insertado: " + value + ", Balance: 0");
            return newNode;
        }

        if (value < nodo.getValue()) {
            nodo.setLeft(insert(nodo.getLeft(), value));
        } else if (value > nodo.getValue()) {
            nodo.setRight(insert(nodo.getRight(), value));
        } else {
            return nodo; // No se permiten valores duplicados
        }

        // Actualizar la altura del nodo actual
        nodo.setHeight(1 + Math.max(height(nodo.getLeft()), height(nodo.getRight())));

        // Obtener el balance del nodo actual
        int balance = getBalance(nodo);

        // Caso Izquierda - Izquierda
        if (balance > 1 && value < nodo.getLeft().getValue()) {
            System.out.println("Rotación Derecha en nodo: " + nodo.getValue() + ", Balance: " + balance);
            return rightRotate(nodo);
        }

        // Caso Derecha - Derecha
        if (balance < -1 && value > nodo.getRight().getValue()) {
            System.out.println("Rotación Izquierda en nodo: " + nodo.getValue() + ", Balance: " + balance);
            return leftRotate(nodo);
        }

        // Caso Izquierda - Derecha
        if (balance > 1 && value > nodo.getLeft().getValue()) {
            System.out.println("Rotación Izquierda-Derecha en nodo: " + nodo.getValue());
            nodo.setLeft(leftRotate(nodo.getLeft()));
            return rightRotate(nodo);
        }

        // Caso Derecha - Izquierda
        if (balance < -1 && value < nodo.getRight().getValue()) {
            System.out.println("Rotación Derecha-Izquierda en nodo: " + nodo.getValue());
            nodo.setRight(rightRotate(nodo.getRight()));
            return leftRotate(nodo);
        }

        return nodo;
    }

    private Node rightRotate(Node y) {
        Node x = y.getLeft();
        Node temp = x.getRight();

        // Realizar rotación
        x.setRight(y);
        y.setLeft(temp);

        // Actualizar alturas
        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));
        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.getRight();
        Node temp = y.getLeft();

        // Realizar rotación
        y.setLeft(x);
        x.setRight(temp);

        // Actualizar alturas
        x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
        y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));

        return y;
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    private void printTreeStructure(Node node) {
        printSubtree(node, "", true);
    }

    private void printSubtree(Node node, String prefix, boolean isTail) {
        if (node == null) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + "null");
            return;
        }
        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.getValue());
        printSubtree(node.getLeft(), prefix + (isTail ? "    " : "│   "), false);
        printSubtree(node.getRight(), prefix + (isTail ? "    " : "│   "), true);
    }
}
