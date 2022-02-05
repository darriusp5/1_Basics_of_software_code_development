import java.util.Scanner;//импортируем класс сканнер

public class Task1 {
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in); //создаем объект
        //тип Double был выбран мной не случайно.Для тестирования больших чисел,в том числе и вещественных;
        System.out.println("Введите значение а :");//Выводим пояснение в консоль,для ввода значения переменной а;
        double a = s.nextDouble(); //вызываем метод,который будет записывать значение типа Double в переменную a;
        System.out.println("Введите значение b :");//Выводим пояснение в консоль,для ввода значения переменной b;
        double b = s.nextDouble();//вызываем метод,который будет записывать значение типа Double в переменную b;
        System.out.println("Введите значение c :");//Выводим пояснение в консоль,для ввода значения переменной c;
        double c = s.nextDouble();//вызываем метод,который будет записывать значение типа Double в переменную c;
        System.out.println("Значение z = " + funResult(a , b , c));
    }
    public static double funResult ( double a, double b, double c){ // функция,с именем funResult, в которую передаём значение трёх переменных(a , b ,c);
        double z = (((b + (Math.sqrt(Math.pow(b , 2) + (4 * a * c))))/ (2 * a))) - ((Math.pow(a , 3) * c) + (Math.pow(b , -2)));//выражение,в котором полученный результат записывается в созданную переменную z;
        //Math.pow и Math.sqrt использовались мной для вычисления степени и корня,соответственно.
        return z;//возвращаем значение переменной z;
    }
}