/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.kpbanking.database;

/**
 *
 * @author Kevin Carmody && Peter Finegan Random Database
 *
 */
import com.web.kpbanking.GetsSets.Account;
import com.web.kpbanking.GetsSets.Members;
import com.web.kpbanking.GetsSets.Transaction;
import java.util.List;
import java.util.ArrayList;

//Reference - Class Mates helped in class with how to do this random picked Database when struggling
public class Database {

    private static List<Members> memberDB = new ArrayList<>();
    private static List<Account> accountDB = new ArrayList<>();
    private static List<Transaction> transactionDB = new ArrayList<>();

    public static boolean init = true;

    public Database() {
        if (init) {

            //Account DB
            Account acc1 = new Account(201, 321, "Current", (double) 43000);
            Account acc2 = new Account(332, 322, "Current", (double) 45000);
            Account acc3 = new Account(101, 323, "Savings", (double) 155000);
            Account acc4 = new Account(69, 921, "Saving", (double) 4000);
            Account acc5 = new Account(12, 521, "Current", (double) 7000);
            Account acc6 = new Account(19, 221, "Loan", (double) -14897);
            Account acc7 = new Account(201, 521, "Saving", (double) 7000);
            Account acc8 = new Account(128, 221, "Loan", (double) -21567);

            //Printing Acc DB abbove
            accountDB.add(acc1);
            accountDB.add(acc2);
            accountDB.add(acc3);
            accountDB.add(acc4);
            accountDB.add(acc5);
            accountDB.add(acc6);
            accountDB.add(acc7);
            accountDB.add(acc8);

            //Transaction DB
            Transaction tran1 = new Transaction(01, "(2020-Mar-1)", 123, 627, (long) 207.01);
            Transaction tran2 = new Transaction(03, "(2021-Mar-2)", 124, 126, (long) 876.99);
            Transaction tran3 = new Transaction(03, "(2021-Mar-2)", 125, 183, (long) 432.01);
            Transaction tran4 = new Transaction(04, "(2021-Mar-2)", 183, 125, (long) 34.99);
            Transaction tran5 = new Transaction(04, "(2021-Mar-2)", 126, 124, (long) 100.79);
            Transaction tran6 = new Transaction(05, "(2021-Mar-2)", 627, 123, (long) 101.87);

            //Printing Transactions DB above
            transactionDB.add(tran1);
            transactionDB.add(tran2);
            transactionDB.add(tran3);
            transactionDB.add(tran4);
            transactionDB.add(tran5);
            transactionDB.add(tran6);

            //Members creating and printing - First Name, Last Name, Location, Sort Code, Email, Unique Code
            Members m1 = new Members("Devin", "Charlie", "San Francisco", "1010", "CharlieDevin@Gmail.com", 1);
            Members m2 = new Members("Jim", "Hungary", "Beijing", "1910", "HungaryJim@gmail.com", 2);
            Members m3 = new Members("Wayne", "Bruce", "Gotham City", "1347", "BruceWayne@wayneenterprises.com", 3);
            Members m4 = new Members("Carmody", "John", "Dublin", "7642", "JohnCarmody@live.ie", 4);
            Members m5 = new Members("Finegan", "Peter", "Bettystown", "9807", "PeterFinegan@rockets.com", 5);
            Members m6 = new Members("Curran", "Veronica", "London", "8641", "VCurran@hotmail.com", 6);
            Members m7 = new Members("Doyle", "Kevin", "Toronto", "2806", "KDoyle@live.ie", 7);
            Members m8 = new Members("Sutherland", "Kiefer", "Afghanistan", "1212", "KSnake@MGS.com", 8);

            memberDB.add(m1);
            memberDB.add(m2);
            memberDB.add(m3);
            memberDB.add(m4);
            memberDB.add(m5);
            memberDB.add(m6);
            memberDB.add(m7);
            memberDB.add(m8);

            init = false;
        }
    }

    /**
     * Get
     */
    public static List<Members> getMembersDB() {
        return memberDB;
    }

    public static List<Account> getAccountDB() {
        return accountDB;
    }

    public static List<Transaction> getTransactionDB() {
        return transactionDB;
    }

    /**
     * The Following Methods are for: Adding Accounts, Adding Members, Adding
     * Transactions to DB Delete Customer from DB and Account from DB
     *
     */
    public static boolean addMembers(Members c) {
        System.out.println("Before,Size= " + memberDB.size());
        int before = memberDB.size();

        c.setMemberUniqID(memberDB.size() + 1);
        memberDB.add(c);
        System.out.println("After, Size= " + memberDB.size());
        int after = memberDB.size();

        if (after > before) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean addAccount(Account a) {
        int before = accountDB.size();
        a.setAccNum(before + 1);
        accountDB.add(a);
        int after = memberDB.size();

        if (after > before) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean addTrans(Transaction tr) {
        System.out.println("Before Size= " + transactionDB.size());
        int before = transactionDB.size();
        tr.setTransID(transactionDB.size() + 1);
        transactionDB.add(tr);
        System.out.println("After Size= " + transactionDB.size());
        int after = transactionDB.size();

        if (after > before) {
            return true;
        }

        return false;
    }

    //Update Bank Members details on DB
    public static boolean updateMember(Members t) {
        int index = 0;
        for (Members tempc : memberDB) {
            if (t.getMemberUniqID() == tempc.getMemberUniqID()) {
                memberDB.remove(index);
                memberDB.add(t);
                System.out.println("Size= " + memberDB.size());
                return true;
            }
            index++;
        }
        return false;
    }

    //Delete Bank Members on DB
    public static boolean deleteMember(Members t) {
        int index = 0;
        for (Members tempc : memberDB) {
            if (t.getMemberUniqID() == tempc.getMemberUniqID()) {
                memberDB.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }

    //Deleteing Bank Members Accounts on DB
    public static boolean deleteAccount(Account a) {
        int index = 0;
        for (Account tempa : accountDB) {
            if (a.getAccNum() == tempa.getAccNum()) {
                accountDB.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }

    /**
     * Lodge
     */
    public static boolean lodge(int acc, int amount) {
        int index = 0;
        for (Account tempA : accountDB) {
            if (acc == tempA.getAccNum()) {
                tempA.setBalance(tempA.getBalance() + amount);
                accountDB.set(index, tempA);

                Transaction trans = new Transaction();
                trans.setTransTo(acc);
                trans.setAmount(amount);
                //tempT.setMessage("Lodgement");

                addTrans(trans);
                return true;
            }
            index++;
        }
        return false;
    }

    /**
     * Withdraw
     */
    public static boolean withdraw(int accNum, int amount) {
        int index = 0;
        for (Account tempA : accountDB) {
            if (accNum == tempA.getAccNum()) {
                tempA.setBalance(tempA.getBalance() - amount);
                accountDB.set(index, tempA);

                Transaction trans = new Transaction();
                trans.setTransFrom(accNum);
                trans.setAmount(amount);
                //tempT.setMessage("Withdraw");

                addTrans(trans);
                return true;
            }
            index++;
        }
        return false;
    }

    //Transfer
    public static boolean transfer(int accFrom, int accTo, int amount) {
        withdraw(accFrom, amount);
        lodge(accTo, amount);
        return false;
    }

}
