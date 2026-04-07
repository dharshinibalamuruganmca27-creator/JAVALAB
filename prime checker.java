public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       
        int[] inp=new int[5];
        for(int i=0;i<5;i++){
            inp[i]=sc.nextInt();
        }
        
        int upto=Arrays.stream(inp).max().getAsInt();
        boolean[] sieve=new boolean[upto+1];
         Arrays.fill(sieve,true);
         sieve[0]=false;
         sieve[1]=false;
         
         for(int i=2;i*i<=upto;i++){
            int ele=i;
            if(sieve[ele]){
                for(int j=i*i;j<=upto;j+=i){
                    sieve[j]=false;
                }
            }
         }
         Solution.printHelper(sieve, inp[0]);
         Solution.printHelper(sieve, inp[0],inp[1]);
         Solution.printHelper(sieve, inp[0],inp[1],inp[2]);
         Solution.printHelper(sieve, inp[0],inp[1],inp[2],inp[3],inp[4]);
    }
    public static void printHelper(boolean[] primes,int... inps){
        for(int ele:inps){
            System.out.print(primes[ele]?String.valueOf(ele)+" ":"");
        } 
        System.out.println();
    }
}
