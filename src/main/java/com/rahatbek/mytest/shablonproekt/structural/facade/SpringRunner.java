package com.rahatbek.mytest.shablonproekt.structural.facade;

public class SpringRunner {
    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
//
//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);

        Workflow workflow = new Workflow();
        workflow.solveProblems();
    }
}
