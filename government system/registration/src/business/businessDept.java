package business;
import java.util.Scanner;
public class businessDept {
    public void businessrequest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the business name: ");
        String businessname = input.nextLine();
        System.out.println("the business name is "+businessname);
        System.out.println("Enter the business ID: ");
        int businessno = input.nextInt();
        System.out.println("Business ID is "+businessno);
        System.out.println("Business request sent");
    }
}
