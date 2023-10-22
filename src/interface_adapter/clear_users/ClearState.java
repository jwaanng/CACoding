package interface_adapter.clear_users;

// TODO Complete me done i think???? idk dawg

import interface_adapter.login.LoginState;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClearState {
    private String clearError = null;
    private ArrayList<String> usernames;

    public ClearState(ClearState copy){
        clearError = copy.clearError;
    }

    public ClearState(){}

    public String setClearError(String clearError) {
        return clearError;
    }

    public void setUsernames (ArrayList<String> usernames){
        this.usernames = usernames;
    }

    public ArrayList<String> getUsernames() {
        return usernames;
    }
}
