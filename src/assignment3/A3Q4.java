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
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        for(int i = 0; i < count.length; i++){
            for(int n = 0; n < count[i]; n++){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        A3Q4 test = new A3Q4();
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("-----------------------------");
        test.countingSort(numbers);
        
//        for(int i = 0; i < numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
    }
}
