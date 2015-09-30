package ru.mail.jira.plugins.calendar.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings({"UnusedDeclaration", "FieldCanBeLocal"})
@XmlRootElement
public class Event {
    @XmlElement
    private String id;
    @XmlElement
    private String issueKey;
    @XmlElement
    private long calendarId;
    @XmlElement
    private boolean allDay;
    @XmlElement
    private String color;
    @XmlElement
    private String end;
    @XmlElement
    private String start;
    @XmlElement
    private String title;
    @XmlElement
    private boolean durationEditable;
    @XmlElement
    private boolean startEditable;
    @XmlElement
    private boolean customEvent = false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(String issueKey) {
        this.issueKey = issueKey;
    }

    public long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(long calendarId) {
        this.calendarId = calendarId;
    }

    public boolean isAllDay() {
        return allDay;
    }

    public void setAllDay(boolean allDay) {
        this.allDay = allDay;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDurationEditable() {
        return durationEditable;
    }

    public void setDurationEditable(boolean durationEditable) {
        this.durationEditable = durationEditable;
    }

    public boolean isStartEditable() {
        return startEditable;
    }

    public void setStartEditable(boolean startEditable) {
        this.startEditable = startEditable;
    }

    public boolean isCustomEvent() {
        return customEvent;
    }

    public void setCustomEvent(boolean customEvent) {
        this.customEvent = customEvent;
    }

    public Event(IEvent event) {
        this.id = Integer.toString(event.getID());
        this.issueKey = event.getIssueKey();
        this.color = event.getColor();
        this.start = event.getStart();
        this.end = event.getEnd();
        this.allDay = event.getAllDay();
    }

    public Event() {
    }

}
