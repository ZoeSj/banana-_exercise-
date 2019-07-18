/**
 * @Auther shengjia
 * @Create 2019/7/18
 * @description:
 **/
public class Puppy {
    public int getPuppyAge() {
        System.out.println("小狗的年龄：" + puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    int puppyAge;

    public Puppy(String name) {
        System.out.println("小狗的名字是：" + name);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");//create object
        myPuppy.setPuppyAge(2);//set age by the method
        myPuppy.getPuppyAge();//get the age by method
        System.out.println("变量值：" + myPuppy.puppyAge);

    }
}
