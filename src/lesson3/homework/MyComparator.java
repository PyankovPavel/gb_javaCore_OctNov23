package lesson3.homework;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyComparator {
        /*Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в виде
    трёх чисел гггг-мм-дд, без использования условного оператора.*/

    public static void main(String[] args) {
        SomeDate date1 = new SomeDate(1990, 11, 19);
        SomeDate date2 = new SomeDate(1987, 4, 19);
        System.out.println(compare(date1, date2));
    }

    /**
     * Метод сравнения двух дат в формате гггг-мм-дд
     *
     * @param someDate1 - первая дата
     * @param someDate2 - вторая дата
     * @return Если возвращаемое число больше 0, значит первая дата "моложе" второй,
     * если возвращаемое число меньше 0, значит первая дата "старше" второй,
     * если возвращаемое число равно 0, то даты идентичны.
     */
    public static long compare(SomeDate someDate1, SomeDate someDate2) {
        Calendar calendar1 = new GregorianCalendar();
        Calendar calendar2 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR, someDate1.getYear());
        calendar1.set(Calendar.MONTH, someDate1.getMonth() - 1);
        calendar1.set(Calendar.DATE, someDate1.getDay());
        calendar2.set(Calendar.YEAR, someDate2.getYear());
        calendar2.set(Calendar.MONTH, someDate2.getMonth() - 1);
        calendar2.set(Calendar.DATE, someDate2.getDay());
        return calendar1.getTimeInMillis() / 100_000_000 - calendar2.getTimeInMillis() / 100_000_000;
    }

    public static class SomeDate {
        int day;
        int month;
        int year;

        public SomeDate(int year, int month, int day) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }
    }
}
