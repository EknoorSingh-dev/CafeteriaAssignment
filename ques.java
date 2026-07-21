
///////////even odd

// import java.util.Scanner;


// public class quest{
//     public static void main(String[] args){
// Scanner s = new Scanner(System.in);
// int num = s.nextInt();
// for(int i=0;i<=num;i++){
//     if(i%2==0){
//         System.out.println("even "+i);
//     }
//     else{
//         System.out.println("odd "+i);
//     }
// }
// }
// }

//////////multiplication table


// import java.util.Scanner;


// public class quest{
//     public static void main(String[] args){
// Scanner s = new Scanner(System.in);
// int num = s.nextInt();
// for(int i=1;i<=108;i++){
//     System.out.println(num+ "x"+ i+"="+(num*i));
// }
// }}

/////////prime number

// import java.util.Scanner;


// public class quest{
//     public static void main(String[] args){
// Scanner s = new Scanner(System.in);
// int num = s.nextInt();
// boolean a=true;
// for(int i=0;i<=num;i++){
// if(i<2){
//     a=false;
//     continue;
// }
// for(int j=2;j<=Math.sqrt(num);j++){
//     if(i%j!=0){
//     a=true;
//     }
//     else{
//         a=false;
//     }
// }
// if(a==true){
//     System.out.println("primenum "+i);
// }
// }
// }
// }


///////////guess number

// import java.util.Scanner; 

// public class quest { 
//     public static void main(String[] args) { 
//         Scanner s = new Scanner(System.in); 
//         int num = (int)(Math.random() * 100) + 1; 
//         int count = 0; 
//         boolean found = false; 
        
//         System.out.println("I'm thinking of a number between 1 and 100. Start guessing!"); 

//         // Fixed: Use <= 5 to give the player exactly 5 attempts
//         for (int i = 1; i <= 100; i++) { 
//             int a = s.nextInt(); 
//             count++; 

//             if (a == num) { 
//                 System.out.println("You guessed the number by trying -> " + count + " times!"); 
//                 found = true; 
//                 break; 
//             } else if (a < num) { 
//                 System.out.println("Number is too low"); 
//             } else { 
//                 System.out.println("Number is too high"); 
//             } 
//         } // Loop ends here

//         // Fixed: Moved outside the loop to execute only after all attempts are exhausted
//         if (found == false) { 
//             System.out.println("Better luck next time! The correct number was: " + num); 
//         } 

//         s.close(); 
//     } 
// }


////////////////strong number

// import java.util.Scanner;

// public class quest {
//     // 1. Helper method to calculate the factorial of a single digit
//     public static int getFactorial(int digit) {
//         int fact = 1;
//         for (int i = 1; i <= digit; i++) {
//             fact *= i;
//         }
//         return fact;
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
        
//         System.out.print("Enter lower limit: ");
//         int start = s.nextInt();
        
//         System.out.print("Enter upper limit: ");
//         int end = s.nextInt();
        
//         System.out.println("Strong numbers in the given range are:");
        
//         // 2. Loop through every number in the specified range
//         for (int i = start; i <= end; i++) {
//             int temp = i;
//             int sum = 0;
            
//             // 3. Extract digits and sum up their factorials
//             while (temp > 0) {
//                 int digit = temp % 10;
//                 sum += getFactorial(digit);
//                 temp /= 10;
//             }
            
//             // 4. Verify if the sum matches the original index value
//             if (sum == i) {
//                 System.out.print(i + " ");
//             }
//         }
        
//         System.out.println(); // Prints a clean newline at the end
//         s.close();
//     }
// }




