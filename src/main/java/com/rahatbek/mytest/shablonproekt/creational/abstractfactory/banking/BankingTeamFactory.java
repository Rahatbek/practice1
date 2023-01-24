package com.rahatbek.mytest.shablonproekt.creational.abstractfactory.banking;

import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.Developer;
import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.ProjectManager;
import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.ProjectTeamFactory;
import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
