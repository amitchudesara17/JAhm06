public class Employee {

    private String name;
    private String email;

    
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    
    public String getEmail() {
        return email;
    }

    
    public String getDetails() {
        return "Name: " + name + ", Email: " + email;
    }

    
    public String toString() {
        return "Employee{name='" + name + "', email='" + email + "'}";
    }

    
    public static void main(String args[]) {
        
        Employee emp = new Employee("Amit", "abc123@gmail.com");
        
        
        System.out.println(emp.getDetails());

        
        System.out.println(emp);
    }
}
