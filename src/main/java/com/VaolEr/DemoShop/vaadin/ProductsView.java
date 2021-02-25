package com.VaolEr.DemoShop.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("api/vaadin")
public class ProductsView extends Div {
    public ProductsView() {
        setText("Hello @Route!");
        // Create an HTML element
        Div layout = new Div();

        // Use TextField for standard text input
        TextField textField = new TextField("Your name");

        // Button click listeners can be defined as lambda expressions
        Button button = new Button("Say hello",
                e -> Notification.show("Hello!"));

        // Add the web components to the HTML element
        layout.add(textField, button);
        add(layout);
    }
}
