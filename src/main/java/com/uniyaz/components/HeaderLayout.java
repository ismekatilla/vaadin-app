package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

public class HeaderLayout extends HorizontalLayout {

    public HeaderLayout() {

        setSizeFull();

        String erisilecekDegisken = ((LayoutUI) UI.getCurrent()).getErisilecekDegisken();

        Label label = new Label();
        label.setSizeUndefined();
        label.setValue(erisilecekDegisken);
        addComponent(label);

        setComponentAlignment(label, Alignment.MIDDLE_CENTER);

        //HorizontalLayout footerLayout = ((LayoutUI) UI.getCurrent()).getFooterLayout();

    }
}