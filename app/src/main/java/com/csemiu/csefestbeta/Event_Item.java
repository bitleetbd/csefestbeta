package com.csemiu.csefestbeta;

public class Event_Item {

    private String Event_name;
    private String Venue_name;
    private String Time_name;

    public Event_Item() {

    }

    public Event_Item(String event_name, String venue_name, String time_name) {
        Event_name = event_name;
        Venue_name = venue_name;
        Time_name = time_name;
    }

    public String getEvent_name() {
        return Event_name;
    }

    public void setEvent_name(String event_name) {
        Event_name = event_name;
    }

    public String getVenue_name() {
        return Venue_name;
    }

    public void setVenue_name(String venue_name) {
        Venue_name = venue_name;
    }

    public String getTime_name() {
        return Time_name;
    }

    public void setTime_name(String time_name) {
        Time_name = time_name;
    }
}
