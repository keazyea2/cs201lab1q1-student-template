import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static Integer findMax(Integer[] arr){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] arr){
        Set<Integer> dup = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (Integer num : arr){
            if (!seen.add(num)){
                dup.add(num);
            }
        }
        return dup.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] arr){
        Set<Integer> unique = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        for (Integer num : arr){
            if (!seen.add(num)){
                dup.add(num);
            }
            if (!dup.contains(num)){
                unique.add(num);
            }
        }
        return unique.toArray(new Integer[0]);
    }
}
