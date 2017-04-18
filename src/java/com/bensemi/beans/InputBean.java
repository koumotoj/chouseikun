package com.bensemi.beans;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/**
 *
 * @author koumotoj
 */
@Named
@RequestScoped
public class InputBean {
    private String eventName;
    private String memo;
    private String candidateDates;
    
    public InputBean(){
    }
    
    public InputBean(String e, String m, String c){
        this.eventName = e;
        this.memo = m;
        this.candidateDates = c;
    }

    public String getEventName() {
        return eventName;
    }

    public String getMemo() {
        return memo;
    }

    public String getCandidateDates() {
        return candidateDates;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setCandidateDates(String candidateDates) {
        this.candidateDates = candidateDates;
    }
    
    public void print(){
        System.out.println(getHash());
    }
    
    public String getHash(){
        MessageDigest md = null;
        try{
            md = MessageDigest.getInstance("SHA-256");
        }catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        long millitime = new Date().getTime();
        String seed = String.valueOf(millitime);
        seed += eventName;
        md.update(seed.getBytes());
        byte[] cipherByte = md.digest();
        StringBuilder sb = new StringBuilder(2 * cipherByte.length);
        for(byte b: cipherByte) {
            sb.append(String.format("%02x", b&0xff) );
        }
        String hash = sb.toString();
        return hash;
    }
    
    public String next(){
        return "WEB-INF/newEvent.xhtml";
    }
}
