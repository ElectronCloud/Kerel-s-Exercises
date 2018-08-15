package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio3
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,10);
           
           
          // terminar en  5 1
          estudiante.move();
          boolean CanPick = estudiante.canPickThing();
          //int numb;
          while (CanPick==true){
             
              estudiante.pickThing();
            
          }
          
          int numeroThings = estudiante.countThingsInBackpack();
          
          estudiante.turnLeft();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            for (int i=0; i<numeroThings; i++){
                estudiante.move();
                estudiante.putThing();
            }
            
          /*for (int i=0; i<3; i++){
              boolean CanPick = estudiante.canPickThing();
           
           if (CanPick==true){
               estudiante.pickThing();
           }
          }*/
           
                   
     
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

