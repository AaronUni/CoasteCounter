package com.example.coastecounter.dashboard;

import com.example.coastecounter.main.Controller;

public class DashboardController implements Controller {

    private DashboardView view;
    private DashboardModel model;

    public DashboardController() {
        view = new DashboardView();
        model = new DashboardModel();
    }
}
