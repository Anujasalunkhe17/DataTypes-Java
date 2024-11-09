//A person is storing data, month and year in variable(write a code to print date, month and year and also print the  total seconds in a day ,month and year
class DateTimeDetails {
    public static void main(String[] args) {
        int date = 9;              // Current date
        int month = 11;            // Current month
        int year = 2024;           // Current year

        int secondsInDay = 24 * 60 * 60;          // Total seconds in a day
        int secondsInMonth = secondsInDay * 30;   // Total seconds in a 30-day month
        int secondsInYear = secondsInDay * 365;   // Total seconds in a 365-day year

        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Total seconds in a day: " + secondsInDay);
        System.out.println("Total seconds in a month (30 days): " + secondsInMonth);
        System.out.println("Total seconds in a year (365 days): " + secondsInYear);
    }
}

