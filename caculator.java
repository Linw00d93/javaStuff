import java.util.Scanner;

import org.graalvm.compiler.phases.common.FixReadsPhase;

public class caculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Exit caculator, or select operator");
        String optionsString = myObj.nextLine(); 
        
        
        System.out.println("the User Enter : " + optionsString );  
        switch(optionsString) {
        case "+":
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for addition: ");
            Integer fistNumberForAddition = myInt.nextLine();
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for addition: ");
            Integer secondNumberForAddition = myInt.nextLine();
            int totalAddition = fistNumberForAddition + secondNumberForAddition;
            break;
        case "-":
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for subtraction: ");
            Integer fistNumberForSubtraction = myInt.nextLine();
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for subtraction: ");
            Integer secondNumberForSubtract = myInt.nextLine();
            int totalSubtraction = fistNumberForSubtraction - secondNumberForSubtract;
            break;
        case "*":
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for subtraction: ");
            Integer fistNumberForMulti = myInt.nextLine();
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for subtraction: ");
            Integer secondNumberForMulti = myInt.nextLine();
            int totalMulti = fistNumberForMulti * secondNumberForMulti;
            break;
        case "/":
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for subtraction: ");
            Integer fistNumberForDiv = myInt.nextLine();
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for subtraction: ");
            Integer secondNumberForDiv = myInt.nextLine();
            int totalDiv = fistNumberForDiv / secondNumberForDiv;
            break;    
        case "%":
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for subtraction: ");
            Integer fistNumberForMod = myInt.nextLine();
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Enter First Number for subtraction: ");
            Integer secondNumberForMod = myInt.nextLine();
            int totalMod = fistNumberForMod % secondNumberForMod;
            break;
        default:
            System.out.println("Error");
        }
        
    }
}