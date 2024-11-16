package com.hspedu.poly_.polyparameter_;

public class PloyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnal(tom);
        ployParameter.showEmpAnnal(milan);

        ployParameter.testWork(tom);
        ployParameter.testWork(milan);
    }

    //showEmpAnnal(Employee e)
    public void showEmpAnnal(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if(e instanceof Worker) {
            ((Worker) e).work();    //向下转型的操作
        } else if(e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理...");
        }
    }
}
