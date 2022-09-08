
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        sort(array);
    }
    public static int smallest(int[] array){ 
        int smallest = array[0];
        
        for (int i=0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int index = 0;
        
        for (int i=0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {        
        int index = startIndex;
        int smallest = table[startIndex];
       
        
        for (int i=startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;
            }
        }
        
        return index;
        
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int firstIndex = array[index1];
        array[index1] = array[index2];
        array[index2] = firstIndex;
    }
    
    public static void sort(int[] array) {
        
        for (int i=0; i<array.length; i++) {
            
            for (int index=0; index<array.length;index++) {
                       System.out.print(array[index] + ", ");
        
                    }
            
            swap(array, i , indexOfSmallestFrom(array,i));
                    
                    System.out.println("");            
        }

    }
}
