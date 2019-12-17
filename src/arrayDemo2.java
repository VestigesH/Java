public class arrayDemo2 {
    public static void main(String[] args) {
        int data[][] =  new int [][]{{1,2,3},{4,5,6}};    //定义二维数组
        for (int x = 0; x < data.length; x++){
            for (int y = 0; y < data[x].length; y++){
                System.out.println(data[x][y] + "\t");
            }
            System.out.println();
        }
    }
}
