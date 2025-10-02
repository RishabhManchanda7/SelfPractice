

import java.util.*;


 class reverse {

     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

         int n = scn.nextInt();

         while(n>0){

             int dig = n % 10;  // last ka digit uthane ke liye end se phele laane ke liye
            n =n/10;    // divide krne ke liye
             System.out.print(dig);
         }
     }


}
