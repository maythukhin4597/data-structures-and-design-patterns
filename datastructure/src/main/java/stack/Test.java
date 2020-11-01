package stack;

import java.text.DecimalFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("########.##");

        System.out.println(df.format(20222222.0999));

        Date date1 = new Date(2020, 10, 10);
        Date date2 = new Date(2020, 10, 11);

        if( date1.compareTo(date2) <=0){
            System.out.println(0 >= date1.compareTo(date2));
        }

    }
}
