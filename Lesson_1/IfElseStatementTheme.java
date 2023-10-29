public class IfElseStatementTheme {
    
    public static void main(String[] args) {
        System.out.println("Task 1. Перевод псевдокода на язык Java.");
        String gender = "male";
        int age = 24;
        double height = 1.7;
        String name = "Dmitrii";
        boolean isMaleGender = gender == "male";
        if(!isMaleGender) {
            System.out.println("Привет, красотка)");
        } else {
            System.out.println("Привет, красавчик)");
        }
        if(age > 18) {
            System.out.println("Добро пожаловать)");
        } else {
            System.out.println("Тебе сюда ещё рановато)");
        }

        if(height < 1.8) {
            System.out.println("Ты нормального роста)");
                    } else {
            System.out.println("Ты достаточно высокого роста)");
        }
        char fistLatterName = name.charAt(0);
        if(fistLatterName == 'M') {
            System.out.println("lol");
        } else if(fistLatterName == 'I') {
            System.out.println("kek");
        } else {
            System.out.println("cheburek");
        }

        System.out.println("\nTask 2. Поиск большего числа.");
        int num1 = 49;
        int num2 = 48;
        if(num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else if(num1 == num2) {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        } else {
            System.out.println("Число " + num1 + " меньше числа " + num2);
        }

        System.out.println("\nTask 3. Проверка числа.");
        int num3 = -2;
        String parityNum = "";
        String rationalNum = "";
        if(num3 == 0) {
            parityNum = "нулём!";
            rationalNum = "";
            System.out.println(parityNum);
        } else if(num3 % 2 == 0) {
            parityNum = "четным";
        } else {
            parityNum = "нечётным";
        }
        if(num3 > 0) {
            rationalNum = "положительным и ";
        } else if(num3 < 0) {
            rationalNum = "отрицательным и ";
        }
        System.out.println("Число " + num3 + " является " + rationalNum + parityNum);

        System.out.println("\nTask 4. Поиск одинаковых цифр в числах.");
        int num4 = 144;
        int num5 = 223;
        int hundreds = num4 / 100;
        int dozens = num4 / 10 % 10;
        int units = num4 % 10;
        int hundreds1 = num5 / 100;
        int dozens1 = num5 / 10 % 10;
        int units1 = num5 % 10;
        if((hundreds != hundreds1) && (dozens != dozens1) && (units != units1)) {
            System.out.println("В числах "+ num4 + " и " + num5 + " цифр, стоящих в одном и том же разряде, нет.");
        } else {
            System.out.println("В числах " + num4 + " и " + num5 + ": ");
        } if(hundreds == hundreds1) {
                System.out.println(hundreds + " - одинаковая цифра в разряде сотен");
            } 
            if(dozens == dozens1) {
                System.out.println(dozens1 + " - одинаковая цифра в разряде десятков");
            } 
            if(units == units1) {
                System.out.println(units1 + " - одинаковая цифра в разряде единиц");
            }
        System.out.println("\nTask 5. Определение символа по его коду.");
        char unknownChar = '\u0057';
        if(unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.println("Маленькая буква: " + unknownChar); 
        } else if(unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.println("Большая буква: " + unknownChar);
        } else if(unknownChar >= '0' && unknownChar <= '9') {
            System.out.println("Цифра: " + unknownChar);
        } else {
            System.out.println("Символ " + unknownChar + " - не буква и не число");
        }

        System.out.println("\nTask 6. Подсчет суммы вклада и начисленных банком %.");
        double deposit = 301000;
        System.out.println("Cумма вклада: " + deposit);
        if(deposit < 100000) {
            double precent = 5;
            double deposit1 = deposit + (deposit * precent / 100);
            double sumPrecent = deposit1 - deposit;
            System.out.println("Cумма начисленного %: " + sumPrecent + "\nИтоговая сумма с %: " + deposit1);
        } else if(deposit >= 100000 && deposit <= 300000) {
            double precent = 7;
            double deposit2 = deposit + (deposit *  precent / 100);
            double sumPrecent = deposit2 - deposit;
            System.out.println("Cумма начисленного %: " + sumPrecent + "\nИтоговая сумма с %: " + deposit2);
        } else if(deposit > 300000) {
            double precent = 10;
            double deposit3 = deposit + (deposit *  precent / 100);
            double sumPrecent = deposit3 - deposit;
            System.out.println("Cумма начисленного %: " + sumPrecent + "\nИтоговая сумма с %: " + deposit3);
        }

        System.out.println("\nTask 7. Определение оценки по предметам.");
        double pointPrecentHistory = 59;
        double pointPrecentProgramming = 92;
        if(pointPrecentHistory <= 60) {
            System.out.println("Ваша оценка по истории - 2");
        }else if(pointPrecentHistory > 60 && pointPrecentHistory <= 73) {
            System.out.println("Ваша оценка по истории - 3");
        }else if(pointPrecentHistory > 73 && pointPrecentHistory <= 91) {
            System.out.println("Ваша оценка по истории - 4");
        }else if(pointPrecentHistory > 91) {
            System.out.println("Ваша оценка по истории - 5");
        }
        if(pointPrecentProgramming <= 60) {
            System.out.println("Ваша оценка по программированию - 2");
        }else if(pointPrecentProgramming > 60 && pointPrecentProgramming <= 73) {
            System.out.println("Ваша оценка по программированию - 3");
        }else if(pointPrecentProgramming > 73 && pointPrecentProgramming <= 91) {
            System.out.println("Ваша оценка по программированию - 4");
        }else if(pointPrecentProgramming > 91) {
            System.out.println("Ваша оценка по программированию - 5");
        }

        System.out.println("\nTask 8. Расчет годовой прибыли.");
        double dirtyMonthProfit = 13000;
        double rentRoom = 5000;
        double costProduction = 9000;
        double netProfit = dirtyMonthProfit - (rentRoom + costProduction);
        if(netProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + netProfit + "руб.");
        } else {
            System.out.println("Прибыль за год: " + netProfit + "руб.");
        }
    }
}