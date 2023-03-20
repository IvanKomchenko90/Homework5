package by.array;

public class Homework5 {
    public static void main(String[] args){
        //задача 1 Создать массив из 10 элементов. Заполните массив рандомными числами и вывести их. Замените каждый элемент с нечётным индексом на ноль.
        System.out.println("Задача 1");
        int num [] = new int[10];
        for (int i=0; i< num.length; i++) {
            num[i] = (int) (Math.random()*20);
        }
        System.out.println("исходный массив");
        for(int a: num){
            System.out.print(a+"\t");
        }
        for (int i=0; i< num.length; i++) {
            if (i %2!=0){
                num[i]=0;
            }
        }
        System.out.println("\n"+"массив в котором каждый элемент с нечётным индексом заменен на ноль "+"\n");
        for(int a: num){
            System.out.print(a+"\t");
        }
        //задача 2 Создать массив вручную. Заменить максимальный и минимальный элемент массива
        System.out.println("\n"+"Задача 2");
        int num2[]={3,5,1,2,17,15};
        int min = num2[0];
        int l =0;
        int max = num2[0];
        int k=0;
        for(int i=1; i< num2.length; i++) {
            if (num2[i] < min) {
                min = num2[i];
                l=i;
            }
        }

        for(int i=1; i< num2.length; i++) {
            if (num2[i] > max) {
                max = num2[i];
                k=i;
            }
        }
        for(int a: num2) {
            System.out.print(a + "\t");
        }
        System.out.println("\n"+"min = "+min + "\t"+"порядковый номер элемента в массиве"+ "\t"+l);
        System.out.println("max="+max+"\t"+"порчдковый номер элемента в массиве"+ "\t"+k);
        for(int a: num2) {
            num2[l]=33;
            num2[k]=99;
            System.out.print(a + "\t");
        }
        //задача 3 Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив  (for)
        System.out.println("\n"+"Задача 3");
        int ar[]={3,5,1,2,17,15};
        for(int i=1; i< ar.length; i++) {
            for(int j=1; j< ar.length; j++) {
                if (ar[j]<ar[j-1]){
                    int x=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=x;
                }
            }
        }
        for(int i:ar){
            System.out.print(i+"\t");
        }
        //задача 4 Создать массив (вручную) Отсортировать элементы массива в порядке возрастания. Вывести полученный массив  (while)
        System.out.println("\n"+"Задача 4");
        int a[]={3,5,21,1,2,17,15};
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int j=1; j< a.length; j++) {
                if (a[j]<a[j-1]){
                    int x=a[j];
                    a[j]=a[j-1];
                    a[j-1]=x;
                    sorted = false;
                }
            }
        }
        for(int i:a){
            System.out.print(i+"\t");
        }
    }
}
