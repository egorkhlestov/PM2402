import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[4]; // создание массива
        for(int i = 0;i<a.length;i++)
            a[i] = scan.nextInt(); // заполнение массива
        Arrays.sort(a, 0, 4); // сортировка по возрастанию с 1 по 4 элемент
        if(a[3]-a[2]==a[2]-a[1]&&a[2]-a[1]==a[1]-a[0]){ // проверка условия, когда 4 числа создают арифметическую прогрессию
            for(int i = 0;i<a.length;i++)
                out.print(a[i]+" ");
        }else if(a[2]-a[1]==a[1]-a[0]){
            for(int i = 0;i<a.length-1;i++)
                out.print(a[i]+" ");
        }else if(a[3]-a[2]==a[2]-a[1]){
            for(int i = 1;i<a.length;i++)
                out.print(a[i]+" ");
        }else if(a[3]-a[1]==a[1]-a[0]){
            out.printf("%d ",a[0]);
            out.printf("%d ",a[1]);
            out.print(a[3]);
        }else if(a[3]-a[2]==a[2]-a[0]){
            out.printf("%d ",a[0]);
            out.printf("%d ",a[2]);
            out.print(a[3]); // проверка всех возможных случаев расположения трех элементов среди четырех мест и вывод соответствующих последовательностей
        }else{
            out.print("NO"); // вывод, если среди вводных данных не содержится прогрессия
        }
    }
}