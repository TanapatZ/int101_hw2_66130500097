package int101.homework02;

import work1.Utilitor;
import work2.Person;
import work3.Account;

public class Int101Homework02 {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();

    }

    static void work01Utilitor() {
        System.out.println(Utilitor.testString("danny"));
        System.out.println(Utilitor.testPositive(12313));
        System.out.println(Utilitor.computeIsbn10(234512349));

    }

    static void work02Person() {
        Person a = new Person("danny", "somesak");
        System.out.println(a.toString());
        Person b = new Person("danny", "somesak");
        System.out.println(b.toString());
        System.out.println(a.equals(a));

    }

    static void work03Account() {
        Person c = new Person("canny", "somesak");
        Account b1 = new Account(c);
        Person m = new Person("manny", "somesak");
        Account b2 = new Account(m);
        b1.deposit(5000);
        b2.deposit(4000);
        b1.transfer(1000, b2);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        b1.withdraw(8000);
        System.out.println(b1.getBalance());
        System.out.println(b1.getBalance() + "   " + b1.getNo() + "    " + b1.getOwner());
        Account b3 = new Account(m);
        Account b4 = new Account(m);
        Account b5 = new Account(m);
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        System.out.println(b5.toString());

    }
}
