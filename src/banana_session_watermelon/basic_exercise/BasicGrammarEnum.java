package banana_session_watermelon.basic_exercise;

/**
 * @Auther shengjia
 * @Create 2019/7/24
 * @description: basic grammar
 * 我们为果汁店设计一个程序，它将限制果汁为小杯、中杯、大杯。这就意味着它不允许顾客点除了这三种尺寸外的果汁。
 **/
class FreshJuice {
    enum FreshJuiceSize {
        SMALL, MEDUM, LARGE
    }

    FreshJuiceSize size;
}

public class BasicGrammarEnum {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDUM;
    }
}
