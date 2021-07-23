import java.util.Arrays;

public class StringUtil {
        // Retorna una cadena compuesta por n caracteres c
        public static String replicate(char c,int n)
        {
            String res = "";
            while (n != 0) {
                res = res + c;
                n--;
            }
            return res;
        }

        // Retorna una cadena de longitud n, compuesta por s
        // y precedida de tantos caracteres c como sea necesario
        // para completar la longitud mencionada
        public static String lpad(String s,int n,char c)
        {
            int length = s.length();
            int cantidadDeCaracteres = n - length;
            String chars = replicate(c, cantidadDeCaracteres);
            return chars + s;
        }

        // Retorna un String[] conteniendo los elementos de arr
        // representados como cadenas de caracteres
        public static String[] toStringArray(int arr[])
        {
            return Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        }

        // Retorna un String[] conteniendo los elementos de arr
        // representados como cadenas de caracteres
        public static int[] toIntArray(String arr[])
        {
            int[] intarray = new int[arr.length];
            int i=0;
            for(String str:arr){
                intarray[i]=Integer.parseInt(str);//Exception in this line
                i++;
            }
            return intarray;
        }/*


        // Retorna la longitud del elemento con mayor cantidad
        // de caracteres del array arr
        public static int maxLength(String arr[])
        {
            //Implementación
        }

        // Completa los elemento del arr agregando caracteres c
        // a la izquierda, dejando a todos con la longitud del mayor
        public static void lNormalize(String arr[],char c)
        {
            //Implementación
        }*/
}

