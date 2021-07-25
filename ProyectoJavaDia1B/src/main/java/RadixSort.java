import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class RadixSort {
        public static void radixSort(int []arr)
        {
            String[] strArray = StringUtil.toStringArray(arr);
            StringUtil.lNormalize(strArray, '0');
            int length = strArray[0].length();
            for(int i = length; i > 0; i--) {
                HashMap<String, ArrayList<String>> hashmap = new HashMap<>();
                for(int j = 0; j < 10; j++) {
                    hashmap.put("L"+j, new ArrayList<>());
                }
                for(String elem:strArray) {
                    char[] charArray = elem.toCharArray();
                    char entero = charArray[i-1];
                    ArrayList<String> aL = hashmap.get("L"+entero);
                    aL.add(elem);
                }
                ArrayList<String> arrayListTemp = new ArrayList<>();
                for(int k = 0; k < 10; k++) {
                    ArrayList<String> aL = hashmap.get("L"+k);
                    for(int l = 0; l < aL.size(); l++) {
                        arrayListTemp.add(aL.get(l));
                    }
                }
                int largo = strArray.length;
                for(int m = 0; m < largo; m++) {
                    strArray[m] = arrayListTemp.get(m);
                }
            }
            int largo = strArray.length;
            for(int i = 0; i < largo; i++) {
                System.out.println(strArray[i]);
            }
            int[] arrFinal = StringUtil.toIntArray(strArray);
            for(int i = 0; i < largo; i++) {
                arr[i] = arrFinal[i];
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

