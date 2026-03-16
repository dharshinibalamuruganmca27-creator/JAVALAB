import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
     for(int j=0;j<t;j++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int result = a;
        for(int i=0;i<n;i++){
            result += (1 << i) * b;
            System.out.print(result + " ");
        }

        System.out.println();
     }
     sc.close();
}
}
