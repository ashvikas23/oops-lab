import java.util.*;

class employee {
    int eNo;
    String eName;
    double eSalary;

    employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
}

class emp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter n (Number of Employees):");
        int n = sc.nextInt();
        employee[] emps = new employee[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println(" Enter eNo (Employee Number):");
            int eNo = sc.nextInt();
            sc.nextLine(); 
            System.out.println(" Enter eName (Employee Name):");
            String eName = sc.nextLine();
            System.out.println(" Enter eSalary (Monthly Salary):");
            double eSalary = sc.nextDouble();
            emps[i] = new employee(eNo, eName, eSalary);
        }

        System.out.println(" Enter a Search value (eNo to find):"); 
        int s = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (emps[i].eNo == s) {
                System.out.println("Match Found -> Employee Number: " + emps[i].eNo + ", Employee Name: " + emps[i].eName + ", Employee Salary: " + emps[i].eSalary);
            }
        }
    }
}
