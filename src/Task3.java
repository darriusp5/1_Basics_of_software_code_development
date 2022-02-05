import java.util.Scanner;//импортируем класс сканнер

public class Task3 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);//создаем объект
        System.out.println("Введите вида nnn.ddd , где три цифровых разряда в дробной и целой частях");
        double R = s.nextDouble();// создается переменная типа Double , в которую записывается значение,введенное пользователем;
        StringBuffer buffer = new StringBuffer(Double.toString(R));//создается объект,конвертируем наше введенное значение в тип String;
        System.out.println("Обратное значение :" + buffer.reverse());//Метод reverse() — изменяет значение объекта StringBuffer, который вызвал метод.Результат выводится в консоль.
    }

}
