
package work3;

import java.util.Objects;
import work1.Utilitor;
import work2.Person;

public class Account {

    private static long nextNo = 1_000_000_000;
    private final long no;
    private Person owner;
    private double balance;

    public Account(Person owner) {
        if (owner == null) {
            throw new NullPointerException();
        }
        this.owner = owner;
        long result=Utilitor.computeIsbn10(nextNo);
            while(result==10){
            nextNo++;        
            result=Utilitor.computeIsbn10(nextNo);
            }
        no = 10 * nextNo+ result;
        balance = 0;
        nextNo++;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        Utilitor.testPositive(amount);
        return balance += amount;
    }

    public double withdraw(double amount) {
        Utilitor.testPositive(amount);
        if (balance > amount) {
            return balance -= amount;
        }
        return balance;
    }
       public void transfer(double amount,Account account) {
        if(account == null){
        throw new IllegalArgumentException();
        }
        withdraw(amount);
        account.deposit(amount);

    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (this.no != other.no) {
            return false;
        }
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        return Objects.equals(this.owner, other.owner);
    }

    @Override
    public String toString() {

        return "Account{" + "no=" + no + ", balance=" + balance + '}';
    }
}
