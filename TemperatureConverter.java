import java.util.Scanner;

public class TemperatureConverter
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature : ");
        double temperature = input.nextDouble();

        System.out.println("Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin)");
        char originalUnit = input.next().charAt(0);

        if (originalUnit == 'C' || originalUnit == 'c') 
        {
            double fk = (temperature * 9/5) + 32;
            double ck = temperature + 273.15;
            System.out.println("Converted to Kelvin: " + ck);
            System.out.println("Converted to Fahrenheit: " + fk);
        } 
        else if (originalUnit == 'F' || originalUnit == 'f') 
        {
            double kc = (temperature - 32) * 5/9 + 273.15;
            double cf = (temperature - 32) * 5/9;
            System.out.println("Converted to Kelvin: " + kc);
            System.out.println("Converted to Celsius: " + cf);
        }
         else if (originalUnit == 'K' || originalUnit == 'k') 
        {
            double kf = (temperature - 273.15) * 9/5 + 32;
            double cf = temperature - 273.15;
            System.out.println("Converted to Celsius: " + cf);
            System.out.println("Converted to Fahrenheit: " + kf);
        }
         else 
        {
            System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        input.close(); 
    }
}
