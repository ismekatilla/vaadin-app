package com.uniyaz.components;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class Content extends VerticalLayout {

    public Content() {
        setSizeFull();
    }

    @Override
    public void addComponent(Component component) {
        removeAllComponents();
        super.addComponent(component);
        setComponentAlignment(component, Alignment.MIDDLE_CENTER);
    }
}
