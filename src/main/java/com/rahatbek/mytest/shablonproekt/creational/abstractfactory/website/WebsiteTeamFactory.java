package com.rahatbek.mytest.shablonproekt.creational.abstractfactory.website;

import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.Developer;
import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.ProjectManager;
import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.ProjectTeamFactory;
import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
