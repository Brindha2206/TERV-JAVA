package day2;
   public class tcs2W4W{
            public static void main(String[] args) {
                int wheels = 540;
                int vehicles = 200;

                if (wheels> vehicles && (wheels%2)==0  ) {
                int twoWheelers = (((vehicles*4)-wheels)/2);
                int fourWheelers = vehicles - twoWheelers;
                System.out.println("The total 2 wheelers required are : " + twoWheelers);
                System.out.println("The total 4 wheelers required are : " + fourWheelers);
                }

                else{
                    System.out.println("Invalid");
                }
            }
    }
