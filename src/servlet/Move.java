package servlet;


/**
 * Created by hanieh on 8/4/2017 AD.
 */
public class Move {


  public static void rightfunc(String colors[][],int j){

        String swap=colors[j][4];
        for (int i=3;i>=0;i--){
            colors[j][i+1]=colors[j][i];
        }
        colors[j][0]=swap;
    }
    public static void leftfunc(String colors[][],int j){

        String swap=colors[j][0];
        for (int i=0;i<4;i++){
            colors[j][i]=colors[j][i+1];
        }
        colors[j][4]=swap;
    }
    public static void downfunc(String colors[][],int j){

        String swap=colors[4][j];
        for (int i=3;i>=0;i--){
            colors[i+1][j]=colors[i][j];
        }
        colors[0][j]=swap;
    }
    public static void upfunc(String colors[][],int j){

        String swap=colors[0][j];
        for (int i=0;i<4;i++){
            colors[i][j]=colors[i+1][j];
        }
        colors[4][j]=swap;
    }

}
