package io.turntabl.springgettingstarted;

public class HumanBean {
    public String fname;
    public String lname;
    public FriendBean friendBean;

    public HumanBean(){}

    public String getFName(){return this.fname;}

    public void setFName(String fname){this.fname = fname;}

    public String getLName(){return this.lname;}

    public void setLName(String lname){this.lname = lname;}

    public void setFriendBean(FriendBean friendBean){
        this.friendBean =friendBean;
    }

}
