package day3;

public class yearDay {
    public static void main(String[] args) {
        int from = 2000;
        int to =2060;
        int diff = to-from;
        int leapYear;
        if ((from%100==0)&&(from%4==0)) {
            leapYear = (diff/4)+1;
            if ((to%4)==0)
             {
                leapYear = (diff/4)+1;
             }
        }
        
        else 
        {
            leapYear = (diff/4);
        }

        int nonleap = diff - leapYear;
        int leapodddays= leapYear*2;
        int totalOddDays = nonleap + leapodddays;
        int remainder = totalOddDays%7;
        switch (remainder) {
            case 0:
                System.out.println("Saturday");
                break;
                case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
                break;
        
            default:
                break;
        }
    }
}
