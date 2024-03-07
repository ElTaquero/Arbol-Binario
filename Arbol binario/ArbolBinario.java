public class ArbolBinario {

    Nodo raiz;

    ArbolBinario() {
        raiz = null;
    }

    void insertar(int valor){
        raiz = insertarRec(raiz, valor);
        System.out.print(valor + " ");
    }

    Nodo insertarRec(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.dato) {
            nodo.izquierda = insertarRec(nodo.izquierda, valor);
        }else if (valor > nodo.dato){
            nodo.derecha = insertarRec(nodo.derecha, valor);
        }
        return nodo;
    }

    //IMPRIMIR

    //Por niveles

    void imprimirNiveles() {
        if (raiz == null) {
            System.out.println("El árbol está vacío");
            return;
        }

        int MAX = 20;
        Nodo[] lista = new Nodo[MAX];
        int primero = 0, ultimo = 0;
        int nvlActual = 1, nvlSig = 0;

        lista[ultimo++] = raiz;

        while (primero != ultimo) {
            Nodo nodo = lista[primero++];
            System.out.print(nodo.dato + " ");
            nvlActual--;

            if (nodo.izquierda != null) {
                lista[ultimo++] = nodo.izquierda;
                nvlSig++;
            }

            if (nodo.derecha != null) {
                lista[ultimo++] = nodo.derecha;
                nvlSig++;
            }

            if (nvlActual == 0) {
                System.out.println();
                nvlActual = nvlSig;
                nvlSig = 0;
            }
        }
    }

    //Métodos de Impresion

    void imprimirInOrden(){
        imprimirInOrdenRec(raiz);
    }

    void imprimirInOrdenRec(Nodo nodo){
        if(nodo != null){
            imprimirInOrdenRec(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            imprimirInOrdenRec(nodo.derecha);
        }
    }

    void imprimirInOrdenD(){
        imprimirInOrdenRecD(raiz);
    }

    void imprimirInOrdenRecD(Nodo nodo){
        if(nodo != null){
            imprimirInOrdenRecD(nodo.derecha);
            System.out.print(nodo.dato + " ");
            imprimirInOrdenRecD(nodo.izquierda);
        }
    }

    void imprimirPreOrden(){
        imprimirPreOrdenRec(raiz);
    }

    void imprimirPreOrdenRec(Nodo nodo){
        if(nodo != null){
            System.out.print(nodo.dato + " ");
            imprimirPreOrdenRec(nodo.izquierda);
            imprimirPreOrdenRec(nodo.derecha);
        }
    }

    void imprimirPreOrdenD(){
        imprimirPreOrdenRecD(raiz);
    }

    void imprimirPreOrdenRecD(Nodo nodo){
        if(nodo != null){
            System.out.print(nodo.dato + " ");
            imprimirPreOrdenRecD(nodo.derecha);
            imprimirPreOrdenRecD(nodo.izquierda);
        }
    }

    void imprimirPostOrden(){
        imprimirPostOrdenRec(raiz);
    }

    void imprimirPostOrdenRec(Nodo nodo){
        if(nodo != null){
            imprimirPostOrdenRec(nodo.izquierda);
            imprimirPostOrdenRec(nodo.derecha);
            System.out.print(nodo.dato + " ");
        }
    }

    void imprimirPostOrdenD(){
        imprimirPostOrdenRecD(raiz);
    }

    void imprimirPostOrdenRecD(Nodo nodo){
        if(nodo != null){
            imprimirPostOrdenRecD(nodo.derecha);
            imprimirPostOrdenRecD(nodo.izquierda);
            System.out.print(nodo.dato + " ");
        }
    }

}
