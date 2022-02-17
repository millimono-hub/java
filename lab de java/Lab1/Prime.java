import java.util.*;

public class Prime{
    String a;
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter a : a > 2  : " );
        int a = input.nextInt();
        for (int i = 2; i <= a; i++) {
            if (isPrime(i) == true)
            {
                System.out.print("  " +i);
            }
        }
        input.close();
    }


        public static boolean isPrime(int n)
    {
        int k=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0)k++;
        }
        if (k>2) return false;
        else return true;
    }
    }



    
      /*  int i =0;
        int a =0;
        //Empty String
        String  primeNumbers = "";
 
        for (i = 1; i <= 100; i++)    //variation des nombres de 2 a 100     
        { 		  	  
           int c=0; 	  //conteur de diviseurs
           for(a =i; a>=1; a--)
        {
              if(i%a==0)  c= c + 1; 
          
         }

       if (c ==2) // que deux diviseurs
       {
          //ajout du nombre a la liste des nombres premiers
          primeNumbers = primeNumbers + i + " ";
       }	
        }	
        System.out.println("Prime numbers between 2 and 100 are :");
        System.out.println(primeNumbers);
    }
  */

