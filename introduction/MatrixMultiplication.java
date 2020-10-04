import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int m1 = sc.nextInt();
    int[][] ar1 = new int[n1][m1];
    
    for(int i = 0 ; i <n1 ; i++){
        for(int j = 0; j<m1 ;j++){
            ar1[i][j] = sc.nextInt();
        }
    }
    
    int n2 = sc.nextInt();
    int m2 = sc.nextInt();
    
    int[][] ar2= new int[n2][m2];
     for(int i = 0 ; i <n2 ; i++){
        for(int j = 0; j<m2 ;j++){
            ar2[i][j] = sc.nextInt();
        }
    }
    if(m1 != n2){
        System.out.println("Invalid input");
        return ;
    }
    int[][] product = new int[m1][n2];
    
    for(int i = 0;i<n1 ;i++){
        for(int j =0; j<m2 ; j++){
            for(int k = 0 ;k < m1 ;k++){
                
                product[i][j] +=  ar1[i][k] * ar2[k][j];
            }
        }
    }
    
    for(int i = 0 ; i < m1 ; i++){
        for(int j = 0 ; j< n2 ; j++){
            System.out.print(product[i][j] +" ");
        }
        System.out.println();
    }
    
    
 }

}