package com.uniyaz.components;

import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by AKARTAL on 5.3.2021.
 */
public class CaglarButton extends Button {

    public CaglarButton() {

        this.setCaption("ÇAĞLAR");
        this.addStyleName(ValoTheme.BUTTON_LINK);
    }
}
