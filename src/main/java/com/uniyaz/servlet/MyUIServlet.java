package com.uniyaz.servlet;

import com.uniyaz.ui.FirstUi;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = FirstUi.class, productionMode = false)
public class MyUIServlet extends VaadinServlet {
}