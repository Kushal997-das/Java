import java.io.*;
import java.util.*;

public class MatrixAddition 
{
  public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
       int[][] ar1 = new int[n1][n1];
    
     for(int i = 0 ; i <n1 ; i++){
        for(int j = 0; j<n1 ;j++){
            ar1[i][j] = sc.nextInt();
        }
     }
    
     int n2 = sc.nextInt(); 
     int[][] ar2= new int[n2][n2];
     for(int i = 0 ; i <n2 ; i++){
        for(int j = 0; j<n2 ;j++){
            ar2[i][j] = sc.nextInt();
        }
     }

     int[][] sum = new int[n1][n2];
     
     for(int i = 0;i <n1 ;i++){
     	for (int j = 0;j<n2 ;j++ ) 
     	{
     		sum[i][j] = ar1[i][j] + ar2[i][j];

     	}
      }

     for (int i=0;i<n1 ;i++ ) {
     	for (int j =0;j<n2 ;j++ ) {
     		System.out.print(sum[i][j]+" ");
     	}
     	System.out.println();
     }
	}
}