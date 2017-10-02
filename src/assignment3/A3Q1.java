/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author stahc1596
 */
public class A3Q1 {

    public void swap(int[] array, int p1, int p2){
        //Swap the number in the wrong position to it's right position
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    public void selectionSort(int[] array){
        //For loop to determine what position we're finding next
        for(int position = 0; position < array.length; position++){
            //Lowest number starts at the position it's at
            int low = position;
            //For loop to determine what number is the lowest number to go into]
            //this position
            for(int i = position; i < array.length; i++){
                //If the found number is lower than the number in the original
                //position, then that number becomes the lowest
                if(array[i] < array[low]){
                    low = i;
                }
            }
            //If there is a lower number that isn't in the right position, then
            //it swaps with the number in it's position
            if(position < low){
                swap(array, low, position);
                }
        }
    }
    public static void main(String[] args) {
        A3Q1 test = new A3Q1();
        //Array consisting of 5, 7, 3, 8, 2, 1, 9, 4, and 6
        int[] numbers = {5, 7, 3, 8, 2, 1, 9, 4, 6};
        //Before sorting
        System.out.println("BEFORE: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Begins the sorting method
        test.selectionSort(numbers);
        //After sorting
        System.out.println("AFTER: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
    }
}
