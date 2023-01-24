package com.rahatbek.mytest.shablonproekt.structural.proxy;

public class ProxyProject implements Project{
    private String ulr;
    private RealProject realProject;

    public ProxyProject(String ulr) {
        this.ulr = ulr;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(ulr);
        }
        realProject.run();
    }
}
