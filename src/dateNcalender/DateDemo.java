package dateNcalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
public static void main(String[] args) {
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	System.out.println(sdf.format(d));
	System.out.println(sd.format(d));
	
	
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(sdf1.format(cal.getTime()));
	System.out.println(Calendar.DAY_OF_MONTH);
}
}
