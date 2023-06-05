import java.util.Scanner;

public class Main {
    public static void tangdan(int array[]){
        System.out.println("giá trị sau khi sap xếp");
        for (int i=0;i< array.length;i++){
            for (int j=i;j< array.length;j++){
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]);
        }
    }
    public static void giandan(int array[]){
        System.out.println("gi trị sau khi sắp xếp");
        for (int i=0;i< array.length;i++){
            for (int j=i;j< array.length;j++){
                if (array[i]<array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phần tử");
        n= scanner.nextInt();
        int array[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap giá trị phâng tử : "+i);
            array[i]= scanner.nextInt();
        }
        tangdan(array);
        giandan(array);
    }
}