import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static  void main(String[] args) {
        System.out.println("Kalkulator");
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Podaj działanie");
            String chosen = scan.nextLine();
            Onp(chosen);
        }
    }
    static Boolean ifIsOperator(String o) {
        String[] operations = { "+", "-", "*", "/", "mod", "pow", "sqrt" };
        for (String operation : operations) {
            if (o.equals(operation)) {
                return true;
            }
        }
        return false;
    }
    public static void Onp (String op) {
        Stack <Double> stos = new Stack<>();
        String[] parts = op.split(" ");     //split string
        String result = "";

        for (int i = 0; i < parts.length; i++) {
            if(ifIsOperator(parts[i])) {    //when symbol is an operator
                Double b = stos.pop();
                Double a = stos.pop();


                String w = switch(parts[i]) {   //calculate the operation
                    case "+" -> (a + b) + "";
                    case "-" -> (a - b) + "";
                    case "*" -> (a * b) + "";
                    case "/" -> (a / b) + "";
                    case "pow" -> Math.pow(a, b) + "";
                    case "sqrt" -> Math.pow(a, 1.0 / b) + "";
                    case "mod" -> (a % b) + "";
                    default -> "Nie można wykonać operacji";
                };
                stos.push(Double.parseDouble(w));
                continue;
            } else {    //when symbol is a number
                stos.push(Double.parseDouble(parts[i]));
                continue;
            }
        }
        result = stos.pop() + "";
        System.out.println(result + "");    //return final result
    }

}
