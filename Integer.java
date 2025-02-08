// Program to Count Number of Digits in an Integer
public class Integer {
    public static void main(String[] args){
//         int count = 0, num = 0003452;

//         while(num != 0){
//             num /= 10;
//             ++count;
//         }
//         System.out.println("Number of digits: " + count);
//     }
// }
// using for loop
 int count = 0, num = 123456;
 for(; num != 0; num /= 10, ++count){
 }
 System.out.println("Number of digits: " + count);
}
}