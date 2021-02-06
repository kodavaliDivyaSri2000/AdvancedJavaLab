import java.rmi.*;
import java.util.*;

public class AmicableClient {
public static void main(String args[]) throws Exception {
int x, y;
String result;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number : ");
x = sc.nextInt();
System.out.println("Enter Second number : ");
y = sc.nextInt();

Amicable ami = (Amicable)Naming.lookup("rmi://localhost:1099/Amicableserver");

result = ami.amicable(x, y);

System.out.println(result);

}
}