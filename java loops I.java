import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());
        
    int i = 1;
    while(i<11){
    System.out.println(String.valueOf(N)+" x "+String.valueOf(i)+" = "+String.valueOf(N*i)); 
        i++;
    }
    System.out.println();


        bufferedReader.close();
}
    }
