package banana_stack_log.java_exercise;

/**
 * @Auther shengjia
 * @Create 2019/7/30
 * @description: 1.数组的长度初始化后是不变的。
 * 2.栈是通过top记录下标的方式来控制栈的大小。
 * 3.一旦元素入栈数据就一直存在数组当中，出栈操作仅仅是改变top下标值从而达到控制栈的大小。实际元素并没有从数组中删除掉。
 **/
public class SqStack {
    private Object[] stackElem;//数组就是栈
    private int top;//top栈顶，其实就是一个数组下标

    public SqStack(int maxSize) {
        stackElem = new Object[maxSize];
        top = 0;
    }

    //清空
    public void clear() {
        top = 0;
    }

    //是否为空
    public boolean isEmpty() {
        return top == 0;
    }

    //元素个数
    public int length() {
        return top;
    }

    //栈顶
    public Object peek() {
        if (!isEmpty())
            return stackElem[top - 1];
        else
            return null;
    }

    //入栈
    public void push(Object x) throws Exception {
        if (top == stackElem.length) {
            throw new Exception("栈已满");
        } else
            stackElem[top++] = x;
    }

    //出栈
    public Object pop() throws Exception {
        if (top == 0) {
            throw new Exception("栈为空");
        } else
            return stackElem[--top];//删除然后返回现在的数据
    }

    //打印，从栈顶到栈底
    public void display() {
        for (int i = length() - 1; i > 0; i--) {
            System.out.print(stackElem[i] + " ");
        }
        System.out.println();
    }

    //检查
    public void showArry() {
        System.out.println("数组长度： " + stackElem.length);
        System.out.print("全部元素： ");
        for (int i = stackElem.length - 1; i >= 0; i--) {
            System.out.print(stackElem[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        SqStack sqStack = new SqStack(6);
        sqStack.push(3);
        sqStack.push(6);
        sqStack.push(9);
        sqStack.push(1);

        System.out.print("打印输出：");
        sqStack.display();

        int top = (int) sqStack.peek();
        System.out.println("栈顶：" + top);

        sqStack.pop();
        System.out.print("弹出栈顶，打印输出：");
        sqStack.display();

        System.out.println("数组实际情况：");
        sqStack.showArry();
    }
}
