import java.util.Scanner;//импортируем класс сканнер

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//создаем объект
        System.out.println("Введите значение x:");//описание данных , требуемых для ввода
        int x = s.nextInt();// считываем значения и записываем их в переменную x;
        System.out.println("Введите значение y:");//описание данных , требуемых для ввода
        int y = s.nextInt();//считываем значения и записываем их в переменную y;
        System.out.println("Результат :" + funResult(x, y)); // запускаем функцию и отображем функцию+результат функции.
    }
    public static boolean funResult(int x, int y) { // функция типа boolean,в которую передается два значения типа int(x,y);
        boolean z = false; // присваиваем изначально переменной z  значение false;
        //первое,что пришло мне в голову-это имеющийся рисунок разбить на 2 части.
        if (y >= 0 && y <= 4) { //описываем первую часть по y.
            if (x >= -2 && x <= 2) { //если по y true , то проверяем второе условие по x;
                z = true;//если результат true , нас это устраивает и мы смело можем сказать,что введенные координаты находятся в закрашенном участке;
            }
        }
        if (y <= 0 && y >= -3) {//описываем вторую часть по y;
            if (x >= -4 && x <= 4) {//описываем вторую часть по x;
                z = true;//если результат true , нас это устраивает и мы смело можем сказать,что введенные координаты находятся в закрашенном участке;
            }
        }
        return z;//возвращает значение z = false, при условии false на всех if`ах.
    }
}