package Lab_2;

import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println( "Please input your weight:");
    float weight = input.nextFloat();
    System.out.println("Please input your height: ");
    float height =input.nextFloat();
    input.close();
    float BMI = weight / (height*2);
    System.out.println("Your BMI is" + BMI);

  }
}
