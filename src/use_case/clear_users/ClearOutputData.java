package use_case.clear_users;

// TODO Complete me

import interface_adapter.clear_users.ClearController;

import java.util.ArrayList;

public class ClearOutputData {

    private final ArrayList<String> cleared_users;

    public ClearOutputData(ArrayList<String> cleared_users) {
        this.cleared_users = cleared_users;
    }

    public ArrayList<String> get_cleared_users() {
        return cleared_users;
    }
}
