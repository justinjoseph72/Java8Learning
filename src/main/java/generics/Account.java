package generics;

import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class Account {

   public static void getDiff(){
       YearMonth ym1 =YearMonth.of(2015, Month.SEPTEMBER);
       YearMonth ym2 = YearMonth.of(2016,Month.FEBRUARY);
       System.out.print( ym2.until(ym1, ChronoUnit.MONTHS));
   }


   public static void main(String...args){
       getDiff();
   }
}
