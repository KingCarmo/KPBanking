package com.web.kpbanking.services;

import java.util.ArrayList;
import java.util.List;
//Important to add your classes into this
import com.web.kpbanking.GetsSets.Account;
import com.web.kpbanking.GetsSets.Members;
import com.web.kpbanking.database.Database;

/**
 *
 * @author Kevin Carmody && Peter Finegan w/ help of my cousin who helped me
 * write the code for the service part
 *
 */
public class AccountService {

    //creating db object
    Database data = new Database();

    //creating constructors
    public AccountService() {

    }

    //gathering all accounts on db
    public List<Account> getAllAccounts() {
        return data.getAccountDB();
    }

    //Gathering bank account by it's  acc number
    public Account getAccByNum(int accNum) {
        Account acc = new Account();

        for (Account ge : data.getAccountDB()) {
            if (ge.getAccNum() == (accNum)) {
                acc = ge;
            }
        }
        return acc;
    }

    //Get Account by UniqID
    // Make sure you create a seperate constructors or below won't work
    public Account getAccountByUID(int uid) {
        Account acc = new Account();

        for (Account get : data.getAccountDB()) {
            if (get.getMemberID() == (uid)) {
                acc = get;
            }
        }
        return acc;
    }

    /* Create Account on the DB */
    public boolean addAccount(Account adac) {
        int before = data.getAccountDB().size();
        data.addAccount(adac);
        int after = data.getAccountDB().size();

        if (after > before) {
            return true;
        }
        return false;
    }

    public boolean addAccountByMembers(Members c) {
        int before = data.getAccountDB().size();
        Account custacc = new Account();
        custacc.setMemberID(c.getMemberUniqID());
        custacc.setAccNum(data.getAccountDB().size() + 1);
        data.addAccount(custacc);
        int after = data.getAccountDB().size();
        if (after > before) {
            System.out.println("The account created by the Customer has been a success");
            return true;
        }
        return false;
    }

    // Gathering Account balance
    public double getAccBal(int accNum) {
        for (Account q : data.getAccountDB()) {
            if (q.getAccNum() == (accNum)) {
                return q.getBalance();
            }
        }
        return 0;
    }

    /* Delete Account */
    public boolean deleteAccount(Account delac) {

        return data.deleteAccount(delac);
    }
}
