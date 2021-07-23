import java.util.ArrayList;
import java.util.HashMap;

public class RadixSort {
        public static void radixSort(int []arr)
        {
            String[] res = {"10", "20"};
            int[] res2 = StringUtil.toIntArray(res);
            for(int r:res2) {
                System.out.println(r);
            }
        }
        public static void main(String[] args)
        {
            int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
            radixSort(arr);

            for(int i=0; i<arr.length;i++)
            {
                System.out.print(arr[i]+(i<arr.length-1?",":""));
            }
        }
    }

