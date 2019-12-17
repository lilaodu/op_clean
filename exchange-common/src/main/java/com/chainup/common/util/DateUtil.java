package com.chainup.common.util;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;



/**
 * 日期工具类
 * @author han
 *
 */
public class DateUtil {

	/*static {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
	}*/

	public static Date getDate() {
		return Calendar.getInstance().getTime();
	}
	/**
	 * 判断thisDate 与 thatDate 大小关系
	 * @author hanzhonghua
	 * @param thisDate
	 * @param thatDate
	 * @return
	 */
    public static boolean greaterThan(Date thisDate, Date thatDate) {
        return compare(thisDate, thatDate) > 0;
    }
    /**
     * 比较两个日期的大小关系
     * @author hanzhonghua
     * @param thisDate
     * @param thatDate
     * @return
     */
    public static int compare(Date thisDate, Date thatDate) {
        if (thisDate.getTime() > thatDate.getTime()) {
            return 1;
        }

        if (thisDate.getTime() == thatDate.getTime()) {
            return 0;
        }

        return -1;
    }
    /**
     * Date 转 String
     * @param date
     * @author hanzhonghua
     * @return
     */
    public static String formatDate(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(date);
    }


    /**
     * Date 转 String(自定义pattern)
     * @param date
     * @author hanzhonghua
     * @return
     */
    public static String formatDate(Date date, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }


    /**
     * String 转  Date
     * @param date
     * @author hanzhonghua
     * @return
     */
    public static Date parseDate(String dateTime) {
        try {
            return org.apache.commons.lang.time.
            DateUtils.parseDate(dateTime, new String[]{
                "yyyy-MM-dd HH:mm:ss",
                "yyyy/MM/dd HH:mm:ss",
                "yyyy-MM-dd HH:mm",
                "yyyy/MM/dd HH:mm",
                "yyyy-MM-dd",
                "yyyyMMdd",
                "yyyy年MM月dd日",
                "yyyy/MM/dd"});
        } catch (Exception e1) {
            return null;
        }
    }

    public static String getDateTime() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
    /**
     * 获取今天零点
     * @author hanzhonghua
     * @return
     */
    public static Date getFirstTimeOfToday() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(df.format(new Date()));
        } catch (ParseException e) {
            return null;
        }
    }
    /**
     * 获取昨天零点
     * @author hanzhonghua
     * @return
     */
    public static Date getFirstTimeOfYesterday() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date yestoday = new Date(new Date().getTime() - 24*3600000l);
        try {
            return df.parse(df.format(yestoday));
        } catch (ParseException e) {
            return null;
        }
    }
    /**
     * 获取上周日最后的日期   这里设置周一作为一周的第一天
     * @author hanzhonghua
     * @return
     */
    public static Date getLastWeek(){
    	Calendar cal =Calendar.getInstance();
    	cal.setFirstDayOfWeek(Calendar.MONDAY);
    	cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
    	cal.add(Calendar.WEEK_OF_YEAR, -1);
    	String lastWeek = formatDate(cal.getTime(), "yyyy-MM-dd "+"23:59:59");
    	return parseDate(lastWeek);
    }

    /**
     * 获得前一天
     * @param args
     */
    public static String getBeforeDay(){

    	Calendar c = Calendar.getInstance();

    	c.add(Calendar.DAY_OF_MONTH, -1);

    	return formatDate(c.getTime(), "yyyy-MM-dd");

    }
    /**
     * 获取本周日最后的日期  这里设置周一作为一周的第一天
     * @author hanzhonghua
     * @return
     */
    public static Date getWeek(){
    	Calendar cal =Calendar.getInstance();
    	cal.setFirstDayOfWeek(Calendar.MONDAY);
    	cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
    	cal.add(Calendar.WEEK_OF_YEAR, 0);
    	String week = formatDate(cal.getTime(), "yyyy-MM-dd "+"23:59:59");
    	return parseDate(week);
    }


    /**
     * @author hanzhonghua
     * 获取上个自然月的最后日期
     * @return
     */
    public static Date getLastMonth(){
    	Calendar c = Calendar.getInstance();
    	c.add(Calendar.MONTH, -1);
        //得到一个月最后一天日期(31/30/29/28)
  	    int MaxDay=c.getActualMaximum(Calendar.DAY_OF_MONTH);
  	    c.set( c.get(Calendar.YEAR), c.get(Calendar.MONTH), MaxDay, 23, 59, 59);
  	    String lastMonth = formatDate(c.getTime());
  	    return parseDate(lastMonth);
    }

    /**
     * @author hanzhonghua
     * 获取本月的最后日期
     * @param args
     */
    public static Date getMonth(){
    	Calendar c = Calendar.getInstance();
    	c.add(Calendar.MONTH, 0);
        //得到一个月最后一天日期(31/30/29/28)
  	    int MaxDay=c.getActualMaximum(Calendar.DAY_OF_MONTH);
  	    c.set( c.get(Calendar.YEAR), c.get(Calendar.MONTH), MaxDay, 23, 59, 59);
  	    String lastMonth = formatDate(c.getTime());
  	    return parseDate(lastMonth);
    }


    /**
     * @author hanzhonghua
     * date2比date1多的天数
     * @param date1
     * @param date2
     * @return
     */
    public static int differentDays(Date date1,Date date2)
    {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
       int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2)   //同一年
        {
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年
                {
                    timeDistance += 366;
                }
                else    //不是闰年
                {
                    timeDistance += 365;
                }
            }

            return timeDistance + (day2-day1) ;
        }
        else    //不同年
        {
            return day2-day1;
        }
    }

    
    public static boolean isSameDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                .get(Calendar.YEAR);
        boolean isSameMonth = isSameYear
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        boolean isSameDate = isSameMonth
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2
                        .get(Calendar.DAY_OF_MONTH);

        return isSameDate;
    }
    
    public static Date getStartDayOfWeekNo(int year,int weekNo){  
        Calendar cal = getCalendarFormYear(year);  
        cal.set(Calendar.WEEK_OF_YEAR, weekNo);  
        return parseDate(cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" +  
                cal.get(Calendar.DAY_OF_MONTH));      
          
    }  
    
    public static String getEndDayOfWeekNo(int year,int weekNo){  
        Calendar cal = getCalendarFormYear(year);  
        cal.set(Calendar.WEEK_OF_YEAR, weekNo);  
        cal.add(Calendar.DAY_OF_WEEK, 6);  
        return cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" +  
               cal.get(Calendar.DAY_OF_MONTH);      
    }  
    
    public static Calendar getCalendarFormYear(int year){  
        Calendar cal = Calendar.getInstance();  
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);        
        cal.set(Calendar.YEAR, year);  
        return cal;  
    }  
    
    
    public static Date getDayBeginTime(Date time){
    	return parseDate(formatDate(time, "yyyy-MM-dd 00:00:00"));
    }
    
    public static Date getMonthBeginTime(Date time){
    	return parseDate(formatDate(time, "yyyy-MM-01 00:00:00"));
    }
    
    public static Date getPrevMinTime(Date time){
    	return parseDate(formatDate(time, "yyyy-MM-dd HH:mm:00"));
    }
    
    public static Date getWeekBeginTime(Date time){
    	SimpleDateFormat simdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(time);
    	cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
    	String weekhand = simdf.format(cal.getTime());
    	//System.out.println(weekhand);
		return parseDate(weekhand);
    	
    }
    
    public static int getDaysOfMonth(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  
    }  
    
    
    public static void main(String[] args) {
    	System.out.println(formatDate(new Date()));
    	System.out.println(formatDate(getMonthBeginTime(new Date())));

	}
    
    

}
