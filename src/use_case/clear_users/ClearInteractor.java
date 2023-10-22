package use_case.clear_users;

// TODO Completed I think
// IDK

import interface_adapter.clear_users.ClearPresenter;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface dataAccessObject;
    final ClearPresenter clearPresenter;

    // Constructor for DAO
    public ClearInteractor(ClearUserDataAccessInterface dataAccessObject, ClearPresenter clearPresenter) {
        this.dataAccessObject = dataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {
        if (dataAccessObject.isEmpty()){
            clearPresenter.prepareFailView("No one to clear lol");
        } else {
            ClearOutputData clearOutputData = new ClearOutputData(dataAccessObject.getAllUsernames(), false);
            dataAccessObject.clearAllUsers();
            clearPresenter.prepareSuccessView(clearOutputData);
        }
    }
}


