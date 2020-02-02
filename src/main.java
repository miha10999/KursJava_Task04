
import java.util.*;

public class main  {

    public static void main(String[] args) {
        /*
        Задача №4: Отработка поразрядных операций.
        Выполнил Хлюстов М.В.
        Условие: Ввести с консоли число в бинарном формате.
        Перевести его в десятичный формат, записать в переменную int и вывести на экран.
         */

        byte chByte;
          Scanner in = new Scanner(System.in); // объявим объект для ввода
          String str;//сохранит введенное число
         int dec;// запишем число которое получим при переводе из 2CC
        System.out.println("Введите число в двоичной СС:");
        System.out.print("0b");// чтобы воспринимались числа только в 2СС

       // if (in.hasNextByte()) {   //Проверим корректность введеного числа
            str = in.nextLine();//записали в переменную
            in.close();// закрыли объект,теперь он не нужен
            dec = Integer.parseInt(str, 2);// перевод из 2СС в 10СС

            System.out.println(dec);//выведим результат
            System.out.println("Задание пройдено успешно!");
            System.exit(0);// завершим выполнение программы

    }
}
