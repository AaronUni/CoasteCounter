package com.example.coastecounter.dashboard;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import com.example.coastecounter.R;
import com.example.coastecounter.main.Controller;
import com.example.coastecounter.main.Model;

public class DashboardController implements Controller {
    DashboardModel model;
    DashboardView view;

    public DashboardController(Model m, View v) {
            model = m;
            view = v;
    }
}
