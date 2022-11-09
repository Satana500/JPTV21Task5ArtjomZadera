
import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        int[][] mas = new int[5][];
        Random rand = new Random();
       
        mas[0] = new int[3];
        mas[1] = new int[5];
        mas[2] = new int[7];
        mas[3] = new int[8];
        mas[4] = new int[9];
        System.out.println("Massive");
        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[i].length; j++){
                int max = 100;
                int min = 50;
                mas[i][j] = rand.nextInt(max - min + 1) + min;

            }
            System.out.println(Arrays.toString(mas[i]));
        }  
        System.out.println("=====================================");
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++){
                for(int n = 0; n < mas.length; n++){
                    for(int m = 0; m < mas[n].length; m++){
                        if(mas[i][j]<mas[n][m]){
                            mas[i][j] = mas[i][j]+mas[n][m];
                            mas[n][m] = mas[i][j]-mas[n][m];
                            mas[i][j] = mas[i][j]-mas[n][m];
                        }
                    }
                }           
            }   
            
          }
          for(int i = 0; i < mas.length; i++){
                for(int j = 0; j < mas[i].length; j++){
                
                
                    System.out.printf("%4d", mas[i][j]);
                }
                System.out.println();
            }
        }
        
    }
