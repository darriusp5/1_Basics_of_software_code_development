import java.util.Scanner;//импортируем класс сканнер

public class Task0 {
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in); //создаем объект
        //тип Double был выбран мной не случайно.Для тестирования больших чисел,в том числе и вещественных.
        System.out.println("Введите значение а :");//Выводим пояснение в консоль,для ввода значения переменной а;
        double a = s.nextDouble(); //вызываем метод,который будет записывать значение типа Double в переменную a;
        System.out.println("Введите значение b :");//Выводим пояснение в консоль,для ввода значения переменной b;
        double b = s.nextDouble();//вызываем метод,который будет записывать значение типа Double в переменную b;
        System.out.println("Введите значение c :");//Выводим пояснение в консоль,для ввода значения переменной c;
        double c = s.nextDouble();//вызываем метод,который будет записывать значение типа Double в переменную c;
        System.out.println("Значение z = " + funResult(a , b , c));//Выводим результат работы функции funResult + пояснение;
    }
    public static double funResult ( double a, double b, double c){ // функция,с именем funResult, в которую передаём значение трёх переменных(a , b ,c);
        double z = ((a - 3) * b / 2) + c;//выражение,в котором полученный результат записывается в созданную переменную z;
        return z;//возвращаем значение переменной z;
    }


}
