abstract class employee {

    private String name;
    private int id;

    public employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double monthlysalary();

}

class fulltime extends employee {

    private double salary;

    public fulltime(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double monthlysalary() {
        return salary;
    }
}

class parttime extends employee {

    private double hour;
    private int rate;

    public parttime(String name, int id, double hour, int rate) {
        super(name, id);
        this.hour = hour;
        this.rate = rate;
    }

    @Override
    public double monthlysalary() {
        return hour * rate;
    }
}

class intern extends employee {

    private double stipend;

    public intern(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    public double monthlysalary() {
        return stipend;
    }
}

public class Payroll {

    public static void main(String[] args) {

        employee e1 = new fulltime("Disha", 101, 50000);
        employee e2 = new parttime("Anshika", 102, 80, 200);
        employee e3 = new intern("Shruti", 103, 15000);

        System.out.println("Monthly Salary of " + e1.getName() + " (ID: " + e1.getId() + ") is: " + e1.monthlysalary());
        System.out.println("Monthly Salary of " + e2.getName() + " (ID: " + e2.getId() + ") is: " + e2.monthlysalary());
        System.out.println("Monthly Salary of " + e3.getName() + " (ID: " + e3.getId() + ") is: " + e3.monthlysalary());

        double totalSalary = e1.monthlysalary() + e2.monthlysalary() + e3.monthlysalary();
        System.out.println("Total Salary: " + totalSalary);

        if (e1 instanceof intern) {
            System.out.println(e1.getName() + " is an intern");
        } else if (e2 instanceof intern) {
            System.out.println(e2.getName() + " is a intern ");
        } else if (e3 instanceof intern) {
            System.out.println(e3.getName() + " is a intern");
        }
    }
}
