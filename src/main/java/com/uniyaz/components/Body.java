package com.uniyaz.components;

import com.vaadin.ui.HorizontalSplitPanel;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class Body extends HorizontalSplitPanel {

    public Body() {

        setSizeFull();
        setSplitPosition(15f);

        buildLayout();
    }

    private void buildLayout() {

        Content content = new Content();
        setSecondComponent(content);

        SideBar sideBar = new SideBar(content);
        setFirstComponent(sideBar);
    }
}
