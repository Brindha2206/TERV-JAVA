package day3;
public class days {
    public static void main(String[] args) {
        System.out.println("Today is Monday");
        int today = 25;
        int cal = today%7;
        if (cal==0) {
            System.out.println("From today, The next "+today + "th "+ "day is "+"Monday");
        }
        else if (cal==1) {
            System.out.println("From today, The next "+today + "th "+ "day is "+"Tuesday");
        }
        else if (cal==2) {
            System.out.println("From today, The next "+today + "th "+ "day is "+"Wednesday");
        }
        else if (cal==3) {
            System.out.println("From today, The next "+today + "th "+ "day is "+"Thursday");
        }
        else if (cal==4) {
            System.out.println("From today, The next "+today + "th "+ "day is "+"Friday");
        }
        else if (cal==5) {
            System.out.println("From today, The next "+today + "th "+ "day is "+"Saturday");
        }
        else if (cal==6) {
            System.out.println("From today, The next "+today + "th "+ "day is "+"Sunday");
        }
    }
}
