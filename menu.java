import java.util.*;
class menu
{
public static void main(String[]arg)
{
int choice;
String order;
System.out.println("1 for Coffee");
System.out.println("2 for Sandwich");
System.out.println("3 for Burgar");
System.out.println("4 for Chicken Burgar");
System.out.println("5 for Mutton Biryani");
System.out.println("6 for Green tea");
System.out.println("7 for Pizza");
System.out.println("8 for Kebab");
System.out.println("9 for Paratha");
System.out.println("10 for kheer");

System.out.print("Please select Dish Number:");
Scanner obj=new Scanner(System.in);
choice=obj.nextInt();

switch(choice)
{
case 1:

System.out.print("Price of Coffee is Rs 200");

break;
case 2:

System.out.print("price of Sandwich is Rs 230");

break;
case 3:

System.out.print("price of Burgar is Rs 150");

break;
case 4:

System.out.print("price of Chicken Burgar is Rs 210");

break;
case 5:

System.out.print("price of Mutton Biryani is Rs 300");

break;
case 6:

System.out.print("price of Green tea is Rs 70");

break;
case 7:

System.out.print("price of Pizza is Rs 280");

break;
case 8:

System.out.print("price of Kebab is Rs 750");

break;
case 9:

System.out.print("price of Paratha is Rs 45");

break;
case 10:

System.out.print("price of Kheer is Rs 140");

break;
default:

System.out.print("choice not found");
}}}