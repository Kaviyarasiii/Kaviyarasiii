package in.dev.gmsk.variables;

public class ExercisesVariables {

    public static void exercisesUnaryOperators() {

        System.out.println("-------- Test 1 ------------");
        int a = 0;

        // If you do no assignment and the operator in not participating in a more complex expression the following stmt are the same.
        // The value in variable a gets incremented by 1

        a = 1;
        ++a; // a = a + 1;
        System.out.println("a after ++a = " + a);

        a = 1;
        a++; // a = a + 1;
        System.out.println("a after a++ = " + a);

        // What happens if we do this ?
        System.out.println("\n-------- Test 2 ------------");
        a = 1;
        System.out.println("a after ++a = " + ++a);

        a = 1;
        System.out.println("a after a++ = " + a++);
        System.out.println("And now the value of a is : " + a);

        // Let's look at postfix increment in a variable declaration
        System.out.println("\n----------Test 3 ----------");
        a = 1;
        int a2 = a++;
        System.out.println("The value of a is " + a);
        System.out.println("The value of a2 is " + a2);

        // Let's look at postfix in an expression...
        a = 1;
        if (++a == 1) {
            System.out.println("If Statement, now the value of a is " + a);
        }

        System.out.println("\n----------Test 4 ----------");
        int b = 5;
        int loopiterations = 0;
        while (--b > 0) {  // Use a prefix decrement
            loopiterations++;
        }
        System.out.println("Prefix decrement operator used, loopiterations = " +
                loopiterations + ", b = " + b);

        // Reset values, all things equal except the type of increment operator
        b = 5;
        loopiterations = 0;
        while (b-- > 0) {  // Use a postfix decrement
            loopiterations++;
        }
        System.out.println("Postfix decrement operator used, loopiterations = " +
                loopiterations + ", b = " + b);
    }

    public static void printStaircase(int n) {

        if (n < 0) {
            System.out.println("0");
            return; // why return ? but printStaircase method return type is void :-(
        }

        for (int r = 0; r < n; r++) {
            for (int c = n - r - 1; c > 0; c--) { // c-- // which type decrement ? prefix decrement are  post decrement ?
                System.out.print(" ");
            }
            for (int k = 0; k <= r; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // System.out.println("r : "+r); // error : Cannot resolve symbol 'r' because out of the scope.
    }
}
