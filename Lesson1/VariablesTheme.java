public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("Task 1. Вывод характеристик компьютера EasyNote TE11HC.");
        char core = '2';
        short windows = 10;
        int bit = 64;
        long ram = 4096L;
        float bios = 1.05F;
        double GHz= 2.2;
        boolean workComputer = true;
        byte speakers = 2;
        System.out.println("Количество ядер CPU: " + core + "\nВерсия Windows: " +
            windows + "\nРазрядность системы: " + bit + "\nРазмер оперативной памяти RAM: " + ram +
            "\nВерсия биоса: " + bios + "\nЧастота процессора: " + GHz +
            "\nРабочий компьютер: " + workComputer + "\nКоличество динамиков: " + speakers);

        System.out.println("\nTask 2. Расчет стоимости товара со скидкой.");
        double penPrice = 100;
        double bookPrice = 200;
        double tottalPrice = penPrice + bookPrice;
        double totalDiscount = (penPrice+bookPrice)*0.11;
        System.out.println("Общая стоимость товаров без скидки = " + tottalPrice +
            "\nСумма скидки товаров = " + totalDiscount +
            "\nОбщая стоимость товаров со скидкой = " + (tottalPrice - totalDiscount));

        System.out.println("\nTask 3. Вывод слова JAVA.");
        System.out.println("   J    a  v     v  a" + 
            "\n   J   a a  v   v  a a"+
            "\nJ  J  aaaaa  V V  aaaaa" +
            "\n JJ  a     a  V  a     a");
        System.out.println("\nTask 3. Вывод слова JAVA.");

        System.out.println("\nTask 4. Вывод min и max значений целых числовых типов.");
        byte maxByte = 127;
        System.out.println("Первоначальное значение: " + maxByte +
            "\nЗначение после инкремента на единицу: " + ++maxByte +
            "\nЗначение после декремента на единицу: " + --maxByte);
        short maxShort = 32_767;
        System.out.println("Первоначальное значение: " + maxShort +
            "\nЗначение после инкремента на единицу: " + ++maxShort +
            "\nЗначение после декремента на единицу: " + --maxShort);
        int maxInteger = 2_147_483_647;
        System.out.println("Первоначальное значение: " + maxInteger +
            "\nЗначение после инкремента на единицу: " + ++maxInteger +
            "\nЗначение после декремента на единицу: " + --maxInteger);
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Первоначальное значение: " + maxLong +
            "\nЗначение после инкремента на единицу: " + ++maxLong +
            "\nЗначение после декремента на единицу: " + --maxLong);

        System.out.println("\nTask 5. Перестановка значений переменных.");
        int a = 2;
        int b = 5;
        System.out.println("Перестановка значений переменных с помощью третьей переменной." +
            "\nИсходные значения переменных:"+ "\na = " + a + "\nb = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Значения переменных после перестановки: \na = "+ a + "\nb = " + b);
        System.out.println("Перестановка значений переменных с помощью арифметических операций." +
            "\nИсходные значения переменных:"+ "\na = " + a + "\nb = " + b);
        a = - a - b;
        b = - a - b;
        a = - a - b;
        System.out.println("Значения переменных после перестановки: \na = "+ a + "\nb = " + b);
        System.out.println("Перестановка значений переменных с помощью побитовых операций. ");
        System.out.println("Исходные значения переменных:"+ "\na = " + a + "\nb = " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Значения переменных после перестановки: \na = "+ a + "\nb = " + b);

        System.out.println("\nTask 6. Вывод символов и их кодов.");
        int code36 = 36;
        int code42 = 42;
        int code64 = 64;
        int code124 = 124;
        int code126 = 126;
        char simbol36 = 36;
        char simbol42 = 42;
        char simbol64 = 64;
        char simbol124 = 124;
        char simbol126 = 126;
        System.out.println("код символа" + " | " + "символ");
        System.out.println("        " + code36 + "  | " + simbol36 + "\n        " +
            code42 + "  | " + simbol42 + "\n        " + code64 + "  | " + simbol64 +  "\n        " +
            code124 + " | " + simbol124 + "\n        " + code126 + " | " + simbol126);

        System.out.println("\nTask 7. Вывод в консоль ASCII-арт Дюка.");
        char slash = 47;
        char backslash = 92;
        char underscore = 95;
        char leftParenthesis = 40;
        char rigthParenthesis = 41;
        System.out.println("    " + slash + backslash + "\n   " + slash + "  " + backslash +
            "\n  " + slash + underscore + leftParenthesis + " " + rigthParenthesis + backslash +
            "\n " + slash + "      " + backslash + "\n" + slash +  underscore + underscore +
            underscore + underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\nTask 8. Вывод количества сотен, десятков и единиц числа.");
        int n = 123;
        int hundreds,tens,ones,sumNumebrs,productNumbers;
        hundreds = n / 100;
        tens = (n % 100) / 10;
        ones = n % 10;
        sumNumebrs = hundreds + tens + ones;
        productNumbers = hundreds * tens * ones;
        System.out.println("Число " + n + " содержит:" + "\n  сотен - " + hundreds +
            "\n  десятков - " + tens + "\n  единиц - " + ones +
            "\nСумма его цифр = " + sumNumebrs + "\nПроизведение = " + productNumbers);
        System.out.println("\nTask 9. Вывод времени.");
        int x = 86399;
        int hours = x / 3600;
        int minutes = x / 60 % 60;
        int seconds = x % 60;
        System.out.println("Время: " + hours + ":" + minutes +":" + seconds);
    }
}