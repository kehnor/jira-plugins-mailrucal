package ru.mail.jira.plugins.calendar.model;


import net.java.ao.Entity;
import net.java.ao.Preload;

/**
 * User event preference
 */
public interface IEvent extends Entity {

    /** Name */
    String getIssueKey();

    void setIssueKey(String issueKey);

    /** Color */
    String getColor();

    void setColor(String color);

    /** First date field of range */
    String getStart();

    void setStart(String start);

    /** Last date field of range */
    String getEnd();

    void setEnd(String End);

    /** Last date field of range */
    boolean getAllDay();

    void setAllDay(boolean AllDay);

}