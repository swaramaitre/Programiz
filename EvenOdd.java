// Program to Check Whether a Number is Even or Odd
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = reader.nextInt();

//         if(num % 2 == 0)
//             System.out.println(num + " is even");
//         else
//             System.out.println(num + " is odd");
//     }
// }
// using ternanry operator
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        
        System.out.println(num + " is " + evenOdd);

        reader.close();
    }
}