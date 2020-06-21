package offertest;

/**
 * 题目描述：
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class SearchInNumbers {
    public boolean Find(int target, int [][] array) {
        //先判断数组是否为空，行、列长度是否为0
        if(array.length == 0 || array[0].length == 0 || array == null)
            return false;
        //获取数组的行长和列长
        int rows = array.length;
        int cols = array[0].length;
        //从右上角开始遍历数组
        for(int row = 0, col = cols - 1; row < rows && col >= 0;){
            if(target < array[row][col])
                col -- ;
            else if(target > array[row][col])
                row ++;
            else return true;
        }
        return false;
    }
}
