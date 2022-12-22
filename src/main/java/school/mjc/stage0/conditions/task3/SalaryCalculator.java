package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void main(String[] args) {
       calculateSalary(5000);
    }
    public static void calculateSalary(int salary) {
        if(salary>0 && salary<=10000){
            System.out.println(salary-(double)(salary/100)*15);
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println(salary-(double)(salary/100*18));
        } else if (salary>20000) {
            System.out.println(salary-(double)(salary / 100 * 20));
        } else {
            System.out.println("wrong input!");
        }
    }
}
