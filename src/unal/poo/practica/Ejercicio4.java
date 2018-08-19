package unal.poo.practica;

import becker.robots.*;
import static unal.poo.practica.Ejercicio3.estudiante;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio4
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
            estudiante = new Robot(objetos,8, 1, Direction.NORTH,0);
           
            int Positions[][]=new int[5][4];
            
            for (int i=0; i<5; i++){
                estudiante.move();
            }
            
            for (int i=0; i<3; i++){
                estudiante.turnLeft();
            }
            
            for (int i=0; i<4; i++){
                estudiante.move();
            }
            
            for (int i=0; i<2; i++){
                estudiante.turnLeft();
            }
            
            PickObject(Positions);
            
            System.out.println(Positions[0][0]);
            System.out.println(Positions[0][1]);
            System.out.println(Positions[0][2]);
            System.out.println(Positions[0][3]);
            System.out.println(Positions[1][0]);
            System.out.println(Positions[1][1]);
            System.out.println(Positions[1][2]);
            System.out.println(Positions[1][3]);
            System.out.println(Positions[2][0]);
            System.out.println(Positions[2][1]);
            System.out.println(Positions[2][2]);
            System.out.println(Positions[2][3]);
            System.out.println(Positions[3][0]);
            System.out.println(Positions[3][1]);
            System.out.println(Positions[3][2]);
            System.out.println(Positions[3][3]);
            System.out.println(Positions[4][0]);
            System.out.println(Positions[4][1]);
            System.out.println(Positions[4][2]);
            System.out.println(Positions[4][3]);
            
            estudiante.turnLeft();
            
            for (int i=0; i<6; i++){
                estudiante.move();
            }
            
            estudiante.turnLeft();
            
            for (int i=0; i<8; i++){
                estudiante.move();
            }
            
            for (int i=0; i<3; i++){
                estudiante.turnLeft();
            }
            
            for (int i=0; i<4; i++){
                estudiante.move();
            }
            
            estudiante.turnLeft();
            estudiante.turnLeft();
            
            int Posiciones[][]=new int [5][4];
            Posiciones=Positions;
            
            ReplyThings(Posiciones);
            
            estudiante.turnLeft();
            estudiante.move();
            estudiante.turnLeft();
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
        
        public static void PickObject(int matrix[][]){
            
            int matriz[][]=new int[5][4];
            for(int i=0; i<5; i++){
                    
                for(int j=0; j<4; j++){
                    boolean Picking= estudiante.canPickThing();
                    while(Picking==true){
                        estudiante.pickThing();
                
                        Picking=estudiante.canPickThing();
                        matrix[i][j]=i+j;
                    }
                    estudiante.move();
                        Picking= estudiante.canPickThing();                
                    while(Picking==true){
                        estudiante.pickThing();
                        Picking=estudiante.canPickThing();
                        matrix[i][j]=i+j;
                    }
                    
                    
                    if(i==0 && j==3){
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.turnLeft();
                    }
                    if(i==1 && j==3){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    if(i==2 && j==3){
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.turnLeft();
                    }
                    if(i==3 && j==3){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    
                
                }

                
               
            }
            estudiante.turnLeft();
            estudiante.move();
            
            
           
        }
        
        public static void ReplyThings (int Matrix[][]){
            int matriz[][]=new int[5][4];
            for(int i=0; i<5; i++){
                    
                for(int j=0; j<4; j++){
                   
                    estudiante.move();
                                    
                    if(Matrix[i][j]==i+j){
                        
                        estudiante.putThing();
                        
                    }
                    
                    
                    if(i==0 && j==3){
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.turnLeft();
                    }
                    if(i==1 && j==3){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    if(i==2 && j==3){
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.turnLeft();
                    }
                    if(i==3 && j==3){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    
                    
                   
                    
                
                }

                
               
            }
            estudiante.turnLeft();
            estudiante.move();
         
        }
}

