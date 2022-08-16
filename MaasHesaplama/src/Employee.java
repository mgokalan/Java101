public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    int nowYear = 2021;
    double raise;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (this.salary <= 1000 && this.salary >= 0) {
            return;
        } else if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        }
    }

    void bonus() {
        if (workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        }
    }

    void raiseSalary() {
        if (this.nowYear - this.hireYear > 19) {
            this.raise = this.salary * 0.15;
        } else if (this.nowYear - this.hireYear > 9 && this.nowYear - this.hireYear < 20) {
            this.raise = this.salary * 0.1;
        } else if (this.nowYear - this.hireYear >= 0 && this.nowYear - this.hireYear < 10) {
            this.raise = this.salary * 0.05;
        }
    }

    void toPrint() {
        tax();
        bonus();
        raiseSalary();
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma saati :" + this.workHours);
        System.out.println("Baslangic yili : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maas artisi : " + this.raise);
        System.out.println("Vergi ve bonuslar ile birlikte maas : " + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam maas : " + (this.salary + this.raise));
    }
}


