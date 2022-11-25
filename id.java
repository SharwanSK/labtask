import java.util.*;
class id{
public static void main(String arg[]){
String email,pass;
System.out.println("Enter email");
Scanner obj=new Scanner(System.in);
email=obj.nextLine();
System.out.println("Enter password");
pass=obj.nextLine();

if
(email.equals("sharwan@gmail.com")&&(pass.equals("1234"))){
System.out.println("Login successfully ");
System.out.println("Welcome to Screen Sir");
}

else if
(email.equals("none@gmail.com")&&(pass.equals("2233"))){
System.out.println(" Welcome  I am Sharwan Kumar");
}

else if
(email.equals("kolhi@gmail.com")&&(pass.equals("4488"))){
System.out.println("Welcome may i help you");
}
else if
(email.equals("kumar@gmail.com")&&(pass.equals("3399"))){
System.out.println("Welcome Sir");
}
else if
(email.equals("roy@gmail.com")&&(pass.equals("1010"))){
System.out.println("welcome Sir");
}
else 
{
 System.out.println("Invalid password or email please make sure your password or email ");
}
}
}