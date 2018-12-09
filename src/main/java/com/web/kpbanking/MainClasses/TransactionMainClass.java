/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.kpbanking.MainClasses;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.web.kpbanking.services.TransactionService;
import com.web.kpbanking.GetsSets.Transaction;

/**
 *
 * @author Kevin Carmody
 */
@Path("/transaction")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TransactionMainClass {

    TransactionService tran = new TransactionService();

    // Get all Transactions
    // Example /api/transaction
    @GET
    public List<Transaction> getTransactions() {
        System.out.println("Success: Got all transactions");
        return tran.getAllTransactions();
    }

    // Gathering Transactions by Account Number
    // Example: /api/transaction/account/{accNum}
    @GET
    @Path("/account/{accNum}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transaction> getTransactionByAcc(@PathParam("accNum") int accNum) {
        System.out.println("We have recieved the transaction from your ID Number");
        return tran.getTransactionsByAcc(accNum);
    }

    //Creating a Trans
    //Example: /api/transaction/save
    //WARNING: Using Postman, when "Posting"/Saving your new transaction, it does not
    //appear until you GET all transaction or get it by ID
    @POST
    @Path("/save")
    @Produces(MediaType.APPLICATION_JSON)
    public void saveTrans(Transaction st) {
        if (tran.addTrans(st)) {
            System.out.println("Your transactions have been updated");
        } else {
            System.out.println("Your transactions have not been updated");
        }
    }
}
