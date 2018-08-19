package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio5
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
            estudiante = new Robot(objetos,11, 1, Direction.NORTH,42);
           
            estudiante.move();
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            Ordenar();
            estudiante.move();
            estudiante.turnLeft();
            
     
	}
        
        public static void Ordenar (){
            int numeroThings = estudiante.countThingsInBackpack();
            int Aleatorio = (int) (Math.random()*10+1);
            
            if(numeroThings!=0 && numeroThings<=100){
            for(int i=1; i<=numeroThings; i++){
                   
                    
                   estudiante.move();
                   estudiante.putThing();
               if(i==10){
                   estudiante.turnLeft();
               }
               if(i==11){
                   estudiante.turnLeft();
               }
               if(i==20){
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.turnLeft();
               }
               if(i==21){
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.turnLeft();
               }
               if(i==30){
                   estudiante.turnLeft();
               }
               if(i==31){    
                   estudiante.turnLeft();
               }
               if(i==40){
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.turnLeft();
               }
               if(i==41){
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.turnLeft();
               }
               if(i==50){
                   estudiante.turnLeft();
               }
               if(i==51){
                   estudiante.turnLeft();
               }
                if(i==60){
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                }
                if(i==61){
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.turnLeft();
               }
               if(i==70){
                   estudiante.turnLeft();
               }
               if(i==71){
                   estudiante.turnLeft();
               }
                if(i==80){
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                }
                if(i==81){
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.turnLeft();
               }
               if(i==90){
                   estudiante.turnLeft();
               }
               if(i==91){
                   estudiante.turnLeft();
                  
            }
            }
            }
        }
}