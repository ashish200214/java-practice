package Practical_Class;


class College {
    void collegeName() {
        System.out.println("College Name: Pune University");
    }
}

class AISSMS extends College {
    void branchName() {
        System.out.println("AISSMS College Branch: Computer Engineering");
    }
}

class FC extends College {
    void branchName() {
        System.out.println("FC College Branch: Information Technology");
    }
}

public class Task2 {
    public static void main(String[] args) {
        AISSMS aissms = new AISSMS();
        aissms.collegeName();
        aissms.branchName();
        System.out.println("=====================================");
        FC fc = new FC();
        fc.collegeName();
        fc.branchName();
    }
}

