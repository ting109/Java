package com.nanyou.firstday.Zuoye;

public class Worker extends Person {
    private String unite;
    private int workAge;

    public void setUnite(String unite){
        this.unite = unite;
    }
    public String getUnite(){
        return unite;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String work(){
        return null;
    }
}
