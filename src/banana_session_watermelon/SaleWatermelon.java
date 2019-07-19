package banana_session_watermelon;

/**
 * @Auther shengjia
 * @Create 2019/7/18
 * @description: 1、如果没顾客，那就不卖
 * 2、来了N个顾客，要按顺序卖，不卖的客户也要告诉他不卖（卖0）。
 * 3、单个卖的逻辑在 sell0 实现。
 * 4、如果超过50个，只卖50个。
 * 5、如果需求小于0个，sell0 抛出异常，在 sell 捕获异常并登记为不卖（卖0）。
 * 5、在控制台打印出最终这批卖出去多少个。术语：xxx总共卖出去N个。
 * 6、实现自己的打印数组函数。格式: [1,2,3,4,5];
 * 顾客数
 * 购买个数
 **/
public class SaleWatermelon {

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 5, 60};
        int[] sell = sell(nums1);
    }

    public static int[] sell(int[] buyNum) {
        if (buyNum == null) {
            return new int[0];
        }

        if (buyNum.length == 0) {
            return new int[0];
        }

        int[] result = new int[buyNum.length];
        int totalBuyNum = 0;
        for (int i = 0; i < buyNum.length; i++) {
            int currentBuyNum = buyNum[i];
            int sellNum = 0;
            try {
                sellNum = sell0(currentBuyNum);
            } catch (Exception e) {
                sellNum = 0;
            }
            result[i] = sellNum;
            totalBuyNum += sellNum;
        }
        System.out.println("all sale:" + totalBuyNum + ".");
        return result;
    }

    private static int sell0(int buyNum) throws Exception {
        if (buyNum < 0) {
            throw new Exception("sale full");
        }
        if (buyNum > 50) {
            return 50;
        }
        return buyNum;
    }
}
