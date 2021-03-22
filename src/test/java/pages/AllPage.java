package pages;

import pages.android.*;

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

    public ExpandableListPage getExpandableListPage() {
        if (expandableListPage == null) {
            expandableListPage = new ExpandableListPage();
        }
        return expandableListPage;
    }

}
