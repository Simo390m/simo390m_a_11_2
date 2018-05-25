import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise_2
{

    public void alternate(List list1, List list2)
    {
        int list1size = list1.size();
        int list2size =list2.size();

        if (list1size > list2size)
        {
            for (int i = 0; i < list1.size() ; i++)
            {
                if (list1.size() > i){
                    System.out.println(list1.get(i).toString());
                }
                if (list2.size() > i)
                {
                    System.out.println(list2.get(i).toString());
                }

            }


        }
        else
        {
            for (int i = 0; i < list2.size() ; i++)
            {
                if (list1.size() > i){
                    System.out.println(list1.get(i).toString());
                }
                if (list2.size() > i)
                {
                    System.out.println(list2.get(i).toString());
                }

            }


        }

    }


    public static void main(String[] args)
    {
        Exercise_2 exercise_2 = new Exercise_2();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < 17; i++) {

            list1.add(i+1);

        }
        for (int i = 5; i < 12; i++) {

            list2.add(i+1);

        }

        exercise_2.alternate(list1, list2);



    }
}
