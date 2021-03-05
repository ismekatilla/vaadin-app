package com.uniyaz.ui;

import com.uniyaz.components.HeaderLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/*
*
* @author Atilla Gökhan KARTAL
* @since
*
*/
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class LayoutUI extends UI {

    private VerticalLayout mainLayout;
    private HeaderLayout headerLayout;
    private HorizontalLayout bodyLayout;
    private VerticalLayout sideBarLayout;
    private VerticalLayout contentLayout;
    private HorizontalLayout footerLayout;
    private String erisilecekDegisken = "TEST";

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        buildMainLayout();
        setContent(mainLayout);
    }

    private void buildMainLayout() {

        mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();

        headerLayout = new HeaderLayout();
        mainLayout.addComponent(headerLayout);
        
        buildBodyLayout();
        mainLayout.addComponent(bodyLayout);
        
        buildFooterLayout();
        mainLayout.addComponent(footerLayout);
    }

    private void buildContentLayout() {
        contentLayout = new VerticalLayout();
        contentLayout.setSizeFull();

        Label content = new Label("CONTENT");
        contentLayout.addComponent(content);
    }

    private void buildSideBarLayout() {
        
        sideBarLayout = new VerticalLayout();
        sideBarLayout.setSizeFull();
        
        Label sidebar = new Label("SIDEBAR");
        sideBarLayout.addComponent(sidebar);
    }

    private void buildBodyLayout() {

        bodyLayout = new HorizontalLayout();
        bodyLayout.setSizeFull();

        buildSideBarLayout();
        bodyLayout.addComponent(sideBarLayout);

        buildContentLayout();
        bodyLayout.addComponent(contentLayout);
    }

    private void buildFooterLayout() {
        footerLayout = new HorizontalLayout();
        footerLayout.setSizeFull();

        Label label = new Label();
        label.setValue("FOOTER");
        footerLayout.addComponent(label);

        footerLayout.setComponentAlignment(label, Alignment.MIDDLE_CENTER);
    }

    public String getErisilecekDegisken() {
        return erisilecekDegisken;
    }

    public HorizontalLayout getFooterLayout() {
        return footerLayout;
    }
}