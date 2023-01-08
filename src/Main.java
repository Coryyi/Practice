// 奇偶排序 左奇右偶
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void sweep(int[] arr){
        int len = arr.length;
        if(len == 0){
            System.out.println(Arrays.toString(arr));
        }
        int ptrL = 0;
        int ptrR = len-1;

        while (ptrL<ptrR){
            while (arr[ptrR]%2 != 1){
                ptrR--;
                if(ptrR==0){
                    break;
                }
            }
            while (arr[ptrL]%2 != 0){
                if(ptrL==len-1){
                    break;
                }
                ptrL++;
            }
            if(ptrL<ptrR){
                int temp = arr[ptrL];
                arr[ptrL] = arr[ptrR];
                arr[ptrR] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr= new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = in.nextInt();
        }
        sweep(arr);
    }
}
