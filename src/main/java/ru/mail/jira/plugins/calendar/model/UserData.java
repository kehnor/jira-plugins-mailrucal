package ru.mail.jira.plugins.calendar.model;

import net.java.ao.Entity;

/**
 * User preferences
 */
public interface UserData extends Entity {
    /** Userkey */
    String getUserKey();

    void setUserKey(String userKey);

    /** Week, day or month */
    String getDefaultView();

    void setDefaultView(String defaultView);

    /** Show time or not */
    boolean isShowTime();

    void setShowTime(boolean showTime);

    /** Hide weekends or not */
    boolean isHideWeekends();

    void setHideWeekends(boolean hideWeekends);

    /** Hide versions or not */
    boolean isHideVersions();

    void setHideVersions(boolean hideCustomEvents);

    /** Hide versions or not */
    boolean isHideCustomEvents();

    void setHideCustomEvents(boolean hideCustomEvents);

    /** Ids of showed calendars */
    String getShowedCalendars();

    void setShowedCalendars(String showedCalendars);
}
