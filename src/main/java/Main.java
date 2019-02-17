public class Main {

    public static void main(String[] args) {

        Object[] nestedList = { 1, 3, new Object[]{"age", 5}, "Kraków", new Object[]{1, new Object[]{3, new Object[]{4, 5}, "codecool"}, 6, 7} };

        FLattening fLattening = new FLattening();

        Object[] flatList = fLattening.flatten(nestedList);

        for(Object element : flatList){
            System.out.print(element+" ");
        }

    }
}
