package basicSystem;
import java.text.SimpleDateFormat;
import java.util.Date;
public class numberday {
   private final Date date = new Date();
    private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private final String currentdate = format.format(date);
    private int day(String a) {
        int r;
        r = Integer.parseInt((String) a.subSequence(0, 2));
        return r;

    }
    private int month(String a) {
        int r;
        r = Integer.parseInt((String) a.subSequence(3, 5));
        return r;

    }
    private int year(String a) {
        int r;
        r = Integer.parseInt((String) a.subSequence(6, 10));
        return r;

    }
    public int datea(String s) {
        int dayes;
        if(s.equals(currentdate)){
            dayes=0;
        }else{
        int dayo = day(s);
        int montho = month(s);
        int yearo = year(s);
        int dayc = day(currentdate);
        int monthc = month(currentdate);
        int yearc = year(currentdate);
        dayes=numday(dayo,dayc,montho,monthc)+daymonth(montho,monthc,yearo,yearc)+dayinyear(yearo,yearc);
        }
        return dayes;
    }
    private int numday(int old, int current, int oldmonth,int c) {
        int nday;
        if (old >= current||current>old&&c>oldmonth) {
            if (oldmonth % 2 != 0) {
                nday = 31 - old + current;
            } else if (oldmonth == 2) {
                nday = 28 - old + current;
            } else {
                nday = 30 - old + current;
            }

        } else {
            nday = current - old;
        }
        return nday;
    }
    private int daymonth(int oldmonth, int currentmonth,int o,int c) {
        int nday;
        
        if (oldmonth >= currentmonth||currentmonth>oldmonth&&c>o) {
            nday = daysinmonth(12 - oldmonth + currentmonth, oldmonth);
        } else {
            nday = daysinmonth(currentmonth - oldmonth, oldmonth);
        }
        return nday;
    }
    private int daysinmonth(int nummonth, int star) {
        int nday = 0;
        for (int i = 1; i < nummonth; i++) {
            if (star % 2 != 0) {
                nday += 31;
            } else if (star == 2) {
                nday += 28;
            } else {
                nday += 30;
            }
            if (star == 12) {
                star = 0;
            }
            star++;
        }
        return nday;
    }
    private boolean leapyear(int year) {
        return ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0);
   
        
    }
    private int dayinyear(int oldyear,int currentyear ){
        int nday=0;
        for(int r=1;r<currentyear-oldyear;r++){
            if(leapyear(oldyear+r))
            {
                nday+=366;
            }
            else
            {
                nday+=365;
            }
        }return nday;
    }

}
