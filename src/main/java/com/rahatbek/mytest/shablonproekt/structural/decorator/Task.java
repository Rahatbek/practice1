package com.rahatbek.mytest.shablonproekt.structural.decorator;

import com.rahatbek.mytest.shablonproekt.structural.decorator.Developer;
import com.rahatbek.mytest.shablonproekt.structural.decorator.JavaDeveloper;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
