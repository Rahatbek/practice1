package com.rahatbek.mytest.shablonproekt.creational.abstractfactory.website;

import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
