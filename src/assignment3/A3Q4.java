/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author stahc1596
 */
public class A3Q4 {

    public void countingSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int[] count = new int[10];
            count[array[i]]++;
        }
    }
    public static void main(String[] args) {
        A3Q4 test = new A3Q4();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random()*11);
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("-----------------------------");
        test.countingSort(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
    }
}
