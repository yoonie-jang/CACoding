package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import interface_adapter.logged_in.LoggedInState;
import interface_adapter.logged_in.LoggedInViewModel;
import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupState;
import use_case.clear_users.ClearOutputData;
import use_case.login.LoginOutputBoundary;
import use_case.login.LoginOutputData;
import use_case.signup.SignupOutputBoundary;
import use_case.signup.SignupOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClearPresenter implements ClearOutputBoundary {

    private final SignupViewModel signupViewModel;

    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;


    public ClearPresenter(ViewManagerModel viewManagerModel,
                           SignupViewModel signupViewModel,
                          ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.signupViewModel = signupViewModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response) {
        ClearState clearState = clearViewModel.getState();
        StringBuilder clearedString = new StringBuilder();
        for (String name : response.get_cleared_users()) {
            clearedString.append(name);
            clearedString.append("\n");
        }
        clearState.setCleared(clearedString.toString());
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();
    }
}
