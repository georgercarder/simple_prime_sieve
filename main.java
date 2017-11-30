import java.util.Scanner;
import static java.lang.Math.sqrt;

public class main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Once you give an integer, we will print");
        System.out.println("the number of primes between 1 and that integer");
        System.out.println("as well as the greatest prime contained in that set");
        System.out.println();
        System.out.println("Please enter the integer you would like as an upper bound: ");
        int a=sc.nextInt();

        int count=1;
        switch(a){

            case 1: System.out.println("This is a trivial case where 1 is technically not a prime");
            case 2: System.out.println("There is only one prime, it is 2");

            default: int P[]=new int[a];
                    P[1]=2;

                    int i,j;
                    boolean isPrime;
                    for(j=3;j<=a;j+=2){
                        i=1;
                        double s=sqrt(j);
                        isPrime=true;
                        while(P[i]<s){
                            if(j%P[i]==0){    
                                isPrime=false;                        
                                break;
                            }
                            i++;
                        }
                        if(isPrime==true){
                            System.out.println(j);
                            count++;
                            P[count]=j;
                        }


                    }
                    System.out.println("There are "+count+" primes in the");
                    System.out.println("set of integers between 1 and "+a);
                    System.out.println("The greatest prime in this set is "+P[count]);

        }


    }

}
