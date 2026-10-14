package tax;
import java.util.Scanner;
public class taxfare {
    public void computetax(){
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter income per annum: ");
        double incomeperannum = calc.nextDouble();
        double taxrequired = incomeperannum * 0.15;
        System.out.println("Tax required is "+taxrequired);
    }
}
