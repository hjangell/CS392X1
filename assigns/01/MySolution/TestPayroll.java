
public class TestPayroll {
    /* your code */
    public static void main(String[] args) {
        // initialize testing payroll
        Payroll testing = new Payroll(); 

        // add people to payroll
        Employee john = new Employee();
        john.name = "john";
        john.ID = 10;
        john.salary = 10.0;
        testing.add_employee(john);

        // check Size
        System.out.println(testing.size());

        // print payroll
        testing.print();

        // add employee to payroll
        Employee jim = new Employee();
        jim.name = "jim";
        jim.ID = 11;
        jim.salary = 11.0;
        testing.add_employee(jim);

        // remove employee from payroll
        try {
            testing.remove_employee(0);
        } catch( EmployeeIndexException ex){
            System.out.println("Employee Index Exception");
        }
        

        // find employee in payroll
        try {
            System.out.println("Index of jim: " + testing.find_employee("jim"));
        } catch( EmployeeNotFoundException ex){
            System.out.println("Employee Not Found Exception");
        }
        

        // create second payroll
        Payroll testing_two = new Payroll();
        Employee jane = new Employee();
        jane.name = "jane";
        jane.ID = 12;
        jane.salary = 12.0;
        testing_two.add_employee(jane);

        // add payroll together
        testing.add_payroll(testing_two);

        // print payroll
        testing.print();
        System.out.println(testing.size());

        // copy payroll
        testing.copy_payroll(testing_two);
        System.out.println(testing.size());

        // print payroll
        testing.print();



    }
}
