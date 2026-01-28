/* GIVEN - N array
Count number of elements having atleast 1 element greater than itself
*/
/* EXAMPLE ->  arr = [-1, 2, 3, 4, 6, 9, 1]
Count = 6                                           Max element = 9

// Observation --> For every max element there won't be any element greater than it 
*/
public class Array{
    public static void main(String[] args) {

        int[] arr = {-1, 2, 3, 4, 6, 9, 1};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}

 


