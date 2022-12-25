package easy.tasks;

import java.util.stream.Stream;

class Largest {


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = recurseAdd(a, a.length - 1);
        System.out.println(sum);
    }

    public static int recurseAdd(int a[], int index) {
        if (index == a.length - 1) {
            System.out.println(a[index]);
            return a[index];
        }else{
        return a[index] + recurseAdd( a, index+1);}
    }

}



