package practice16;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {

    		/*
        * ★ java.util.Dateクラスを使って、自分の生年月日を「YYYY年MM月DD日」形式で出力してください
        *  ※　他の標準クラスも使って良いです
        */
    //		Date date = new Date();

    	    Calendar cal = Calendar.getInstance(Locale.JAPAN);
    	    cal.set(1992, Month.JANUARY.getValue(), 20);
    	    Date date = cal.getTime();

    		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
    		System.out.println(f.format(date));
    }
}