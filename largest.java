// Program to Find the Largest Among Three Numbers
public class largest {
    public static void main(String[] args){
        double n1 = -4.5, n2 = 3.9, n3 = 5.5;

//         if(n1 >= n2 && n1 >= n3)
//            System.out.println(n1 + " is the largest number.");
        
//         else if(n2 >= n1 && n2 >= n3)
//            System.out.println(n2 + " is the largest number.");

//         else
//            System.out.println(n3 + " is the largest number.");
//     }
// }
// using nested if... else statement
            if(n1 >= n2) {
                if(n1 >= n3)
                   System.out.println(n1 + " is the largest number.");
                else
                   System.out.println(n3 + " is the largest number.");
                } 
            else {
                if(n2 >= n3)
                   System.out.println(n2 + " is the largest number.");
                else
                   System.out.println(n3 + " is the largest number.");
                }
    }
}