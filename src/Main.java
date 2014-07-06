/**
 * Created by katya on 06.07.2014.
 */
public class Main {
    public static void main(String[] args) throws EmptyArrayException {
        Integer[] arg = {1,4,2,9,10,6};
        Calculator c = new Calculator();
        System.out.println(c.max(arg));
    }
}
