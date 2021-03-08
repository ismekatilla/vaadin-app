package com.uniyaz.components;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class Header extends HorizontalLayout {

    public Header() {
        setSizeFull();

        buildLayout();
    }

    private void buildLayout() {

        Label headerLabel = new Label();
        headerLabel.setCaption("HOŞ GELDİNİZ");
        headerLabel.setSizeUndefined();
        addComponent(headerLabel);

        setComponentAlignment(headerLabel, Alignment.MIDDLE_CENTER);
    }
}
