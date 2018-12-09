package com.web.kpbanking.services;

import com.web.kpbanking.GetsSets.Members;
import java.util.List;
import com.web.kpbanking.database.Database;

/**
 *
 * @author Kevin Carmody && Peter Finegan 
 * w/ help of my cousin who helped me write the code for the service part
 *
 */
public class MembersService {

    /* creating database object - same concept from AccountsService  */
    Database data = new Database();

    //constructor created
    public MembersService() {

    }

    // creates a members object and Gathers 
    //all Members By There UniqID given to them from the database
    public Members getMembersByUID(int uid) {
        Members mid = new Members();
        for (Members c : data.getMembersDB()) {
            if (c.getMemberUniqID() == uid) {
                mid = c;
            }
        }
        return mid;
    }

    //Gather information from the Database.java file and
    //Create Members to the database
    public boolean addMember(Members c) {
        data.addMembers(c);
        return true;
    }

    // Delete Members from the DB
    public boolean deleteMember(Members c) {
        //Gather information from the Database.java file and
        //Delete Members and account with UID
        return data.deleteMember(c);
    }
    
    //Couldn't get code for Updating Members working, only create and delete :( 
}
