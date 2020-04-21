
import java.util.Scanner;

public class control {
     
    public static void main(String[] args) {
        //Clase Scanner
        Scanner sc = new Scanner (System.in);
        
        //Atributos de Clase
        int cant=0,noAtleta=0,tiempoCarrera=0;
        String nombre="";
        
        System.out.println("Bienvenido a Competencia Atletismo\n");
        System.out.print("¿Cuantos atletas seran?: ");
        cant=sc.nextInt();
        
        Competencia arrayobjects[] = new Competencia[cant];
        
        for(int i=0; i<cant; i++){
            System.out.println((i+1)+".-Atleta: \n");
            System.out.print("No. Atleta: ");
            noAtleta=sc.nextInt();
            sc.nextLine(); //limpiar el buffer
            System.out.print("Nombre: ");
            nombre=sc.nextLine();
            System.out.print("Tiempo en Carrera: ");
            tiempoCarrera=sc.nextInt();
            
            arrayobjects[i]= new Competencia(noAtleta, nombre,tiempoCarrera);
    }
    
        System.out.println("\n\nTodos los Atletas son: ");
        for(int i=0; i<cant; i++){
            sc.nextLine();
            System.out.println((i+1)+".-Atleta: \n");
            System.out.println("No. Atleta: "+arrayobjects[i].getNoAtleta());
            System.out.println("Nombre: "+arrayobjects[i].getNombre());
            System.out.println("Tiempo en Carrera: "+arrayobjects[i].getTiempoCarrera());
        }
           
        int menor=arrayobjects[0].getTiempoCarrera();
        int indice=0;
        for(int i=0; i<cant; i++){
            if(arrayobjects[i].getTiempoCarrera() < menor){
                menor=arrayobjects[i].getTiempoCarrera();
                indice=i;
            }
        }
        System.out.println("El atleta mas rapido es: "+arrayobjects[indice].MasRapido());
    }
}
