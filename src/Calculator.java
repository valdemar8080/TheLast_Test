import java.beans.IntrospectionException;

/**
 * Created by katya on 06.07.2014.
 */
public class Calculator {
    public Calculator() {
    }

    public int max (Integer[] arg) throws EmptyArrayException {
        
        int result = arg[0];
        for(int i: arg){
            Integer i1 = i;
            if (i1 != null) {
                if (i > result) {
                    result = i;
                }
            }
        }
        System.out.println();
        return result;
    }
}
