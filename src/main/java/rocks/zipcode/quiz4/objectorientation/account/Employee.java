package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee extends Account implements Worker , Transactable {
    Double expectedHourlyWage;
    Double expectedHoursWorked;
    Double expectedBalance;
    Double expectedBankAccountBalance;
    BankAccount employeeAccount ;


    public Employee() {
        this.expectedHourlyWage = 35.0;
        this.expectedHoursWorked = 0.0;
        this.expectedBalance = 0.0;
        this.expectedBankAccountBalance =0.0;
    }

    public Employee(Double expectedHourlyWage, Double expectedHoursWorked, Double expectedBalance, Double expectedBankAccountBalance) {
        this.expectedHourlyWage = expectedHourlyWage;
        this.expectedHoursWorked = expectedHoursWorked;
        this.expectedBalance = expectedBalance;
        this.expectedBankAccountBalance = expectedBankAccountBalance;
    }

    public Employee(BankAccount bankAccount) {

    }

    public BankAccount getBankAccount() {
        return employeeAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {

        this.employeeAccount = bankAccount;

    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        expectedBankAccountBalance += amountToIncreaseBy;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        expectedBankAccountBalance -= amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return expectedBankAccountBalance;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.expectedHoursWorked += numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return expectedHoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return expectedHourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return expectedHoursWorked * expectedHourlyWage;
    }
}
