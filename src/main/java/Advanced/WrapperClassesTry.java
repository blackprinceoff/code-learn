package Advanced;

import java.util.ArrayList;

public class WrapperClassesTry {
    public static void main(String[] args) {
        /*
    Класи-обгортки надають спосіб використання примітивних типів даних ( int, booleanтощо) як об'єктів.

    У таблиці нижче показано примітивний тип та еквівалентний клас-обгортку:

    Primitive Data Type	Wrapper Class
    byte	Byte
    short	Short
    int	Integer
    long	Long
    float	Float
    double	Double
    boolean	Boolean
    char	Character 

    Іноді доводиться використовувати класи-обгортки, наприклад, під час роботи з об'єктами Collection, такими як ArrayList, 
    де не можна використовувати примітивні типи (список може зберігати лише об'єкти):
     */

     // ArrayList<int> myNumbers = new ArrayList<int>();  Invalid
    ArrayList<Integer> muNumbers = new ArrayList<Integer>(); // Valid

    // Створення об'єктів-обгорток
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);

    /*
    Оскільки ви тепер працюєте з об'єктами, ви можете використовувати певні методи для отримання інформації про конкретний об'єкт.

Наприклад, для отримання значення, пов'язаного з відповідним об'єктом-обгорткою, 
використовуються такі методи: intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
     */

     System.out.println(myInt.intValue());
     System.out.println(myDouble.doubleValue());
     System.out.println(myChar.charValue());

    /*
    Ще одним корисним методом є toString()метод , який використовується для перетворення об'єктів-обгорток у рядки.

У наступному прикладі ми перетворюємо an Integerна a Stringта використовуємо length()метод класу Stringдля виведення довжини "рядка": 
     
     */

     Integer myInt1 = 100;
     String myString = myInt1.toString();
     
      System.out.println(myString.length());
    }
}