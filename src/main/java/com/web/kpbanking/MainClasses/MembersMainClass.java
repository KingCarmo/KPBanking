/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.kpbanking.MainClasses;

import com.web.kpbanking.GetsSets.Members;
import com.web.kpbanking.services.AccountService;
import com.web.kpbanking.services.MembersService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author King Carmo
 */
@Path("/member")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MembersMainClass{
    
    MembersService cusser = new MembersService();
    AccountService accser = new AccountService();
    
    //Gather Bank Members by ID
    //Example api/member/1
    //**Working**//
    @GET
    @Path("/{id}")
    public Members getCustomerByID(@PathParam("id") int uid){
        System.out.println("Success: Got customer by ID");
        return cusser.getMembersByUID(uid);
    }
    
    //Creating Bank Members Accounts
    //Example api/member/save
    //
    @POST
    @Path("/save")
    @Produces(MediaType.APPLICATION_JSON)
    public void createMembers(Members mem){
        if(cusser.addMember(mem) && accser.addAccountByMembers(mem)){
            System.out.println("The Members and the new accounts have been setup");
        }
        else{
            System.out.println("Unfortunatly the the Members account has not been created");
        }
    }
}
