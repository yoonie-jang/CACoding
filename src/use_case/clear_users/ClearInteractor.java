package use_case.clear_users;

// TODO Complete me

import interface_adapter.clear_users.ClearPresenter;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface clearDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject, ClearOutputBoundary clearPresenter) {
        this.clearDataAccessObject = clearDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    public void execute() {
        ArrayList<String> cleared_users = clearDataAccessObject.clear_users();
        ClearOutputData clearOutputData = new ClearOutputData(cleared_users);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
