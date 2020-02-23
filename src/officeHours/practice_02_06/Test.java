package officeHours.practice_02_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Kentucky k1 = new Kentucky();
        California c1 = new California();
        k1.tax();
        c1.tax();
k1.method1();
        List<States> list = new ArrayList<>() ;
        list.addAll(Arrays.asList(k1,c1));

    }

}
class C{

}
abstract class D extends C{
    public static void main(String[] args) {

    }
}
