package com.rahatbek.mytest.shablonproekt.creational.abstractfactory.banking;

import com.rahatbek.mytest.shablonproekt.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
