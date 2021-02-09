import java.util.Collections;
import java.util.List;

public class TestingData {
    public static void main(String[] args) {
        List<String> test1 = new DIYArrayList<>();
        List<Integer> test2 = new DIYArrayList<>();
        List<String> test3 = new DIYArrayList<>();
        List<Integer> test4 = new DIYArrayList<>();

        for (int i = 0; i < 25; i++) {
            test3.add(Integer.toString(i));
            test4.add(i);
        }
        //Adding
        boolean result1 = Collections.addAll(test1, Integer.toString(1), Integer.toString(2), Integer.toString(3), Integer.toString(4),
                Integer.toString(8), Integer.toString(7), Integer.toString(6), Integer.toString(5),
                Integer.toString(9), Integer.toString(10), Integer.toString(11), Integer.toString(12),
                Integer.toString(16), Integer.toString(15), Integer.toString(14), Integer.toString(13),
                Integer.toString(17), Integer.toString(18), Integer.toString(19), Integer.toString(20),
                Integer.toString(24), Integer.toString(23), Integer.toString(22), Integer.toString(21),
                Integer.toString(25));
        boolean result2=Collections.addAll(test2, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
        System.out.println("Result adding String - "+ result1);
        for(int i=0;i<test1.size();i++){
            System.out.print(test1.get(i)+" ");
        }
        System.out.println();

        System.out.println("Result adding String - "+ result2);
        for(int i=0;i<test2.size();i++){
            System.out.print(test2.get(i)+" ");
        }
        System.out.println();

        //sort
        Collections.sort(test1,Collections.reverseOrder());
        Collections.sort(test2,Collections.reverseOrder());

        //copy
        try{
            Collections.copy(test3,test1);
            Collections.copy(test4,test2);
        }
        catch (Exception e){
            System.out.println("Exception Throw : "+e);
        }
        System.out.println();

        System.out.println("Sorted copy String: ");
        for(int i=0;i<test3.size();i++){
            System.out.print(test3.get(i)+" ");
        }
        System.out.println();

        System.out.println("Sorted copy String: ");
        for(int i=0;i<test4.size();i++){
            System.out.print(test4.get(i)+" ");
        }
        System.out.println();
    }
}