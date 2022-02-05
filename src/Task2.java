import java.util.Scanner;//импортируем класс сканнер

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //создаем объект
        //тип Double был выбран мной не случайно.Для тестирования больших чисел,в том числе и вещественных;
        System.out.println("Введите значение x :");//Выводим пояснение в консоль,для ввода значения переменной x;
        double x = s.nextDouble(); //вызываем метод,который будет записывать значение типа Double в переменную x;
        System.out.println("Введите значение y :");//Выводим пояснение в консоль,для ввода значения переменной y;
        double y = s.nextDouble(); //вызываем метод,который будет записывать значение типа Double в переменную y;
        System.out.println("Значение z = " + funResult(x , y));//Выводим результат работы функции funResult + пояснение;
    }
    public static double funResult(double x, double y) {
        double z = ((Math.sin(x) + Math.cos(y)) / ((Math.cos(x)- Math.sin(y))) * (Math.tan(x) * Math.tan(y)));//Math.cos,Math.sin,Math.tan использовались мной для вычисления синуса,косинуса и тангенса соответственно;
        return z;//возвращаем значение z.
    }
}

