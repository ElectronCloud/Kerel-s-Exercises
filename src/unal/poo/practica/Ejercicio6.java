package unal.poo.practica;

import becker.robots.*;
import static unal.poo.practica.Ejercicio4.estudiante;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio6
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
            estudiante = new Robot(objetos,6, 2, Direction.NORTH,0);
            
            // Al final el robot debe imprimir el numero oculto 
           int First[][]=new int[1][15];
           int Second[][]=new int[1][15];
           int Third[][]=new int[1][15];
            
           estudiante.move();
           for(int i=0; i<3; i++){
               estudiante.turnLeft();
           }
           estudiante.move();
           estudiante.turnLeft();
           for(int i=0; i<4; i++){
               estudiante.move();
           }
           estudiante.turnLeft();
           ReadingNumbers(First);
           
           int centena=0;
           
           if(First[0][0]==0 && First[0][1]==1 && First[0][2]==2 && First[0][3]==3 && First[0][4]==0 && First[0][5]==5 && First[0][6]==6 && First[0][7]==0 && First[0][8]==8 && First[0][9]==9 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==13 && First[0][14]==14){
               
               centena=0;
           }
           if(First[0][0]==0 && First[0][1]==0 && First[0][2]==0 && First[0][3]==0 && First[0][4]==0 && First[0][5]==5 && First[0][6]==6 && First[0][7]==0 && First[0][8]==0 && First[0][9]==0 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==0 && First[0][14]==0){
               
               centena=1;
           }
           if(First[0][0]==0 && First[0][1]==1 && First[0][2]==2 && First[0][3]==0 && First[0][4]==0 && First[0][5]==5 && First[0][6]==6 && First[0][7]==7 && First[0][8]==8 && First[0][9]==9 && First[0][10]==0 && First[0][11]==0 && First[0][12]==12 && First[0][13]==13 && First[0][14]==14){
               
               centena=2;
           }
           if(First[0][0]==0 && First[0][1]==1 && First[0][2]==2 && First[0][3]==0 && First[0][4]==0 && First[0][5]==5 && First[0][6]==6 && First[0][7]==7 && First[0][8]==8 && First[0][9]==0 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==13 && First[0][14]==14){
               
               centena=3;
           }
           if(First[0][0]==0 && First[0][1]==0 && First[0][2]==2 && First[0][3]==3 && First[0][4]==0 && First[0][5]==5 && First[0][6]==6 && First[0][7]==7 && First[0][8]==8 && First[0][9]==0 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==0 && First[0][14]==0){
               
               centena=4;
           }
           if(First[0][0]==0 && First[0][1]==1 && First[0][2]==2 && First[0][3]==3 && First[0][4]==0 && First[0][5]==0 && First[0][6]==6 && First[0][7]==7 && First[0][8]==8 && First[0][9]==0 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==13 && First[0][14]==14){
               
               centena=5;
           }
           if(First[0][0]==0 && First[0][1]==1 && First[0][2]==2 && First[0][3]==3 && First[0][4]==0 && First[0][5]==0 && First[0][6]==6 && First[0][7]==7 && First[0][8]==8 && First[0][9]==9 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==13 && First[0][14]==14){
               
               centena=6;
           }
           if(First[0][0]==0 && First[0][1]==1 && First[0][2]==2 && First[0][3]==0 && First[0][4]==0 && First[0][5]==5 && First[0][6]==6 && First[0][7]==0 && First[0][8]==0 && First[0][9]==0 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==0 && First[0][14]==0){
               
               centena=7;
           }
           if(First[0][0]==0 && First[0][1]==1 && First[0][2]==2 && First[0][3]==3 && First[0][4]==0 && First[0][5]==5 && First[0][6]==6 && First[0][7]==7 && First[0][8]==8 && First[0][9]==9 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==13 && First[0][14]==14){
               
               centena=8;
           }
           if(First[0][0]==0 && First[0][1]==1 && First[0][2]==2 && First[0][3]==3 && First[0][4]==0 && First[0][5]==5 && First[0][6]==6 && First[0][7]==7 && First[0][8]==8 && First[0][9]==0 && First[0][10]==0 && First[0][11]==11 && First[0][12]==12 && First[0][13]==13 && First[0][14]==14){
               
               centena=9;
           }
           
            estudiante.turnLeft();
            for(int i=0; i<3; i++){
                estudiante.move();
            }
            estudiante.turnLeft();
            estudiante.move();
           for(int i=0; i<3; i++){
               estudiante.turnLeft();
           }
           estudiante.move();
           estudiante.turnLeft();
           for(int i=0; i<4; i++){
               estudiante.move();
           }
           estudiante.turnLeft();
           ReadingNumbers(Second);
           
           int decena=0;
           
           if(Second[0][0]==0 && Second[0][1]==1 && Second[0][2]==2 && Second[0][3]==3 && Second[0][4]==0 && Second[0][5]==5 && Second[0][6]==6 && Second[0][7]==0 && Second[0][8]==8 && Second[0][9]==9 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==13 && Second[0][14]==14){
               
               decena=0;
           }
           if(Second[0][0]==0 && Second[0][1]==0 && Second[0][2]==0 && Second[0][3]==0 && Second[0][4]==0 && Second[0][5]==5 && Second[0][6]==6 && Second[0][7]==0 && Second[0][8]==0 && Second[0][9]==0 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==0 && Second[0][14]==0){
               
               decena=1;
           }
           if(Second[0][0]==0 && Second[0][1]==1 && Second[0][2]==2 && Second[0][3]==0 && Second[0][4]==0 && Second[0][5]==5 && Second[0][6]==6 && Second[0][7]==7 && Second[0][8]==8 && Second[0][9]==9 && Second[0][10]==0 && Second[0][11]==0 && Second[0][12]==12 && Second[0][13]==13 && Second[0][14]==14){
               
               decena=2;
           }
           if(Second[0][0]==0 && Second[0][1]==1 && Second[0][2]==2 && Second[0][3]==0 && Second[0][4]==0 && Second[0][5]==5 && Second[0][6]==6 && Second[0][7]==7 && Second[0][8]==8 && Second[0][9]==0 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==13 && Second[0][14]==14){
               
               decena=3;
           }
           if(Second[0][0]==0 && Second[0][1]==0 && Second[0][2]==2 && Second[0][3]==3 && Second[0][4]==0 && Second[0][5]==5 && Second[0][6]==6 && Second[0][7]==7 && Second[0][8]==8 && Second[0][9]==0 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==0 && Second[0][14]==0){
               
               decena=4;
           }
           if(Second[0][0]==0 && Second[0][1]==1 && Second[0][2]==2 && Second[0][3]==3 && Second[0][4]==0 && Second[0][5]==0 && Second[0][6]==6 && Second[0][7]==7 && Second[0][8]==8 && Second[0][9]==0 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==13 && Second[0][14]==14){
               
               decena=5;
           }
           if(Second[0][0]==0 && Second[0][1]==1 && Second[0][2]==2 && Second[0][3]==3 && Second[0][4]==0 && Second[0][5]==0 && Second[0][6]==6 && Second[0][7]==7 && Second[0][8]==8 && Second[0][9]==9 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==13 && Second[0][14]==14){
               
               decena=6;
           }
           if(Second[0][0]==0 && Second[0][1]==1 && Second[0][2]==2 && Second[0][3]==0 && Second[0][4]==0 && Second[0][5]==5 && Second[0][6]==6 && Second[0][7]==0 && Second[0][8]==0 && Second[0][9]==0 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==0 && Second[0][14]==0){
               
               decena=7;
           }
           if(Second[0][0]==0 && Second[0][1]==1 && Second[0][2]==2 && Second[0][3]==3 && Second[0][4]==0 && Second[0][5]==5 && Second[0][6]==6 && Second[0][7]==7 && Second[0][8]==8 && Second[0][9]==9 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==13 && Second[0][14]==14){
               
               decena=8;
           }
           if(Second[0][0]==0 && Second[0][1]==1 && Second[0][2]==2 && Second[0][3]==3 && Second[0][4]==0 && Second[0][5]==5 && Second[0][6]==6 && Second[0][7]==7 && Second[0][8]==8 && Second[0][9]==0 && Second[0][10]==0 && Second[0][11]==11 && Second[0][12]==12 && Second[0][13]==13 && Second[0][14]==14){
               
               decena=9;
           }
           
           estudiante.turnLeft();
            for(int i=0; i<3; i++){
                estudiante.move();
            }
            estudiante.turnLeft();
            estudiante.move();
           for(int i=0; i<3; i++){
               estudiante.turnLeft();
           }
           estudiante.move();
           estudiante.turnLeft();
           for(int i=0; i<4; i++){
               estudiante.move();
           }
           estudiante.turnLeft();
           ReadingNumbers(Third);
           
           int unidad=0;
           
           if(Third[0][0]==0 && Third[0][1]==1 && Third[0][2]==2 && Third[0][3]==3 && Third[0][4]==0 && Third[0][5]==5 && Third[0][6]==6 && Third[0][7]==0 && Third[0][8]==8 && Third[0][9]==9 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==13 && Third[0][14]==14){
               
               unidad=0;
           }
           if(Third[0][0]==0 && Third[0][1]==0 && Third[0][2]==0 && Third[0][3]==0 && Third[0][4]==0 && Third[0][5]==5 && Third[0][6]==6 && Third[0][7]==0 && Third[0][8]==0 && Third[0][9]==0 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==0 && Third[0][14]==0){
               
               unidad=1;
           }
           if(Third[0][0]==0 && Third[0][1]==1 && Third[0][2]==2 && Third[0][3]==0 && Third[0][4]==0 && Third[0][5]==5 && Third[0][6]==6 && Third[0][7]==7 && Third[0][8]==8 && Third[0][9]==9 && Third[0][10]==0 && Third[0][11]==0 && Third[0][12]==12 && Third[0][13]==13 && Third[0][14]==14){
               
               unidad=2;
           }
           if(Third[0][0]==0 && Third[0][1]==1 && Third[0][2]==2 && Third[0][3]==0 && Third[0][4]==0 && Third[0][5]==5 && Third[0][6]==6 && Third[0][7]==7 && Third[0][8]==8 && Third[0][9]==0 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==13 && Third[0][14]==14){
               
               unidad=3;
           }
           if(Third[0][0]==0 && Third[0][1]==0 && Third[0][2]==2 && Third[0][3]==3 && Third[0][4]==0 && Third[0][5]==5 && Third[0][6]==6 && Third[0][7]==7 && Third[0][8]==8 && Third[0][9]==0 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==0 && Third[0][14]==0){
               
               unidad=4;
           }
           if(Third[0][0]==0 && Third[0][1]==1 && Third[0][2]==2 && Third[0][3]==3 && Third[0][4]==0 && Third[0][5]==0 && Third[0][6]==6 && Third[0][7]==7 && Third[0][8]==8 && Third[0][9]==0 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==13 && Third[0][14]==14){
               
               unidad=5;
           }
           if(Third[0][0]==0 && Third[0][1]==1 && Third[0][2]==2 && Third[0][3]==3 && Third[0][4]==0 && Third[0][5]==0 && Third[0][6]==6 && Third[0][7]==7 && Third[0][8]==8 && Third[0][9]==9 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==13 && Third[0][14]==14){
               
               unidad=6;
           }
           if(Third[0][0]==0 && Third[0][1]==1 && Third[0][2]==2 && Third[0][3]==0 && Third[0][4]==0 && Third[0][5]==5 && Third[0][6]==6 && Third[0][7]==0 && Third[0][8]==0 && Third[0][9]==0 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==0 && Third[0][14]==0){
               
               unidad=7;
           }
           if(Third[0][0]==0 && Third[0][1]==1 && Third[0][2]==2 && Third[0][3]==3 && Third[0][4]==0 && Third[0][5]==5 && Third[0][6]==6 && Third[0][7]==7 && Third[0][8]==8 && Third[0][9]==9 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==13 && Third[0][14]==14){
               
               unidad=8;
           }
           if(Third[0][0]==0 && Third[0][1]==1 && Third[0][2]==2 && Third[0][3]==3 && Third[0][4]==0 && Third[0][5]==5 && Third[0][6]==6 && Third[0][7]==7 && Third[0][8]==8 && Third[0][9]==0 && Third[0][10]==0 && Third[0][11]==11 && Third[0][12]==12 && Third[0][13]==13 && Third[0][14]==14){
               
               unidad=9;
           }
           
            System.out.println(centena*100+decena*10+unidad);
	}
        
        public static void ReadingNumbers(int matrix[][]){
            
            int matriz[][]=new int[1][15];
            for(int i=0; i<1; i++){
                for(int j=0; j<16; j++){
                    if(i==0 && j==2){
                        estudiante.turnLeft();
                        }
                        if(i==0 && j==3){
                            estudiante.turnLeft();
                        }
                    if(i==0 && j==5){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        }
                    if(i==0 && j==6){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    if(i==0 && j==8){
                        estudiante.turnLeft();
                    }
                    if(i==0 && j==9){
                        estudiante.turnLeft();
                    }
                    if(i==0 && j==11){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    if(i==0 && j==12){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    if(i==0 && j==14){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    if(i==0 && j==15){
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                        estudiante.turnLeft();
                    }
                    
                    boolean Picking= estudiante.canPickThing();
                    while(Picking==true){
                        estudiante.pickThing();
                        Picking=estudiante.canPickThing();
                        matrix[i][j]=j;
                    }
                estudiante.move();
                }
            }
        }
}
