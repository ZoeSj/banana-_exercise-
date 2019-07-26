package banana_session_watermelon.basic_exercise;

/**
 * @Auther shengjia
 * @Create 2019/7/26
 * @description:
 **/
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("the dog name  is :" + name);
    }

    public void setPuppyAge(int age) {
        puppyAge = age;
    }

    public int getPuppyAge() {
        System.out.println("the dog age is :" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setPuppyAge(2);
        myPuppy.getPuppyAge();
        System.out.println("变量值：" + myPuppy.puppyAge);
    }
}
