import java.util.Scanner;
/** this program will tell you your balance over a period of time due to intrest
 *
 * @author isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter your starting balance");
    double balance = input.nextDouble();
    
    System.out.println("Please enter your intrest rate");
    double intrest = input.nextDouble()/100;
    System.out.println("Please enter the number of years you will invest for.");
    double years = input.nextInt();
   // intrest x years 5%x5 =1.25
    for (double count = 0; count < 1 ; count++){
      double rsum = (intrest*years) +1;
     double sum = balance* rsum;
     //double money =intrest*sum;
     System.out.print("Your final balance will be " + sum);
    }
  }
}
