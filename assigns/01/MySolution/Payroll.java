
public class Payroll {
    public static final int INITIAL_MAXIMUM_SIZE = 1024;

    public Payroll() {
	/* your code */
        maximum_size = INITIAL_MAXIMUM_SIZE;
        current_size = 0;
        people = new Employee[maximum_size];
    }

    public int size(){
        // return current_size
        return current_size;
    }

    public void print(){
        // print the Employees currently on the Payroll, one per line
        for(int i = 0; i < current_size; i++){
            System.out.println(people[i].name);
        }
    }
    
    public void add_employee(Employee newbie) {
	/* your code */

        // If Payroll is full, size will be doubled
        if(current_size >= maximum_size){
            maximum_size *= 2;

            Employee[] temp_people = new Employee[maximum_size];
            for(int i = 0; i < current_size; i++) temp_people[i] = people[i];
            people = temp_people;
        }

        // Adding Employee on end of payroll
        people[current_size] = newbie;
        current_size++;


    }

    public void remove_employee(int i) throws EmployeeIndexException {
	/* your code */
        // Checking for no entry at position i
        if(i >= current_size){
            throw new EmployeeIndexException();
        } 

        // Replaces employee in people[i] with last employee
        people[i] = people[current_size - 1];
        current_size--;

    }
    
    public int find_employee(String name) throws EmployeeNotFoundException {
	/* your code */
        for(int i = 0; i < current_size; i++){
            if(people[i].name == name) return i;
        }

        // If not found
        throw new EmployeeNotFoundException();

    }

    public void copy_payroll(Payroll source) {
	/* your code */
        current_size = 0;
        while(current_size < source.size()) add_employee(source.people[current_size]);
        
    }

    public void add_payroll(Payroll source) {
	/* your code */
        for(int i = 0; i < source.size(); i++){
            add_employee(source.people[i]);
        }
    
    }



    private Employee people[];
    private int maximum_size;
    private int current_size;
}
