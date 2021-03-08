package com.uniyaz.components;

import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class Main extends VerticalLayout {

    public Main() {
        setSizeFull();

        buildLayout();
    }

    private void buildLayout() {

        Header header = new Header();
        addComponent(header);

        Body body = new Body();
        addComponent(body);

        Footer footer = new Footer();
        addComponent(footer);

        setExpandRatio(header, 1f);
        setExpandRatio(body, 8.5f);
        setExpandRatio(footer, 0.5f);
    }
}
