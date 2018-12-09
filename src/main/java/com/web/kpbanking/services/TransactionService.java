/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.kpbanking.services;

import com.web.kpbanking.database.Database;
import com.web.kpbanking.GetsSets.Transaction;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author King Carmo
 */
public class TransactionService {

    /* creating database object - same concept from AccountsService and MembersService  */
    Database data = new Database();

    //create the contructor for the TransactionService
    public TransactionService() {
    }

    /* Get ALL transactions in system
    * Calls the database.java file for all transactions                            
     */
    public List<Transaction> getAllTransactions() {
        return data.getTransactionDB();
    }

    //Gets trans by ID number
    public ArrayList<Transaction> getTransactionsByAcc(int accNum) {
        ArrayList<Transaction> trans = new ArrayList<>();

        for (Transaction tran : data.getTransactionDB()) {
            if ((tran.getTransFrom() == (accNum)) || (tran.getTransTo() == (accNum))) {
                trans.add(tran);
            }
        }
        return trans;
    }

    //Create Transaction for DB
    public boolean addTrans(Transaction accser) {

        return data.addTrans(accser);
    }

}
