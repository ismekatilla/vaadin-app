package com.uniyaz.components;

import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class VaLinkButton extends Button {

    public VaLinkButton() {
        addStyleName(ValoTheme.BUTTON_LINK);
        addStyleName(ValoTheme.LINK_LARGE);
    }

    public VaLinkButton(String caption) {
        this();
        setCaption(caption);
    }
}