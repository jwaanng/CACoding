package use_case.clear_users;

// TODO DONE I THINK, only has info for time deleted

import java.util.ArrayList;

public class ClearOutputData {
    private ArrayList<String> usernames = new ArrayList<>();
    private boolean useCaseFailed;

    public ClearOutputData(ArrayList<String> clearedUsers, boolean useCaseFailed){
        this.usernames = clearedUsers;
        this.useCaseFailed = useCaseFailed;
    }

    public ArrayList<String> getClearedUsers(){
        return usernames;
    }
}
