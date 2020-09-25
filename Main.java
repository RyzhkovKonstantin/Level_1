package ru.geekbrains.lesson1;

public class Main {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main()

    public static void main(String[] args) {
        System.out.println(method1(10, 4, 20, 5));
        System.out.println(method2(10, 20));
        method3(20);
        System.out.println(method4(25));
        method5();
        method6(2011);


        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения

        byte a = 1;
        short b = 2;
        int c = 10;
        long d = 102050;
        float e = 2.25f;
        double f = 2.25;
        char j = '3';
        boolean k = true;
    }

    /*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
         где a, b, c, d – входные параметры этого метода */

    public static float method1 (float a, float b, float c, float d) {
        float rec = a * (b + (c / d));
        return rec;
    }
    /*4.Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false
     */
    public static boolean method2 (int a, int b){
        if (a + b < 10 && a + b >20) {
            return  false;
        }
        return true;
    }
    /*5.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали,
    или отрицательное
     */
    public static void method3 (int a) {
        if (a > 0) {
            System.out.println("Значение отрицательное");
        } else System.out.println("Значение положительное");
    }
    /*6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
    если число отрицательное
     */
    public static boolean method4 (int a){
        return a < 0;
    }
    /*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вывести в консоль сообщение «Привет, указанное_имя!»
     */
    public static void method5 () {
        System.out.println("Привет, я Костя");
    }
    public static void method6(int year) {
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");

    }
}
