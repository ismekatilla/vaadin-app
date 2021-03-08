package com.uniyaz.ui;

import com.uniyaz.components.Main;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by AKARTAL on 8.3.2021.
 */
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class FirstUi extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Main main = new Main();
        setContent(main);
    }
}
