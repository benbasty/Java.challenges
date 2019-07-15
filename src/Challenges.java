import java.util.Scanner;

public class Challenges {

    public static void main(String[] args) {
        // first challenge : In this challenge, we practice printing to stdout.
        System.out.println("Hello world !");
        System.out.println("My name is Ben");
        System.out.println("And I have decided to be a Java Developer");

        // second challenges : Java Stdin and Stdout I
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell me something about You in a word: ");
        String firstString = scanner.next();
        System.out.print("Give me your favorite number: ");
        int firstInt = scanner.nextInt();

        System.out.printf("You are %s and your favorite number is %d%n", firstString, firstInt);

        // challenge 3 java if-else
        System.out.println(" ");
        System.out.print("Give me a random int number: ");
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("The number you entered is odd");
        }
        if (n % 2 == 0) {
            System.out.println("The number you entered is even");
        }
        // challenge 4 output formatting
        System.out.println("Now we are going to try something");
        System.out.println("We will have two types of input one string and one integer and we are going to have a different type of formatting");
        System.out.println("the output formatting will be in a form of tables which will have a first column with with the string and is left justified using exactly 15 characters.");
        System.out.println("the output will then have a second column with the integer with 3 digits");
        System.out.println("we will have exactly 3 inputs for this task");

        System.out.println("================================");
        int j;
        for(j = 1; j < 4; j++) {
            System.out.printf("Input %d%n", j);
            System.out.print("Enter String: ");
            String s1 = scanner.next();
            System.out.print("Enter Int: ");
            int n1 = scanner.nextInt();
            System.out.print("Your output is ");
            System.out.printf("%-15s %03d %n",s1,n1);
        }
        System.out.println("================================");

        // challenge 5
        //In this challenge, we're going to use loops to help us do some simple math.
        // Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

        System.out.println("Give me a random integer again");
        int N = scanner.nextInt();
        for(int i = 0; i<10;i++){
            int result = N * i;
            System.out.printf("%d x %d = %d%n", N,i,result);
        }

        // challenge 6
        // in this challenge we will determine if a given number int can be fitted in datatype such as byte, short,long or int

        System.out.println("Give me a random integer again");
        int t = scanner.nextInt();
        for(int i = 0; i< t; i++){

            try{
                System.out.println("Give me a long type number");
                long x = scanner.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= -128 && x <= 127) System.out.println("* byte");
                if(x >= -Math.pow(2,15) && x <= Math.pow(2,15)-1) System.out.println("* short");
                if(x >= -Math.pow(2,31) && x <= Math.pow(2,31)-1) System.out.println("* int");
                if(x >= -Math.pow(2,63) && x <= Math.pow(2,63)-1) System.out.println("* long");

            } catch (Exception e) {
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }


        }

        // challenge 7
        //The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.

//        for(int i = 1; scanner.hasNext(); i++){
//            System.out.println(i + " " + scanner.nextLine());
//        }

        // challenge 8 int to string
        System.out.println("Give me a random integer again");
        int p = scanner.nextInt();
        String ben = Integer.toString(p);

        //challenge 9
        // we are going to try to find date and time value.



        scanner.close();

    }





}
