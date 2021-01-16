package com.example.coastecounter.dashboard;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.main.Controller;
import com.example.coastecounter.main.Model;

public class DashboardController implements Controller {

    private DashboardView view;
    private DashboardModel model;

    public DashboardController() {
        view = new DashboardView();
        model = new DashboardModel();
    }
}
