package com.uniyaz.ui;

import javax.servlet.annotation.WebServlet;

import com.uniyaz.components.CaglarButton;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class MyUI extends UI {

    private CaglarButton caglarButton;
    private VerticalLayout verticalLayout;
    private HorizontalLayout horizontalLayout;
    private TextField textField;
    private Button button;
    private HorizontalLayout sampleHorizontalLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        verticalLayout = new VerticalLayout();
        verticalLayout.setSizeFull();

        buildHorizontalLayout();
        verticalLayout.addComponent(horizontalLayout);

        textField = new TextField();
        textField.setCaption("İsim");
        verticalLayout.addComponent(textField);

        bıildButton();
        verticalLayout.addComponent(button);

        buildSampleHorizontalLayout();
        verticalLayout.addComponent(sampleHorizontalLayout);

        buildCaglarButton();
        verticalLayout.addComponent(caglarButton);

        verticalLayout.setExpandRatio(horizontalLayout, 1f);
        verticalLayout.setExpandRatio(textField, 3f);
        verticalLayout.setExpandRatio(button, 2f);
        verticalLayout.setExpandRatio(sampleHorizontalLayout, 4f);

        setContent(verticalLayout);
    }

    private void buildHorizontalLayout() {
        horizontalLayout = new HorizontalLayout();
        horizontalLayout.setSizeFull();
        horizontalLayout.addComponent(new Label("LABEL1"));
        horizontalLayout.addComponent(new Label("LABEL2"));
    }

    private void bıildButton() {
        button = new Button();
        button.setCaption("Beni Tıkla");
        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                Notification.show("Bağcılarlı Merhaba");
            }
        });
    }

    private void buildSampleHorizontalLayout() {
        sampleHorizontalLayout = new HorizontalLayout();
        sampleHorizontalLayout.addStyleName("outlined");
        sampleHorizontalLayout.setSpacing(false);
        sampleHorizontalLayout.setMargin(false);
        sampleHorizontalLayout.setSizeFull();

        for (int i = 0; i < 3; i++) {
            ComboBox comboBox = new ComboBox();
            sampleHorizontalLayout.addComponent(comboBox);
        }
    }

    private void buildCaglarButton() {
        caglarButton = new CaglarButton();
        caglarButton.setCaption("ASDF");
        caglarButton.addClickListener(new CaglarButton.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                caglarButton.setCaption("ERKUT");
            }
        });
    }
}
