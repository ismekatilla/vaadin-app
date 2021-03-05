package com.uniyaz.servlet;

import com.uniyaz.ui.LayoutUI;
import com.uniyaz.ui.MyUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = LayoutUI.class, productionMode = false)
public class MyUIServlet extends VaadinServlet {
}