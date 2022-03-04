package assgnment2;

import java.util.function.Predicate; 

public class PredicateInterface { 

    public static void main(String[] args) 

    { 

        Predicate<Integer> greaterThanTen = (i) -> i > 10; 

 

        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  

        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 

        System.out.println(result); 

  

        // Calling Predicate method 

        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 

        System.out.println(result2); 

    } 
}
