import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

/* How do you convert a string "2019-05-21" in to a Date() type? */
public class String2Date {

    public static void main(String[] args) throws ParseException {

        String dateStr = "2019-05-21";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(dateStr);
        System.out.println("Date yyyy-MM-dd date is ==> " + date);
    }
}

/*
1. Create String and SimpleDateFormat type variables.  We must convert String data type of specific date
to Date() data type as requested. 
2. Parse dateStr String through df SimpleDateFormat into date Date.  What this is doing on our third line
is reading our String dateStr and converting it into the Date data type using SimpleDataFormat.
3. Print resulting formatted date.
*/
