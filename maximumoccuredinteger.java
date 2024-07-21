package geeks.array;
import java.util.*;
public class maximumoccuredinteger {
        static int[] arr = new int[1000000];
    
        public static int maxOccured(int n, int l[], int r[], int maxx) {
           
            for (int i = 0; i <= maxx + 1; i++) {
                arr[i] = 0;
            }
    
            // Step 2: Mark the ranges
            for (int i = 0; i < n; i++) {
                arr[l[i]] += 1;
                if (r[i] + 1 <= maxx) {
                    arr[r[i] + 1] -= 1;
                }
            }
    
            // Step 3: Compute the prefix sum
            int maxCount = arr[0];
            int maxOccuredInteger = 0;
            for (int i = 1; i <= maxx; i++) {
                arr[i] += arr[i - 1];
                if (arr[i] > maxCount) {
                    maxCount = arr[i];
                    maxOccuredInteger = i;
                }
            }
    
            return maxOccuredInteger;
        
        }
    }
    

