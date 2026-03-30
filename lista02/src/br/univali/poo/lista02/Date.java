package br.univali.poo.lista02;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year){
        if(month <= 12 && month > 0){
            this.month = month;
        }
        if(validDay(day, month)) {
            this.day = day;
        }
        if(year > 0) {
            this.year = year;
        }
    }
    private static boolean validDay(int day, int month){
        int[] m31 = {1, 3, 5, 7, 8, 10, 12};
        if(day > 0) {
            if (month == 2) {
                return day <= 29;
            }
            for (int j : m31) {
                if (month == j) {
                    return day <= 31;
                }
            }
            return day <= 30;
        }
        return false;
    }

    public int getDay(int day) {
        return this.day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(validDay(day, this.month)){
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if(month > 0 && month <= 12) this.month = month;
    }

    public void setYear(int year) {
        if(year > 0) this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
