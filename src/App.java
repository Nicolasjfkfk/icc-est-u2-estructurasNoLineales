
import java.util.List;
import main.Ejercicio_3_listLevels.ListLevels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Models.Node;

public class App {
    private static ArbolBinario arbolBinario;
    private static ArbolRecorridos arbolRecorridos;
    private static final int[] VALORES = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

    public static void main(String[] args) {
        inicializarArboles();
        
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
        
        runEjercicio3();
        runArbolAVL();
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

    private static void runArbolAVL() {
        ArbolAVL arbolAVL = new ArbolAVL();
        int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};
        
        System.out.println("\nConstrucción del Árbol AVL:");
        System.out.println("===========================");
        
        for (int value : values) {
            System.out.println("\n* Nodo a insertar: " + value);
            arbolAVL.insert(value);
            System.out.println("-".repeat(50));
        }
    }
}// PRINT GET VALANCE Y ALTURA ANTES DE CADA