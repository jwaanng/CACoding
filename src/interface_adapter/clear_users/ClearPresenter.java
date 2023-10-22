package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputData;

public class ClearPresenter {

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearError(error);
        clearViewModel.firePropertyChanged();
    }

    public void prepareSuccessView(ClearOutputData usernames) {
        // popup of deleted things
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernames(usernames.getClearedUsers());
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
    }
}
