public class Loops {

    public static void main(String[] args) {

        System.out.println("Learning Topic: Loops");
        // for loop
        for (int i = 0; i < 5; i++) {   
            System.out.println("For Loop Iteration: " + i);
        }   
        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;    
        }
        // do-while loop
        int k = 0;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k < 5);    

        // when to use which loop, how to idenftify which loop to use
        // for loop: when you know the number of iterations beforehand
        // while loop: when you want to repeat a block of code until a certain condition is
        // met, but you don't know how many times it will be executed
        // do-while loop: when you want to execute a block of code at least once, and then repeat it as long as a certain condition is met
        // infinite loop: a loop that never ends, can be created by using a condition that always evaluates to true
        // for example:
        // while (true) {
        //     System.out.println("This is an infinite loop");
        // }        
        

    }
}
