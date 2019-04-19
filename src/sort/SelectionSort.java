package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,3,0,9,12,7,1};
        System.out.println("开始排序："+ Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < arr.length; j++){// 选最小的记录
                if(arr[j] < arr[k]){
                    k = j; //找到当前最小的作为基准值
                }
            }
           //一次遍历结束将找到的最小的放到前面
            if(i != k){  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
            System.out.println("第"+(i+1)+"趟排序结果："+ Arrays.toString(arr));

        }
        System.out.println("排序结束结果："+ Arrays.toString(arr));

    }
}
