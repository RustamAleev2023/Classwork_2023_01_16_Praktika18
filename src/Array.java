import java.util.Arrays;

public class Array implements IShow, IMath, ISort {
    int[] arr;
    String info;

    public Array(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    @Override
    public void print(String info) {
        System.out.println(info);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public int max() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    @Override
    public int min() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public float avg() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (float) sum / arr.length;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(arr);
    }

    @Override
    public void sortDesc() {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-(1+i)];
            arr[arr.length-(1+i)] = temp;
        }
    }
}
