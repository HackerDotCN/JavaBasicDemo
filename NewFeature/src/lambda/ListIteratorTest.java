package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Author: zhang
 * Time: 9/29/2017
 * Description:
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas","Default Method","Stread API","Date and Time API");
        for (String str:features
             ) {
            System.out.println(str);
        }
        System.out.println("-------------------------------------------------------");
        List<String> features2 = Arrays.asList("Lambdas2","Default Method2","Stread API2","Date and Time API2");
        features2.forEach(System.out::println);

    }
}
