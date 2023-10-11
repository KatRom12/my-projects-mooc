
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i ++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = 0;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i]  < smallest) {
                smallest = table[i];
            }
        }
        for (int i = 0; i < table.length; i++)
            if (table[i] == smallest) {
                index = i;
            }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        int b = array[index2];
        array[index2] = a;
        array[index1] = b;  
    }
    
    public static void sort(int[] array) {
            for (int i = 0; i < array.length; i ++) {
                int index = indexOfSmallestFrom(array, i);
                swap(array, i, index);
            }
        
    }
    
    
    
    

}
