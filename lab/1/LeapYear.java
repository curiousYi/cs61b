public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Started!");
        int year = Integer.parseInt(args[0]);

        if(year % 400 == 0) {
          System.out.println(args[0] + " is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
          System.out.println(args[0] + " is a leap year");
        } else {
          System.out.println(args[0] + " is not a leap year");
        }
    }
}

