public class ClockDisplay {

        public static void main(String[] args)
        {
            int hours = 0;
            int minutes = 0;

                while (hours <= 11 && minutes <= 60)
                {
                    System.out.println("time is " + hours + ":" + minutes);
                    minutes++;

                    if (minutes == 60)
                    {
                        hours++;
                        minutes = 0;
                    }
                }
        }
}
