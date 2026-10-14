package id;
import java.util.Scanner;
public class idservices {
    public void registerID(){
        Scanner home = new Scanner(System.in);
        System.out.println("Enter name of applicant: ");
        String name = home.nextLine();
        System.out.println("Applicant name is: "+name);
        System.out.println("Enter applicant's age: ");
        int age = home.nextInt();
        System.out.println("Age of applicant is: "+age);
        System.out.println("ID registration accomplished.");
    }
}
