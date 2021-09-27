package com.studyopedia;

    import java.util.Arrays;
/* Introduce generic method in class<E>*/
    public class FindMaxOfInt<E> {
        E[] element;

        public FindMaxOfInt (E[] element){
            this.element=element;
        }
        /* compareTo method to find the maximum value
         */
        public static  <E extends Comparable<E>> E intCompare(E[] data) {

            E max = data[0];
            for (E element : data) {
                if ( element.compareTo(max)>0) {
                    max=element;
                }
            }
            System.out.println("Max value:"+max);
            return max;
        }

        public static void main(String args[]){
            System.out.println("generic class:");
            Integer[] arr = {3, 4, 5};
            intCompare(arr);
        }
    }
