package AngelAlfxro;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.io.IOException;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("text.txt");
        Scanner s = new Scanner(fr);
        int firstNumber = s.nextInt();
        int minWall;
        int maxWall;

        try {
            for (int i = 0; i < firstNumber; i++) {
                int secondNumber = s.nextInt();
                int[] numSpeedArray = new int[secondNumber];
                for (int col1 = 0; col1 < secondNumber; col1++) {
                    numSpeedArray[col1] = s.nextInt();
                }
                int thirdNumber = s.nextInt();
                int[] numAngleArray = new int[thirdNumber];
                for (int col2 = 0; col2 < thirdNumber; col2++) {
                    numAngleArray[col2] = s.nextInt();
                }

                minWall = s.nextInt();
                maxWall = s.nextInt();


                System.out.println();
                System.out.println();
                System.out.println("------------------------------------------------------");
                System.out.println();
                System.out.println("                  Projectile Table                 ");
                System.out.println();
                System.out.println("-----------------------------------------------------");


                Trebuchet missile = new Trebuchet(numSpeedArray, numAngleArray);
                // missile.returnMatrixData(numSpeedArray, numAngleArray);
                double[][] trajectoryMatrix = missile.calcTrajectory(numSpeedArray, numAngleArray);
                System.out.println();


                // display all possible trajectories
                System.out.print("Speeds ");
                for (int l = 0; l < numAngleArray.length; l++) {
                    System.out.print(numAngleArray[l] + " deg  ");
                }
                System.out.println();
                System.out.println();
                for (int a = 0; a < trajectoryMatrix.length; a++) {
                    System.out.print(numSpeedArray[a] + " " + "\t" + "\t");
                    for (int b = 0; b < trajectoryMatrix[a].length; b++) {
                        System.out.print(trajectoryMatrix[a][b] + " " + "\t");
                    }
                    System.out.println();
                }
                // best trajectories
                System.out.println();
                System.out.println("here are the best trajectories: ");
                System.out.println();
                for (int row = 0; row < trajectoryMatrix.length; row++) {
                    for (int col = 0; col < trajectoryMatrix[row].length; col++) {
                        double trajectory = trajectoryMatrix[row][col];
                        if (trajectory >= minWall && trajectory <= maxWall) {
                            System.out.print(trajectory + ", " + " ");
                        }
                    }
                }


            }
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }


    }


}

