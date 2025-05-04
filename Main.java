public class Main{
    public static void main(String[] args){
        int[][] test = {{2, 0, 3},
                        {1, 0, 1},
                        {1, 0, 1},
                        {4, 0, 4}
                        };
        //ArrayResizer resize = new ArrayResizer();
        System.out.println(ArrayResizer.isNonZeroRow(test, 0));
        System.out.println(ArrayResizer.isNonZeroRow(test, 1));
        System.out.println(ArrayResizer.isNonZeroRow(test, 2));
        System.out.println(ArrayResizer.isNonZeroRow(test, 3));
        int[][] array = ArrayResizer.resize(test);
        for (int j = 0; j < array.length; j++){
            for (int i = 0; i < array[0].length; i++){
                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }
}