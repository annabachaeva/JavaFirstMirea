package ru.mirea.task19;

// Эта программа генерирует исключение всякий раз, когда баланс
// сумма ниже 1000 рупий

class MyException extends Exception {
    // хранить информацию об учетной записи
    private static int accno[] = {1001, 1002, 1003, 1004};
    private static String name[] = {"Ded", "Holli", "Maikl", "Ali", "Kell"};
    private static double bal[] =
            {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
    // конструктор по умолчанию
    MyException() {    }

    // параметризованный конструктор
    MyException(String str) { super(str); }
    public static void main(String[] args) {
        try  {
            // отображаем заголовок таблицы
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            // отображаем актуальную информацию об аккаунте
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
                // отображаем собственное исключение, если баланс <1000
                if (bal[i] < 1000)
                {
                    MyException me = new MyException("Balance is less than 1000");
                    throw me;
                }
            }
        } // конец попытки
        catch (MyException e) {
            e.printStackTrace();
        }
    }
}
