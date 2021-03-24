package pages;

import pages.android.*;
import pages.ios.AlertViews;
import pages.ios.MainPage;
import pages.ios.SwitchesPage;

public class AllPage {
    //her class icin private object olustur
    private ApiDemosPage apiDemosPage;
    private DragAndDropPage dragAndDropPage;
    private ExpandableListPage expandableListPage;
    private HomePage homePage;
    private PreferenceFromCodePage preferenceFromCodePage;
    private PreferencePage preferencePage;
    private SpinnerPage spinnerPage;
    private ViewsPage viewsPage;
    private PopupMenuPage popupMenuPage;
    private AlertViews alertViews;
    private MainPage mainPage;
    private SwitchesPage switchesPage;

    //public method olusturarak objectler vasitasiyle elementlere ulas
    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public ApiDemosPage apiDemosPage() {
        if (apiDemosPage == null) {
            apiDemosPage = new ApiDemosPage();
        }
        return apiDemosPage;
    }

    public DragAndDropPage dragAndDropPage() {
        if (dragAndDropPage == null) {
            dragAndDropPage = new DragAndDropPage();
        }
        return dragAndDropPage;
    }

    public ExpandableListPage expandableListPage() {
        if (expandableListPage == null) {
            expandableListPage = new ExpandableListPage();
        }
        return expandableListPage;
    }

    public PopupMenuPage popupMenuPage(){
        if (popupMenuPage == null){
            popupMenuPage = new PopupMenuPage();
        }return popupMenuPage;
    }

    public PreferencePage preferencePage(){
        if (preferencePage== null){
            preferencePage = new PreferencePage();
        }return preferencePage;
    }

    public PreferenceFromCodePage preferenceFromCodePage(){
        if(preferenceFromCodePage == null){
            preferenceFromCodePage = new PreferenceFromCodePage();
        }return preferenceFromCodePage;
    }

    public SpinnerPage spinnerPage(){
        if (spinnerPage == null){
            spinnerPage = new SpinnerPage();
        }return spinnerPage;
    }

    public ViewsPage viewsPage(){
        if (viewsPage == null){
            viewsPage = new ViewsPage();
        }return viewsPage;
    }

    public MainPage mainPage(){
        if (mainPage == null){
            mainPage = new MainPage();
        }return mainPage;
    }

    public AlertViews alertViews(){
        if(alertViews == null){
            alertViews = new AlertViews();
        }return alertViews;
    }

    public SwitchesPage switchesPage(){
        if (switchesPage == null){
            switchesPage = new SwitchesPage();
        }return switchesPage;
    }


}
