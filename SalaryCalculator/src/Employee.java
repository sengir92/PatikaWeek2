// create new Class
public class Employee {

    //define class attribute
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double salaryIncrease;



    //create constructor method

    Employee(String name, double salary, int workHours, int hireYear) {
        //assign attribute to method variables
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    //create tax method for tax calculation
    public double tax() {
        if(salary > 1000.0) {
           this.tax= salary * 0.03;
        }
        return this.tax;
    }
    //create bonus method for bonus calculation
    public double bonus() {
        if(workHours > 40) {
            this.bonus = (workHours - 40.0) * 30.0;
        }
        return this.bonus;
    }
    //create raiseSalary method for salary increase
    public double raiseSalary() {
        int workYear = 2021-hireYear;
        if (workYear < 10) {
             this.salaryIncrease = salary * 0.05;

        } else if (workYear > 9 && workYear < 20) {
            this.salaryIncrease = salary *0.1;

        } else if (workYear > 19) {
            this.salaryIncrease = salary * 0.15;

        }
        return this.salaryIncrease;

    }
    //create toString method for show all information of employees
    @Override
    public String toString() {
      return ("Name: " + name+"\n") +
              ("Salary: " + salary + "\n")+
              ("Work Hour: " + workHours + "\n") +
              ("Hire Year: " + hireYear + "\n") +
              ("Tax: " + tax + "\n")+
              ("Bonus: " + bonus + "\n")+
              ("Salary Increase: " + salaryIncrease +"\n")+
              ("Salary with tax and bonuses: " + (salary-tax+bonus) + "\n") +
              ("Total salary: " + (salary - tax + bonus + salaryIncrease));

    }

}
