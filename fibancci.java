import java.util.*;
class fibancci{
public static void main(String[]arg){
int value, x=0, y=1, z;
System.out.print("Enter the value:");
Scanner obj=new Scanner(System.in);
value=obj.nextInt();
for(int i=1;i<=value;i++){
System.out.print(x+" ");
z=x+y;
x=y;
y=z;
}}}