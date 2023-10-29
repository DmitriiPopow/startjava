public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("Task 1. Подсчет суммы четных и нечетных чисел.");
        int i = -10;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if(i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
                i++;
        } while(i < 22);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenSum + " а нечетных = " + oddSum);

        System.out.println("\n\nTask 2. Вывод чисел в порядке убывания.");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = 0;
        int min = 0;
        System.out.println("Даны числа: "+ a + "; " + b + "; " + c);
        if(a > b && a > c) {
            max = a;
        } else if(b > a && b > c) {
            max = b;
        } else if(c > b && c > a) {
            max = c;
        }
        if(a < b && a < c) {
            min = a;
        } else if(b < a && b < c) {
            min = b;
        } else if(c < b && c < a) {
            min = c;
        }
        System.out.println("max = " + max + " и min = " + min);
        min++;
        for(;min < max; min++ ) {
            
            System.out.print(min + " ");
        }

        System.out.println("\n\nTask 3. Вывод реверсивного числа и суммы его цифр.");
        i = 4;
        int sumNum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while(i > 0) {
            System.out.print(i);
            sumNum += i;
            i--;
        }
        System.out.println("\nСумма его цифр: " + sumNum);

        System.out.println("\nTask 4. Вывод чисел в несколько строк.");
        int startNum = 1;
        int endNum = 24;
        int numbersInLine = 5;
        int count = 0;
        
        for(i = startNum; i <= endNum;  i+= 2) {
            System.out.printf("%2d ", i);
            count++;
            
            if(count >= numbersInLine) {
            System.out.println();
            count = 0;
            }
        }
        while (count < numbersInLine) {
          System.out.printf("%2d ", 0);
          count++;
        }

        System.out.println("\n\nTask 5. Проверка количества двоек числа на четность/нечетность.");
        int num = 3242592;
        int copyNum = num;
        int countTwos = 0; 

        while (copyNum > 0) {
            if (copyNum % 10 == 2) {
                countTwos++;
            }
            copyNum /= 10;
        }
        if (countTwos % 2 == 0) {
            // В 3242592 (нечетное) количество двоек - 3
            System.out.println("В " + num + " (четное) количество двоек - " + countTwos);
        } else {
            System.out.println("В " + num + " (нечетное) количество двоек - " + countTwos);
        }
    }
}