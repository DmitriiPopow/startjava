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
        System.out.println("Количество ядер CPU: " + core + "\nВерсия Windows: " + windows +
                "\nРазрядность системы: " + bit + "\nРазмер оперативной памяти RAM: " + ram +
                "\nВерсия биоса: " + bios + "\nЧастота процессора: " + GHz +
                "\nРабочий компьютер: " + workComputer + "\nКоличество динамиков: " + speakers);

        System.out.println("\nTask 2. Расчет стоимости товара со скидкой.");
        double penPrice = 100;
        double bookPrice = 200;
        double tottalPrice = penPrice + bookPrice;
        double tottalDiscount = (penPrice + bookPrice) * 0.11;
        System.out.println("Общая стоимость товаров без скидки = " + tottalPrice +
                "\nСумма скидки товаров = " + tottalDiscount +
                "\nОбщая стоимость товаров со скидкой = " + (tottalPrice - tottalDiscount));

        System.out.println("\nTask 3. Вывод слова JAVA.");
        System.out.println("   J    a  v     v  a" + 
                "\n   J   a a  v   v  a a"+
                "\nJ  J  aaaaa  V V  aaaaa" +
                "\n JJ  a     a  V  a     a");

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
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значения переменных после перестановки: \na = "+ a + "\nb = " + b);
        System.out.println("Перестановка значений переменных с помощью побитовых операций. ");
        System.out.println("Исходные значения переменных:"+ "\na = " + a + "\nb = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Значения переменных после перестановки: \na = "+ a + "\nb = " + b);

        System.out.println("\nTask 6. Вывод символов и их кодов.");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("код" + " | " + "символ");
        System.out.println((int) dollar + "  | " + dollar + "\n" + (int) asterisk +
                "  | " + asterisk + "\n" + (int) atSign + "  | " + atSign +  "\n" +
                (int) verticalBar + " | " + verticalBar + "\n" + (int) tilde + " | " + tilde);

        System.out.println("\nTask 7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rigthParenthesis = ')';
        System.out.println("    " + slash + backslash + "\n" + "   " + slash + "  " + backslash + "\n" +
                "  " + slash + underscore + leftParenthesis + " " + rigthParenthesis +
                backslash + "\n" + " " + slash + "      " + backslash + "\n" + slash +
                underscore + underscore + underscore + underscore + slash + backslash + underscore +
                underscore + backslash);

        System.out.println("\nTask 8. Вывод количества сотен, десятков и единиц числа.");
        int givenNumber = 123;
        int hundreds = givenNumber / 100;
        int tens = (givenNumber % 100) / 10;
        int ones = givenNumber % 10;
        int sumNumebrs = hundreds + tens + ones;
        int productNumbers = hundreds * tens * ones;
        System.out.println("Число " + givenNumber + " содержит:" + "\n  сотен - " + hundreds +
                "\n  десятков - " + tens + "\n  единиц - " + ones +
                "\nСумма его цифр = " + sumNumebrs + "\nПроизведение = " + productNumbers);

        System.out.println("\nTask 9. Вывод времени.");
        int givenTime = 86399;
        int hours = givenTime / 3600;
        int minutes = givenTime / 60 % 60;
        int seconds = givenTime % 60;
        System.out.println("Время: " + hours + ":" + minutes +":" + seconds);
    }
}