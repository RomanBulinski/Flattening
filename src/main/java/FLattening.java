import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLattening {

//    [ 1, 3, ["age", 5], "Kraków", [1, [3, [4, 5], "codecool"], 6, 7]]

    Object[] nestedList = { 1, 3, new Object[]{"age", 5}, "Kraków", new Object[]{1, new Object[]{3, new Object[]{4, 5}, "codecool"}, 6, 7} };

    public  Object[] flatten ( Object[] nestedList) throws IllegalArgumentException {

        if (nestedList == null) return null;

        List<Object> flatList = new ArrayList<>();

        for (Object element : nestedList) {
            if (element instanceof Integer || element instanceof String ) {
                flatList.add(element);
            } else if (element instanceof Object[]) {
                flatList.addAll( Arrays.asList( flatten( (Object[]) element) ) );
            } else {
                throw new IllegalArgumentException("Input must be an array of Integers or Strings or nested arrays.");
            }
        }
        return flatList.toArray(new Object[flatList.size()]);
    }

}



