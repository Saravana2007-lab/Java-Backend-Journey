public class Employee_Salary_Calculator {
    public int salary(int basicSalary){
        return basicSalary;
    }
    public int salary(int basicSalary, int bonus){
        return basicSalary+bonus;
    }
    public int salary(int basicSalary, int bonus, int overtimePay){
        return basicSalary+bonus+overtimePay;
    }
    public static void main(String[] args){
        Employee_Salary_Calculator calc = new Employee_Salary_Calculator();
        
        int result1 = calc.salary(5000);
        int result2 = calc.salary(5000, 1000);
        int result3 = calc.salary(5000, 1000, 500);
        
        System.out.println("Basic Salary: " + result1);
        System.out.println("Basic + Bonus: " + result2);
        System.out.println("Basic + Bonus + Overtime: " + result3);
    }
}
