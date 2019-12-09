package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        Integer size = values.length;
        Integer index = size / 2;
        return values[index];
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : values) {
            if (!s.equals(getMiddleElement(values))) {
                result.add(s);
            }
        }
        String[] output = new String[result.size()];
        output = result.toArray(output);
        return output;
    }

    public static String getLastElement(String[] values) {

        return values [values.length-1] ;
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> result = new ArrayList<>();
      for (int i = 0 ; i < values.length-1 ; i++ ){
          result.add(values[i]);
      }
        String[] output = new String[result.size()];
        output = result.toArray(output);
        return output;
      }
}