package com.fpmislata.daw2.ejer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {    
   
    
//crear objeto le damos valores y muestro por pantalla
//llamar por pantalla que salga por completo el nombre
    
   public static void main(String[] args){
            
        Persona Persona1 = new Persona("Pepe","Garcia",Sexo.Hombre,"448678452G");    
                Persona Persona2 = new Persona("Jose","Perez",Sexo.Hombre,"887654132i"); 
                    Persona Persona3 = new Persona("Ana","Lopez",Sexo.Mujer,"99865321h");
                    
       
        System.out.println(Persona1.getNombre());
         System.out.println(Persona1.getApellido1());
          System.out.println(Persona1.getSexo());
           System.out.println(Persona1.getDNI());
            System.out.println(Persona1.getNombreCompleto());
     

// crear listas
 /*
   //Array que admite todo tipo de objetos
ArrayList personas = new ArrayList();
   // Array que solo admite personas
   * 
 //Otra forma de crear listas es con likedlist mas facil para introducir por medio del array
LinkedList<Personas>();
//ArrayList<Persona> personas=new ArrayList<Persona>(); 
* 
List<Persona> personas=new ArrayList<Persona>();  // List es el interfaz podemos cambiar arraylist por linkedlist 
List<Persona> personas=new LinkedList<Persona>(); // List se utiliza para no tener que hacer el mismo metodo para distintas formas de acceder a listas

*private static void imprimircosolapersona(List<Personas> personas) // Metodo al que pueden acceder los dos anteriores
*/

      
//Hacer lista mostrar tamaño y objetos
   
   List<Persona> personas=new ArrayList<>();
  
   personas.add(Persona1);
   personas.add(Persona2);
   personas.add(Persona3);
  
   System.out.println("Personas igual a:"+personas.size());
   
   //Bucle for raro para que salga todo 
   for(Persona persona:personas){ //Recorre los objetos de la lista personas y la asigna a la variable personas. Da una vuelta y ejecuta
       System.out.println(persona.getNombreCompleto());
   }
   
   String a="448673452G"; //dni valido 448678452G
   
for(Persona persona:personas){
    
    if (a.equals(persona.getDNI()))

       System.out.println("DNI encontrado:"+persona.getDNI());
 
    else
        System.out.println("DNI no encontrado");
}

System.out.println("NºElementos:"+personas.size());

/*Un map guarda pares relacionados de objetos
   creamos el objeto map
   * Map<String,Persona> mapPersonas=new HashMap<String.Persona>();
   * Sobre el map Persona del tipo String hacemos un put y se añade la clave y el elemento
   * put(persona1.getDni(),persona1);
   */
 
 
 // Una lista son un monton de elementos y añades con add(valor) y obtienes por get(indice) "Elementos consecutivos"
 // Un map con put pones clave y valor put(clave,valor) y con get(clave) te da el valor "Eliges el indice"
 
Map<String,Persona> mapPersonas=new HashMap<String,Persona>();

mapPersonas.put(Persona1.getDNI(),Persona1);
mapPersonas.put(Persona2.getDNI(),Persona2);
mapPersonas.put(Persona3.getDNI(),Persona3);
 
Persona personaBuscada=mapPersonas.get("448678452G");
System.out.println(personaBuscada.getNombre());

  //Key set con esa lista de claves del map. Esa clave tiene asociada un valor comparamos y listo.
 //map.KeySet();
 
Set<String> dnis=mapPersonas.keySet();

for(String dni:dnis){    
Persona persona=mapPersonas.get(dni);

System.out.println(""+persona.getNombre());
}


     
 
 
}
   
}

