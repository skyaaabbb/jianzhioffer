public class GetMostGlod {
    public static void main(String[] args) throws Exception {
        int n = 5;//金矿数量
        int w = 10;//工人总数
        int[] p = {3,4,3,5,5};//挖每个金矿对应需要的人数
        int[] g = {200,300,350,400,500};//每个金矿对应的黄金量
        System.out.println(getMostGold(n,w,g,p));
    }
    public static int getMostGold(int n,int w,int []g,int[] p){
        int perReuslts []=new int[w + 1];
        int result [] = new int [w + 1];
        //填充边界格子的值
        for (int i = 0;i <= w ;i++){
            if (i < p[0]){
                perReuslts[i] = 0;
            }else {
                perReuslts[i] = g[0];
            }
        }
        //填充其余格子的值，外层循环是金矿的数量，内层循环是人工数
        if(n == 1) return  result[w];
        for (int i = 1;i< n ;i++){
            for (int j = 0;j <= w;j++){
                if (j < p[i]){
                    result[j] = perReuslts[j];
                }else {
                    result[j] = Math.max(perReuslts[j],perReuslts[j-p[i]] + g[i]);
                }
            }
            for (int j = 0; j <result.length ; j++) {
                perReuslts[j] = result[j];
            }
        }
        return result[w];
    }
}
