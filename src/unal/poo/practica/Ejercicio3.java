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
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,0);
           
           
          // terminar en  5 1
          estudiante.move();
          ValidacionObjetos();
         
          estudiante.turnLeft();
          
          PutThings();
          
          Round();
          
          estudiante.move();
          
          Round();
          
          Moves();
          
          ValidacionObjetos();
          
          estudiante.turnLeft();
          estudiante.turnLeft();
          
          PutThings();
          
          Round();
          
          estudiante.move();
          
          Round();
          
          Moves();
          
          ValidacionObjetos();
          
          estudiante.turnLeft();
          estudiante.turnLeft();
         
          PutThings();
          
          Round();
          
          estudiante.move();

          Round();
          
          Moves();
          
          estudiante.turnLeft();
          
          ValidacionObjetos();
         
          estudiante.turnLeft();
          
          int numeroThings = estudiante.countThingsInBackpack();
          
          PutThings();
          
          Round();
          
          estudiante.move();
          
          Round();
          
          for(int i=0; i<numeroThings; i++){
              estudiante.move();
          }
          
          estudiante.turnLeft();

	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
        
        public static void ValidacionObjetos (){
            boolean CanPick = estudiante.canPickThing();
          
          while(CanPick==true){
              estudiante.pickThing();
              CanPick = estudiante.canPickThing();
          }
        }
        
        public static void PutThings(){
            int numeroThings = estudiante.countThingsInBackpack();
            for (int i=0; i<numeroThings; i++){
              estudiante.move();
              estudiante.putThing();
          }
        }
        
        public static void Round(){
            for (int i=0; i<3; i++){
              estudiante.turnLeft();
          }
        }
        public static void Moves(){
            estudiante.move();
            boolean CanPick=estudiante.canPickThing();
            while(CanPick==false){
                estudiante.move();
                CanPick=estudiante.canPickThing();
            }
        }
        
}
