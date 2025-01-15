import java.util.Arrays;
import java.util.List;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_3_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) {

       // runArbolBinario();
       // runArbolAVL();
        runEjercicio1();
       // runEjercicio2();
       // runEjercicio3();
       // runEjercicio4();
    }

    public static void runArbolBinario(){
        ArbolBinario arbolBinario = new ArbolBinario();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        //Ingresar cada valor al arbol
        for (int i = 0; i < valores.length; i++){
        arbolBinario.insert(valores[i]);
        }
        
        System.out.println();
        arbolBinario.printTree();

        System.out.println(  );
        System.out.println("Recorrido PreOrder");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido PostOrder");
        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido InOrder");
        arbolRecorridos.InOrderRecursivo(arbolBinario.getRoot());
    }


    private static void runArbolAVL() {
        System.out.println("\nArbolAVL");
        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };
        ArbolAVL arbolAvl = new ArbolAVL();
        for (int value : values) {
            arbolAvl.insert(value);
            arbolAvl.printTree();
        }

    }

    public static void runEjercicio1() {
        System.out.println("\nEjercicio 1: Insertar en Árbol Binario de Búsqueda (BST)");
        InsertBSTTest insertBST = new InsertBSTTest();
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        ArbolBinario arbolBinario = insertBST.createBST(valores);

        System.out.println("Input:");
        System.out.println(Arrays.toString(valores));

        System.out.println("Output:");
        arbolBinario.printTree();
    }

    public static void runEjercicio2() {
        System.out.println("\nEjercicio 2: Invertir un Árbol Binario");
        InvertBinaryTree invertTree = new InvertBinaryTree();
        int[] valores = {4, 2, 7, 1, 3, 6, 9};

        ArbolBinario arbolBinario = new ArbolBinario();
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        System.out.println("Input:");
        arbolBinario.printTree();

        invertTree.invert(arbolBinario.getRoot());

        System.out.println("Output (Invertido):");
        arbolBinario.printTree();
    }

    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        System.out.println("\nInput:");
        arbolBinario.printTree();
        List<List<Node>> niveles = levels.listLevels(arbolBinario.getRoot());
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

    public static void runEjercicio4() {
        System.out.println("\nEjercicio 4: Calcular la Profundidad Máxima");
        Depth depthCalculator = new Depth();
        int[] valores = {4, 2, 7, 1, 3, 8};

        ArbolBinario arbolBinario = new ArbolBinario();
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        System.out.println("Input:");
        arbolBinario.printTree();

        int profundidad = depthCalculator.calculate(arbolBinario.getRoot());
        System.out.println("Output (Profundidad Máxima): " + profundidad);
    }
}