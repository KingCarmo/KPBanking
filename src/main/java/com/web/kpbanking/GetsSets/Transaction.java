/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.kpbanking.GetsSets;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kevin Carmody && Peter Finegan
 *
 */
@XmlRootElement
public class Transaction {

    /**
     * Variables
     */
    private int transID;
    private String transDate;
    private int transTo;
    private int transFrom;
    private long amount;

    /**
     * Constructor(s)
     */
    public Transaction() {

    }

    public Transaction(int transID, String transDate, int transTo, int transFrom, long amount) {
        this.transID = transID;
        this.transDate = transDate;
        this.transTo = transTo;
        this.transFrom = transFrom;
        this.amount = amount;
    }
    
    //Getters and setters for above variables
    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public int getTransTo() {
        return transTo;
    }

    public void setTransTo(int transTo) {
        this.transTo = transTo;
    }

    public int getTransFrom() {
        return transFrom;
    }

    public void setTransFrom(int transFrom) {
        this.transFrom = transFrom;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
