/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod8_1302194071; //nama packages

import java.time.LocalDateTime;
/**
 *
 * @author Adam_1302194071
 */
public class Email_1302194071 {
    private int id;
    private String seender, subject, content;
    private LocalDateTime datetime;
    private boolean starred;

    public int getId_1302194071() {
        return id;
    }

    public String getSender_1302194071() {
        return sender;
    }

    public String getSubject_1302194071() {
        return subject;
    }

    public String getContent_1302194071() {
       return content;
    }

    public LocalDateTime getDatetime_1302194071() {
        return datetime;
    }

    public boolean isStarred_1302194071() {
        return starred;
    }

    public void setId_1302194071(int id) {
        this.id = id;
    }

    public void setSender_1302194071(String sender) {
        this.sender = sender;
    }

    public void setSubject_1302194071(String subject) {
        this.subject = subject;
    }

    public void setContent_1302194071(String content) {
        this.content = content;
    }

    public void setDatetime_1302194071(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public void setStarred_1302194071(boolean starred) {
        this.starred = starred;
    }

    public void outputQueryInsert_1302194071() {

    }
 
    public Email_1302194071(int id, String sender, String subject, String content, LocalDateTime datetime, boolean starred) {
        this.id = id;
        this.sender = sender;
        this.subject = subject;
        this.content = content;
        this.datetime = datetime;
        this.starred = starred;
    }
}
