package com.cici.springfestival.day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class SymmtryDate {

    public static void main(String[] args) throws ParseException {
        SymmtryDate sd = new SymmtryDate();
        sd.SymDataPrint();

    }

    private void SymDataPrint() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("10100101");

        //获取当前日期并格式化
        String today = sdf.format(new Date());
        Calendar c = Calendar.getInstance();

        while (Integer.valueOf(sdf.format(date)) < Integer.valueOf(today)) {

            //把时间转为日期格式，并判断是否满足条件，满足则输出
            if (isSymDate(sdf.format(date))) {
                System.out.println(sdf.format(date));
            }
            //把日期传入日历对象中
            c.setTime(date);
            //日历增加一天
            c.add(Calendar.DAY_OF_MONTH, 1);
            //根据日历获取到时间
            date = c.getTime();
        }
    }

    private boolean isSymDate(String date) {
        if (date == null) {
            return false;
        }
        if (date.length() != 8 || !Pattern.compile("\\d{8}").matcher(date).matches()) {
            return false;
        }

        String result1 = date.substring(4, 6);
        String result2 = date.substring(6);

        if (Integer.valueOf(result1) > 12 || Integer.valueOf(result2) > 31) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        char[] cs = date.toCharArray();
        for (int i = 0; i < cs.length / 2; i++) {
            if (cs[i] == cs[cs.length - 1 - i]) {
                set.add(cs[i]);
            } else {
                return false;
            }
        }
        if (set.size() > 2) {
            return false;
        }
        if (!set.contains('0') && set.size() == 2) {
            return false;
        }
        return true;
    }


}
