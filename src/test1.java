import org.junit.Test;

import java.util.ArrayList;

/**
 * @Description:
 * @Name: test1
 * @Author peipei
 * @Date 2021/11/25
 */
public class test1 {

    @Test
    public void test1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.add(3);
        list.remove(new Integer(1));
        System.out.println(list.toString());
    }
}
