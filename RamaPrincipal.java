import java.util.Scanner;

public class RamaPrincipal {

    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
         Metodos metodos = new Metodos(); //crea los objetos de la clase metodos 

         ObjProducto [][] m = new ObjProducto[6][5];//crear matriz 6X5
         m = metodos.CrearMatriz(m); //llenar matriz llamando al metodo

         System.out.println("Ingrese el nombre del producto que desea buscar");
         String n = sc.next();

         metodos.BuscarProducto(m,n);



    }
    
}
