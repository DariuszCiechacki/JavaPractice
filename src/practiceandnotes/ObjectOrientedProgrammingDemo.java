package practiceandnotes;

/**
 * ================= OOP PILLARS EXAMPLE =================
 * 6 pillars of OOP:
 * 1. Class & Object
 * - Class: A blueprint for creating objects.
 * - Object: An instance of a class, holding data (fields) and behavior (methods).
 * 2. Encapsulation
 * - Wrapping fields and methods together in a class.
 * - Hiding fields using private and expose access through getters/setters.
 * 3. Inheritance
 * - A class can inherit fields/methods from another class using extends.
 * 4. Polymorphism (overloading + overriding)
 * - Compile-time (method overloading): Same method name, different parameters.
 * - Runtime (method overriding): Child class provides its own implementation of parent’s method.
 * 5. Abstraction (abstract class)
 * - Hiding details, showing only the essential.
 * - Achieved with abstract classes or interfaces.
 * 6. Casting (upcasting & downcasting)
 * - Converting one type into another.
 * - Example: Upcasting (child → parent), Downcasting (parent → child).
 */

// ===== 1 & 2. CLASS, OBJECT, ENCAPSULATION =====
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Overloaded deposit method (Polymorphism - compile-time)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void deposit(double amount, String currency) {
        System.out.println("Depositing " + amount + " " + currency);
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to be overridden (Polymorphism - runtime)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

// ===== 3. INHERITANCE =====
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // ===== 4. POLYMORPHISM (OVERRIDING) =====
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are limited for Savings Account.");
        super.withdraw(amount);
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            System.out.println("Withdrawal with overdraft allowed.");
            // trick: we can't directly modify balance, so withdraw normally
            super.withdraw(Math.min(amount, getBalance()));
            if (amount > getBalance()) {
                System.out.println("Overdraft used!");
            }
        }
    }
}

// ===== 5. ABSTRACTION =====
abstract class Transaction {
    protected BankAccount account;
    protected double amount;

    public Transaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    // Abstract method must be implemented by subclasses
    public abstract void execute();
}

class DepositTransaction extends Transaction {
    public DepositTransaction(BankAccount account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("Deposited " + amount + " to " + account.getAccountNumber());
    }
}

class WithdrawTransaction extends Transaction {
    public WithdrawTransaction(BankAccount account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.withdraw(amount);
        System.out.println("Withdrew " + amount + " from " + account.getAccountNumber());
    }
}

public class ObjectOrientedProgrammingDemo {
    public static void main(String[] args) {
        // CLASS & OBJECT
        SavingsAccount savings = new SavingsAccount("SAV123", 0.05);
        CheckingAccount checking = new CheckingAccount("CHK456", 200);

        // ENCAPSULATION
        savings.deposit(1000);
        checking.deposit(500);

        // INHERITANCE + POLYMORPHISM
        savings.withdraw(100);
        checking.withdraw(600);

        // ABSTRACTION
        Transaction t1 = new DepositTransaction(checking, 300);
        t1.execute();

        Transaction t2 = new WithdrawTransaction(savings, 50);
        t2.execute();

        // CASTING
        BankAccount ref = new SavingsAccount("SAV789", 0.03); // Upcasting
        if (ref instanceof SavingsAccount) {
            SavingsAccount realSavings = (SavingsAccount) ref; // Downcasting
            realSavings.applyInterest();
            System.out.println("Interest applied to " + realSavings.getAccountNumber());
        }

        // Results
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Checking balance: " + checking.getBalance());
    }
}