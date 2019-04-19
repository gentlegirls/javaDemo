package sort;

import java.util.Arrays;

public class InsertSort {

    public static void insertSort(int[] arr)
    {
        int i, j;
        int n = arr.length;
        int target;

        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历n-1次
        for (i = 1; i < n; i++)
        {
            j = i;
            target = arr[i];

            while (j > 0 && target < arr[j - 1])
            {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = target;
            System.out.println("第"+i+"次遍历的结果"+Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,9,7,2,3,6,4,5};

        insertSort(arr);
        System.out.println("排序结束,结果为:"+Arrays.toString(arr));
    }
}
