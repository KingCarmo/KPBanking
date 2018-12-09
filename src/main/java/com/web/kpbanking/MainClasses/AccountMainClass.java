/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.kpbanking.MainClasses;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.web.kpbanking.GetsSets.Account;
import com.web.kpbanking.services.AccountService;
import javax.ws.rs.Consumes;
import static org.eclipse.persistence.expressions.ExpressionOperator.as;

/**
 *
 * @author Kevin Carmody
 */
@Path("/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountMainClass {

    //Account service
    AccountService accser = new AccountService();

    //Create Account Example: api/account/create
    @POST
    @Path("/create")
    public void createAccount(Account adda) {
        if (accser.addAccount(adda)) {
            System.out.println("Success: Account created!");
        } else {
            System.out.println("FAIL: Account not created!");
        }
    }

//     Get Account by UID 
//     Example: /api/account/uid/1
//     **Working but no results appearing**
    @GET
    @Path("/uid/{uid}")
    public Account getAccountByUID(@PathParam("uid") int uid) {
        System.out.println("Gathered Accounts");
        return accser.getAccountByUID(uid);
    }

    /**
     * Gathering Account Bal    *
     * Example: api/account/balance/201
     */
    @GET
    @Path("/balance/{accNum}")
    public double getAccountBalance(@PathParam("accNum") int accNum) {
        double bal = accser.getAccBal(accNum);
        System.out.println("This account Balance for " + accNum + " is = " + bal);
        return bal;
    }

}
