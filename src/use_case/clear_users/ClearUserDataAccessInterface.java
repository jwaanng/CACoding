package use_case.clear_users;


// TODO DONE I THINK - also made modification to file data access to add clear all users method

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    void clearAllUsers();
    boolean isEmpty();
    ArrayList<String> getAllUsernames();
}
