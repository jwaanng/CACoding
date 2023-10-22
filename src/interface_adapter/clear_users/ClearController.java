package interface_adapter.clear_users;

// TODO Completed and i tihnk its rgith

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    private final ClearInputBoundary clearInteractor;

    public ClearController(ClearInputBoundary clearInteractor) {
        this.clearInteractor = clearInteractor;
    }

    public void execute() {
        clearInteractor.execute();
    }
}
