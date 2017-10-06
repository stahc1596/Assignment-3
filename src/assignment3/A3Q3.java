/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author stahc1596
 */
public class A3Q3 {

    public int countOnes(int[] array){
        //Variable to keep count of ones
        int count = 0;
        //For loop checks each position to see if it's a one or not
        for(int i = 0; i < array.length; i++){
            //If the number in the position is a one, add one to the count
            //variable
            if(array[i] == 1){
                count++;
            }
        }
        //After the system is done counting the ones in the array, return the
        //amount of ones counted
        return count;
    }
    public static void main(String[] args) {
        A3Q3 test = new A3Q3();
        //Array holds five zeroes, and three ones
        int[] numbers = {0, 0, 0, 0, 0, 1, 1, 1};
        //Outputs the amount of ones in the array
        System.out.println("There are " + test.countOnes(numbers) + " ones in the array");
        
    }
}