package com.bensemi.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author user
 */
@Entity
public class Event implements Serializable{
    @Id @NotNull
    private String hashUrl;
    @NotNull
    private String eventName;
    private String memo;
    @NotNull
    private String candidateDates;
    
    public Event(){
        
    }
    
    public Event(String e, String m, String c, String h){
        this.eventName = e;
        this.memo = m;
        this.candidateDates = c;
        this.hashUrl = h;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCandidateDates() {
        return candidateDates;
    }

    public void setCandidateDates(String candidateDates) {
        this.candidateDates = candidateDates;
    }

    public String getHashUrl() {
        return hashUrl;
    }

    public void setHashUrl(String hashUrl) {
        this.hashUrl = hashUrl;
    }
    
}
