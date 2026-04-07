import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
import java.math.BigDecimal;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Sort using a custom comparator
        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                // Convert strings to BigDecimal for numerical comparison
                BigDecimal b1 = new BigDecimal(a1);
                BigDecimal b2 = new BigDecimal(a2);
                
                // We want descending order, so compare b2 to b1
                return b2.compareTo(b1);
            }
        });

        // Output the sorted strings
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
