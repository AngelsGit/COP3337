package AngelAlfxro;



import java.lang.Math;

public class Trebuchet {
    private int[] arraySpeed;
    private int[] arrayAngle;
    double g = 9.8;
    double radians;
    double distance;

    public Trebuchet(int [] arraySpeed, int [] arrayAngle){
        this.arraySpeed = arraySpeed;
        this.arrayAngle = arrayAngle;
    }

    double[][] calcTrajectory(int[] arraySpeed, int[] arrayAngle){
        double[][] matrixTrajectories = new double[arraySpeed.length][arrayAngle.length];
        for(int i = 0; i < arraySpeed.length; i++){
            for(int j = 0; j < arrayAngle.length; j++){
                double speeds = arraySpeed[i];
                double angles = arrayAngle[j];
                radians = Math.toRadians(angles);
                distance = ((Math.pow(speeds, 2)) * Math.sin(2 * radians)) / g;
                matrixTrajectories[i][j] = Math.round(distance);
            }
        }
        return matrixTrajectories;
    }



}




