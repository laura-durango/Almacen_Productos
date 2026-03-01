import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class Metodos {
    Scanner sc = new Scanner (System.in);

    public ObjProducto[][] CrearMatriz(ObjProducto[][]m){
        for (int i = 0; i < m.length; i++) { //filas
            for (int j = 0; j < m.length; j++) { // columnas
                ObjProducto o = new ObjProducto(); //para poder acceder a los metodos y atributos de la clase objetual y acceder a cada uno de los valores 
                 System.out.println("Ingrese el nombre del producto en la posición [\" + i + \"][\" + j + \"]:");
                 o.setNombre(sc.next());
                 System.out.println( " Ingrese el precio del producto:");
                 o.setPrecio(sc.nextInt());
                 System.out.println("Ingrese la cantidad del producto");
                 o.setCantidad(sc.nextInt());
                 sc.nextInt();//borrar espacio de memoria 

                 m[i][j] = o;

                
            }
        }
        return m;



    }
    //Buscar el producto
    //public int [] BuscarProducto (ObjProducto[][] m){ //int[] como retorno → para devolver la posición {fila, columna} del un producto //devuelve la posicion 
        
       // System.out.println("Ingrese el nombre del producto buscado");
        //String nombreBuscado = sc.next();

        //for (int i = 0; i < m.length; i++) {
           // for (int j = 0; j < m.length; j++) {

              //  if (m[i][j].getNombre().equalsIgnoreCase(nombreBuscado)) { //para comprorar el nombre ingresado con el buscado
                    
                
               //  return new int[]{i, j};//Retorna la posicion si la encontramos 
           // }
            
       // }

       
    //}
 //return null; //Si no la encuentra retorna null
   // }

    public void BuscarProducto (ObjProducto[][] m, String nombreBuscado){ //No retorna nada, solo muestra la posicion
        boolean encontrado = false;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (m[i][j].getNombre().equalsIgnoreCase(nombreBuscado)){

                    System.out.println("Producto encontrado en:");
                    System.out.println("Fila: " + i);
                    System.out.println("Columna: " + j);
                    System.out.println("--------------------- n");

                    encontrado = true;
                    return; //termina el metodo cuando lo encuentra 
                }
                
            }
            
        }
         if (!encontrado) {
            System.out.println("Producto no encontrado");
    }
}

}
