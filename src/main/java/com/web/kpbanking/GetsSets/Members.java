package com.web.kpbanking.GetsSets;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 *
 * @author Kevin Carmody && Peter Finegan
 *
 *
 */
@XmlRootElement
public class Members {

    private String memberFirstName;
    private String memberLastName;
    private String memberHome;
    private String memberSortCode;
    private String memberEmail;
    private int memberUniqID;

    public Members() {
    }

    public Members(String memberFirstName, String memberLastName, String memberHome, String memberSortCode, String memberEmail, int memberUniqID) {
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberHome = memberHome;
        this.memberSortCode = memberSortCode;
        this.memberEmail = memberEmail;
        this.memberUniqID = memberUniqID;
    }

    public String getMemberFirstName() {
        return memberFirstName;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    public String getMemberHome() {
        return memberHome;
    }

    public void setMemberHome(String memberHome) {
        this.memberHome = memberHome;
    }

    public String getMemberSortCode() {
        return memberSortCode;
    }

    public void setMemberSortCode(String memberSortCode) {
        this.memberSortCode = memberSortCode;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public int getMemberUniqID() {
        return memberUniqID;
    }

    public void setMemberUniqID(int memberUniqID) {
        this.memberUniqID = memberUniqID;
    }

}
