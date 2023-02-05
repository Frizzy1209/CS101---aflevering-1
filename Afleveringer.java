import java.util.Scanner;

public class Afleveringer {


        public static void main(String[] args) {

            String answer;
            Scanner startOver = new Scanner(System.in);

            do {

                opgave1();
                opgave2();
                opgave3();
                opgave4();


                System.out.println("Do you want to start again? Y or N");
                answer = startOver.next();
            }
            while (answer.equals("Y") || answer.equals("y") );


        /*
        System.out.println(test("det her er en test") );

         */

        }


        public static void opgave1 (){

            Scanner myAge = new Scanner(System.in);
            System.out.print("Enter age: ");

            int age = myAge.nextInt();

            if (age > 18){
                System.out.println("You are eligible to vote!");
            }
            else {
                System.out.println("You are not eligible to vote");
            }

        }



        public static void opgave2 (){

            // Maximum;
            int maxA = 1, maxB = 18, maxC = 8;
            int maxValue = Math.max(maxA, Math.max(maxB, maxC));

            System.out.println("This is the maximum value " + maxValue);


            // Minimum;
            int minA = 1, minB = 18, minC = -8;
            int minValue = Math.min(minA, Math.min(minB, minC));

            System.out.println( "This is the minimum value " + minValue);

        }



        public static void opgave3 (){

            Scanner evenOrOdd = new Scanner(System.in);
            System.out.print("Enter a number: ");

            int num = evenOrOdd.nextInt();

            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");

        }


        public static void opgave4(){

            Scanner makeAcronym = new Scanner(System.in);
            System.out.print("Enter anything and make an acronym: ");

            String input = makeAcronym.nextLine();

            StringBuilder acronym = new StringBuilder();
            for (String text : input.split("\\s+")) {
                acronym.append(text.toUpperCase().charAt(0));
            }
            System.out.println(acronym);
        }


        public static String test (String phrase) {
            StringBuilder result = new StringBuilder();
            for (String token : phrase.split("\\s+")) {
                result.append(token.toUpperCase().charAt(0));
            }
            return result.toString();
        }


}
