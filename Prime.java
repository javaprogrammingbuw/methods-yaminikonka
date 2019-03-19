import java.util.Scanner;


public class Prime {


	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.

	public static boolean isPrime(int a){
		int sum=0;
		for(int i=1;i<a-1;i++){
			if(a%i==0){
				sum=sum+1;
				if(sum>1){
					return false;
				}
				// return true;
			}
				// return true;
			
		}
		return true;
	}
	public static int findDoublette(int a){
		int sum=0;
		for(int j=a+1;j<Integer.MAX_VALUE;j++){
			// for(int i=1;i<a-1;i++){
			boolean b=isPrime(j);
			     
				if(b==true&&sum<1){
                   boolean c=isPrime(j+2);
                     if(c==true){
                     	int x=j+2;
                        System.out.println("the prime-doublette numbers are:"+j+" and "+x);
                        sum=sum++;
                        return j;
                     }

				}
					
				
			// }
		}
		return 0;

	}
	// public static void smallerDoublette(int a){
 //           int num=findDoublette(a);
 //           if(num!=0){
 //           	System.out.println("the smaller one is:"+num);
 //           }else{
 //           	System.out.println(num);
 //           }
	// }
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=scan.nextInt();
		boolean y=isPrime(n);
		if(y==true){
			System.out.println(n+" is prime number");
		}else{
			System.out.println(n+" is not a prime number");
		}
		// System.out.println("give a input for the finding the doublette");
		// int s=scan.nextInt();
		System.out.println("the smaller one is: "+findDoublette(n));
		// smallerDoublette(s);

	}

		
	
}
