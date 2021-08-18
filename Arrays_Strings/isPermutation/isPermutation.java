package Arrays_Strings.isPermutation;

import java.util.Arrays;

public class isPermutation {
    public static void main(String []args) {
        System.out.println(permutation("Hello", "world"));
    }

    static Boolean permutation(String first, String second){
        // Get lenghts of both strings
        int n1 = first.length();
        int n2 = second.length();
    
        // If length of both strings is not same,
        // then they cannot be Permutation
        if (n1 != n2)
            return false;

        char ch1[] = first.toCharArray();
        char ch2[] = second.toCharArray();
    
        // Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);
    
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])
                return false;
    
        return true;
    }
}
