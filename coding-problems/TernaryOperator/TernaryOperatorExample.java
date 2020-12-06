public class TernaryOperatorExample {


/*
Using a terranry operator will allow the code to be shorter. 

Instead of this: 

    if (condition)
        var = expression1;
    else
      var = expression2;

That all is replaced by using the ternary operator
    condition ? expression1 : expression2

 */

public static void main(String[] args) {
    int result;

    for (int i = -5; i < 10; i++) {
        result = i != 0 ? 100 / i : 0; //prevents division by zero!
        if (i != 0) {
            System.out.println("100 / " + i + " is " + result);
        }
    }
}


/* The output should look like this
100 / -5 is -20
100 / -4 is -25
100 / -3 is -33
100 / -2 is -50
100 / -1 is -100
100 / 1 is 100
100 / 2 is 50
100 / 3 is 33
100 / 4 is 25
100 / 5 is 20
100 / 6 is 16
100 / 7 is 14
100 / 8 is 12
100 / 9 is 11
 */
}
