package com.web.dto;

import com.web.entity.UserDto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author lbs
 * @description dto类
 */
public class PostDto {
    private static final SimpleDateFormat DATE_FORMAT
            = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private Long id;
    private String title;
    private String url;
    private String date;
    private UserDto user;

    public Date getSubmissionDateConverted(String timezone) throws ParseException {
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone(timezone));
        return DATE_FORMAT.parse(this.date);
    }

    public void setSubmissionDate(Date date, String timezone) {
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone(timezone));
        this.date = DATE_FORMAT.format(date);
    }
}
