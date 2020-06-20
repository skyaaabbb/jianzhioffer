package offertest;

import java.util.Arrays;

/**
 * 问题描述：五张牌，其中大小王为癞子，牌面大小为0.判断这五张牌是否能组成顺子。
 */
public class Continuous {
    public boolean isContinuous(int [] numbers) {
        //统计数组长度
        if(numbers.length < 5)
            return false;
        Arrays.sort(numbers);
        //统计数组中大小王的个数
        int cnt = 0;
        for(int i = 0;i < numbers.length; i++){
            if(numbers[i] == 0)
                cnt++;
        }
        //用癞子补全顺子
        for(int i = cnt; i < numbers.length - 1; i++){
            if(numbers[i + 1] == numbers[i])
                return false;
            cnt -= numbers[i + 1] - numbers[i] -1 ;
        }
        return (cnt >= 0);
    }
}
