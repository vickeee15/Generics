public class genFloat<E extends Comparable<E>> {
    E[] element;


    public static  <E extends Comparable<E>> E intCompare(E[] elements) {

        E max = elements[0];
        for (E element : elements) {
            if ( element.compareTo(max)>0) {
                max=element;
            }
        }
        System.out.println("Max int value:"+max);
        return max;
    }
    public static  <E extends Comparable<E>> E floatCompare(E[] data) {

        E max = data[0];
        for (E element : data) {
            if ( element.compareTo(max)>0) {
                max=element;
            }
        }
        System.out.println("Max Float value:"+max);
        return max;
    }


    public static void main(String args[]){
        System.out.println("generic class:");
        Integer[] arr = {3, 4, 5};
        intCompare(arr);
        Float[] arr2= {3.4f,1.5f,7.8f};
        floatCompare(arr2);
    }
}
