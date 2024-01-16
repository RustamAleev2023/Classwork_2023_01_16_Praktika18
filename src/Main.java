import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    //Задание1
    public static void task1() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        String info = "Выводим в консоль массив";
        Array array = new Array(arr);
        array.print();
        array.print(info);
    }

    //Задание2
    public static void task2(){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Array array = new Array(arr);
        System.out.println(array.max());
        System.out.println(array.min());
        System.out.println(array.avg());
    }

    //Задание3
    public static void task3(){
        int[] arr = new int[]{2, 4, 5, 1, 3};
        Array array = new Array(arr);
        array.sortAsc();
        System.out.println(Arrays.toString(arr));
        array.sortDesc();
        System.out.println(Arrays.toString(arr));
    }

}
