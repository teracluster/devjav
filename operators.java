class operators{
public static void  main(String args[]){
int x=3;
int a=1;
int b=2;

//unary operator 
System.out.println(x++);
System.out.println(x);
System.out.println(++x);

// || checks first condition alone,if it is false checks next, while | checks both the conditions
System.out.println(a>b||a<b);
System.out.println(a>b|a<b);

//10>>2 = 10/2 power 2 = 10/4=2

System.out.println(10>>2);

//10<<2 = 10*2 power 2 = 10*4=40
System.out.println(10<<2);

//For negative number, >>> changes parity bit (MSB) to 0  
System.out.println(-10>>2);
System.out.println(-10>>>2);

}}
