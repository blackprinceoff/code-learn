package Advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsTry {
    public static void main(String[] args) {
        /*
        Регулярний вираз — це послідовність символів, яка утворює шаблон пошуку. Під час пошуку даних у тексті ви можете використовувати цей шаблон пошуку для опису того, що ви шукаєте.

Регулярний вираз може бути як окремим символом, так і складнішим шаблоном.

Регулярні вирази можна використовувати для виконання всіх типів пошуку тексту та операцій заміни тексту.

Java не має вбудованого класу регулярних виразів, але ми можемо імпортувати java.util.regex пакет для роботи з регулярними виразами. Пакет містить такі класи:

PatternКлас – Визначає шаблон (для використання в пошуку)
MatcherКлас - Використовується для пошуку шаблону
PatternSyntaxExceptionКлас – вказує на синтаксичну помилку у шаблоні регулярного виразу
         */

        // Дізнайтеся, чи є в реченні якісь входження слова «w3schools»
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        } else {
            System.out.println("No match found");
        }

        /*
        У цьому прикладі в реченні шукається слово «w3schools».

Спочатку за допомогою методу створюється шаблон Pattern.compile(). Перший параметр вказує, який шаблон шукається, а другий параметр має прапорець, який вказує на те, що пошук має бути без урахування регістру. Другий параметр є необов'язковим.

Метод matcher()використовується для пошуку шаблону в рядку. Він повертає об'єкт Matcher, який містить інформацію про виконаний пошук.

Метод find()повертає значення true, якщо шаблон був знайдений у рядку, і false, якщо він не був знайдений.
         */
    }
}


/*
Прапори
Прапорці в compile()методі змінюють спосіб виконання пошуку. Ось декілька з них:

Pattern.CASE_INSENSITIVE- Регістр літер буде ігноруватися під час пошуку.
Pattern.LITERAL- Спеціальні символи у шаблоні не матимуть жодного особливого значення та будуть розглядатися як звичайні символи під час пошуку.
Pattern.UNICODE_CASE- Використовуйте його разом із CASE_INSENSITIVE прапорцем, щоб також ігнорувати регістр літер поза англійським алфавітом
Шаблони регулярних виразів
Першим параметром методу Pattern.compile()є шаблон. Він описує, що саме шукається.

Дужки використовуються для пошуку діапазону символів:

Expression	Description
[abc]	Find one character from the options between the brackets
[^abc]	Find one character NOT between the brackets
[0-9]	Find one character from the range 0 to 9
Метасимволи
Метасимволи – це символи зі спеціальним значенням:

Metacharacter	Description
|	Find a match for any one of the patterns separated by | as in: cat|dog|fish
.	Find just one instance of any character
^	Finds a match as the beginning of a string as in: ^Hello
$	Finds a match at the end of the string as in: World$
\d	Find a digit
\s	Find a whitespace character
\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
\\uxxxx	Find the Unicode character specified by the hexadecimal number xxxx
Квантори
Квантори визначають величини:

Quantifier	Description
n+	Matches any string that contains at least one n
n*	Matches any string that contains zero or more occurrences of n
n?	Matches any string that contains zero or one occurrences of n
n{x}	Matches any string that contains a sequence of X n's
n{x,y}	Matches any string that contains a sequence of X to Y n's
n{x,}	Matches any string that contains a sequence of at least X n's
* */
