package com.nanyou.firstday.Zuoye;

public class StudentLeader extends Student {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void meeting(){
        System.out.println("开会");
    }
}
