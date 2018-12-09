package com.web.kpbanking.GetsSets;

//import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

/**
 *
 * @author Kevin Carmody && Peter Finegan
 *
 */
@XmlRootElement
public class Account {

//Following Variables are apart of the member bank account
    //Member needs an Account Number
    private int accNum;
    //Member Requires a MemberID
    private int memberID;
    /*Float vs Double - why?
        A float is mainly used to save memory in large arrays of floating point numbers.
        Always we need to remember that data type should never be used for precise values, such as currency.
        The double data type is normally the default choice for decimal values. The data type should never be used for precise values, such as currency.
     */
    private double balance;
    private String accountType;

    public Account() {

    }

    public Account(int accNum, int memberID, String accountType, double balance) {
        this.accNum = accNum;
        this.memberID = memberID;
        this.accountType = accountType;
        this.balance = balance;
    }

    //Get and Set your above variables
    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
