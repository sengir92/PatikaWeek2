
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Kemal", 2000.0, 45, 1985);


        //call the tax method to use
        e1.tax();

        //call the bonus method to use
        e1.bonus();

        //call the raiseSalary method to use
        e1.raiseSalary();

        //call the toString method to use
        System.out.println(e1.toString());


    }
}