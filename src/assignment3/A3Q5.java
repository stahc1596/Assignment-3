/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author stahc1596
 */
public class A3Q5 {

    public void swap(String[] array, int p1, int p2){
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    
    public void insertionSort(String[] array){
        //For loop runs up the array
        for(int i = 0; i < array.length - 1; i++){
            //Position variable keeps track of the position we're comparing
            //in array
            int position = i;
            //Compare the two strings side by side
            while(position >= 0 && array[position].compareTo(array[position + 1]) > 0){
                //If they aren't in alphabetical order, then switch them
                swap(array, position, position + 1);
                position--;
            }
        }
    }
    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        //Array of strings
        String[] words = {"cat", "dog", "turtle", "bird", "mouse", "snake"};
        //Before
        System.out.println("BEFORE: ");
        //For loop to output the array
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
        //Run the insertion sort method
        test.insertionSort(words);
        //After
        System.out.println("AFTER: ");
        //For loop to output the new array
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}
