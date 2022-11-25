import java.util.*;
class calculation
{
public static void main(String arg[]){
int x;
int y;
System.out.println("Enter two numbers:");
Scanner obj=new Scanner(System.in);
x=obj.nextInt();
y=obj.nextInt();
System.out.println("additon"+(x+y));
System.out.println("substraction"+(x-y));
System.out.println("multiplication"+(x*y));
System.out.println("division"+(x/y));
}}