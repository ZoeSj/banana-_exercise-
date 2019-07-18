package banana_session_watermelon;

/**
 * @Auther shengjia
 * @Create 2019/7/18
 * @description:
 **/
public class ExceptionTest {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown:" + e);
        }
        System.out.println("Out of the block");
    }
}
