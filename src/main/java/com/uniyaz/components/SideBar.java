package com.uniyaz.components;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class SideBar extends VerticalLayout {

    private Content content;
    private VaLinkButton hakkimizdaButton;
    private VaLinkButton iletisimButton;
    
    public SideBar(Content content) {
        this.content = content;
        buildLayout();
    }

    private void buildLayout() {
        
        buildHakkimizdaButton();
        addComponent(hakkimizdaButton);

        buildiletisimButton();
        addComponent(iletisimButton);
    }

    private void buildHakkimizdaButton() {
        hakkimizdaButton = new VaLinkButton();
        hakkimizdaButton.setCaption("Hakkımızda");
        hakkimizdaButton.addClickListener(new MenuButtonClickListener());
    }

    private void buildiletisimButton() {
        iletisimButton = new VaLinkButton("İlteişim");
        iletisimButton.addClickListener(new MenuButtonClickListener());
    }

    private class MenuButtonClickListener implements Button.ClickListener {

        @Override
        public void buttonClick(Button.ClickEvent clickEvent) {
            Label contentLabel = new Label();
            contentLabel.setCaption(clickEvent.getButton().getCaption());
            contentLabel.setSizeUndefined();
            content.addComponent(contentLabel);
        }
    }
}
