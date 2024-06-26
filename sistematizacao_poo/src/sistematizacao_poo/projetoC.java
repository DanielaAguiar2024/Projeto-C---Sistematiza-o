package sistematizacao_poo;

import java.util.*;

public class projetoC {

    public static class Employee {
        private String employeeId;
        private String name;
        private String email;
        private List<String> allergies;
        private List<String> medicalIssues;

        public Employee(String employeeId, String name, String email, List<String> allergies, List<String> medicalIssues) {
            this.employeeId = employeeId;
            this.name = name;
            this.email = email;
            this.allergies = new ArrayList<>(allergies);
            this.medicalIssues = new ArrayList<>(medicalIssues);
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public List<String> getAllergies() {
            return new ArrayList<>(allergies);
        }

        public List<String> getMedicalIssues() {
            return new ArrayList<>(medicalIssues);
        }

        // Outros métodos getter e setter podem ser adicionados conforme necessário
    }

    public static class EmployeeManagementSystem {
        private Map<String, Employee> employees;

        public EmployeeManagementSystem() {
            this.employees = new HashMap<>();
        }

        public void addEmployee(Employee employee) {
            employees.put(employee.getEmployeeId(), employee);
        }

        public Employee getEmployee(String employeeId) {
            return employees.get(employeeId);
        }

        // Outros métodos para gerenciar funcionários podem ser adicionados

        public static void main(String[] args) {
            EmployeeManagementSystem system = new EmployeeManagementSystem();

            // Exemplo de adição de um funcionário
            Employee employee1 = new Employee("001", "Daniela Aguiar", "daniela.aguiar@sempreceub.com", Arrays.asList("Doce"), Arrays.asList("Saudável"));
            system.addEmployee(employee1);

            // Exemplo de contratação de funcionário
            Employee retrievedEmployee = system.getEmployee("001");
            System.out.println(retrievedEmployee.getName());
        }
    }
}
