package sort;

public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {3,1,5,7,9,2};
        for(int i = 0; i<array.length-1;i++){//外层控制轮数
            System.out.println("开始第"+(i+1)+"轮排序");
            for(int j = 0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    System.out.print("第"+(i+1)+"轮排序,"+"第"+(j+1)+"次排序结果");
                    printArray(array);
                    System.out.println("+交换位置");
                }else{
                    System.out.print("第"+(i+1)+"轮排序,"+"第"+(j+1)+"次排序结果");
                    printArray(array);
                    System.out.println("+不交换位置");
                }
            }
            System.out.print("第"+(i+1)+"轮排序结果:");
            printArray(array);
            System.out.println("");
        }
        System.out.println("排序结束");
        System.out.println("排序后的数组为：");
        printArray(array);
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
