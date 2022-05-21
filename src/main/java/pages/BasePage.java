package pages;

import WebActions.UIActions;

public class BasePage {
    UIActions actions;

    public BasePage( String ClassName){

        actions = new UIActions(ClassName);

    }
}
