/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author stahc1596
 */
public class A3Q2 {

    public int smallestMissingNumber(int[] array){
        //The for loop goes through the array until it finds the lowest missing
        //number
        for(int i = 0; i < array.length; i++){
            if(i != array[i]){
                return i;
            }
        }
        //If the system couldn't find a missing number, then it returns -1
        return -1;
    }
    public static void main(String[] args) {
        A3Q2 test = new A3Q2();
        //Sorted array consists of 0, 1, 2, 3, 7, 8, 9, 11, and 12
        int[] numbers = {0, 1, 2, 3, 7, 8, 9, 11, 12};
        //If statement is to determine whether or not a number was missing
        if(test.smallestMissingNumber(numbers) != -1){
            //If there is a number missing, then the system outputs that number
            System.out.println("The missing number is " + test.smallestMissingNumber(numbers));
        }else{
            //If there isn't a missing number, the system tells the user
            System.out.println("There is no missing number");
        }
    }
}
