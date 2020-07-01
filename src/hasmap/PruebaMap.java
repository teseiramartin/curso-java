package hasmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PruebaMap{
    public static void main(String[] args) {
        HashMap diccionario = new HashMap();
        diccionario.put("email", "teseiramartin@gmail.com");
        diccionario.put("user", "martinteseira");
        diccionario.put("facebook", "www.facebook.com/martinteseira");

        String nombreUsuario = diccionario.get("user").toString();
        System.out.println(nombreUsuario);
        boolean respuesta = diccionario.containsKey("twiter");
        System.out.println(respuesta);

        System.out.println();

        // otra forma de declarar e instanciar un HasMap
        Map<Integer, String> mapaNombres = new HashMap<>();
        //agregar
        mapaNombres.put(1,"Martin");
        mapaNombres.put(5,"Juana");
        mapaNombres.put(147,"Karen");
        mapaNombres.put(42,"Cristian");
        //mostrar mapa, valores y llaves del HasMap
        System.out.println(mapaNombres);
        System.out.println(mapaNombres.values());
        System.out.println(mapaNombres.keySet());
        //eliminar un valor
        mapaNombres.remove(42);
        System.out.println(mapaNombres);
        //borrar contenido
            //mapaNombres.clear();
        //consultar
        System.out.println(mapaNombres.get(147));
        //consultar si el HashMap tiene un valor determinado
        if (mapaNombres.containsValue("karen"))
            System.out.println("SI CONTIENE EL VALOR");
        else
            System.out.println("NO CONTIENE EL VALOR");
        //recorrer HasMap con un iterador
        Iterator<Integer> iterator = mapaNombres.keySet().iterator(); //nos va devolver unos datos set

        while(iterator.hasNext()){ //hasnext verifica si hay un nuevo valor
            Integer llave = iterator.next();
            System.out.println(llave + " - " + mapaNombres.get(llave));
        }
    }
}

