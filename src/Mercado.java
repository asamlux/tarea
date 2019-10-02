import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Mercado {

    public static void main(String args[]) {
        Producto jugo = new Producto("jugo", 6);
        Producto paquete = new Producto("paquetes", 2);
        Producto melon = new Producto("melon", 5);
        Producto yuca = new Producto("yuca", 2);
        Producto papas = new Producto("papas", 2);

        ArrayList lista = new ArrayList();

        lista.add(1,jugo);
        lista.add(2,yuca);
        lista.add(1,paquete);        
        lista.add(3,melon);
        lista.add(1,papas);

    System.out.println(" Lista del mercado con " + lista.size()+ " productos");
    

        Iterator it = lista.iterator();
        Collections.sort(lista);

while (it.hasNext()) {
        Object objeto = it.next();
        Producto producto = (Producto) objeto;
        System.out.println(producto);
        }

        lista.remove(2);
        System.out.println(" Lista del mercado con " + lista.size() + " productos");

        Iterator it2 = lista.iterator();
        while (it2.hasNext()) {
            Producto producto = (Producto) it2.next();
            System.out.println(producto);
        }

        lista.clear();
        System.out.println(" Lista del mercado con " + lista.size() + " productos");
    }
}