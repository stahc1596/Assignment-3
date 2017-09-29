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
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    public void selectionSort(int[] array){
        int low = 0;
        //Keep track of which position we are sorting
        for(int position = 0; position < array.length; position++){
            //Go through the rest looking for a smaller number
            for(int i = position + 1; i < array.length; i++){
                if(array[i] < array[low]){
                    low = i;
                }
            }
                swap(array, low, position);
        }
    }
    public static void main(String[] args) {
        A3Q1 test = new A3Q1();
        int[] numbers = {5, 7, 3, 8, 2, 1, 9, 4, 6};
        //Before
        System.out.println("BEFORE: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Type of sort
        test.selectionSort(numbers);
        //After
        System.out.println("AFTER: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
    }
}
