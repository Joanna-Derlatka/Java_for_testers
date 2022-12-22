package model;

public class Bug {
    private String bugDescription;
    private String bugEmailCreator;
    private int bugPriority;
    private String bugStatus;

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10){
            System.out.println("Bug description is too short! Use at least 10 characters!");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getBugEmailCreator() {
        return bugEmailCreator;
    }

    public void setBugEmailCreator(String bugEmailCreator) {
        if(bugEmailCreator.contains("@")) {
            this.bugEmailCreator = bugEmailCreator;
        } else {
            System.out.println("Incorrect email format!");
        }
    }

    public void setBugPriority(int bugPriority) {
        if(bugPriority >= 1 && bugPriority <= 5) {
            this.bugPriority = bugPriority;
        } else {
            System.out.println("Inserted bug priority not allowed! Allowed bug priority: 1 - 5.");
        }
    }

    public String getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(String bugStatus) {
        this.bugStatus = bugStatus;
    }

    public Bug(String bugDescription, String bugEmailCreator, int bugPriority){
        this.bugDescription = bugDescription;
        this.bugEmailCreator = bugEmailCreator;
        this.bugPriority = bugPriority;
        bugStatus = "open";

    }

    public void showAllBugInfo(){
        System.out.println("model.Bug description: " + bugDescription);
        System.out.println("model.Bug created by: " + bugEmailCreator);
        System.out.println("model.Bug priority: " + bugPriority);
        System.out.println("model.Bug status: " + bugStatus);
    }

    public void showBugCreator(){
        System.out.println("model.Bug created by: " + bugEmailCreator);
    }

    public void showBugStatus(){
        System.out.println("model.Bug status: " + bugStatus);
    }

    public int getBugPriority(){
        return bugPriority;
    }

}
