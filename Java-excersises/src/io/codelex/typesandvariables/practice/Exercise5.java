package io.codelex.typesandvariables.practice;

public class Exercise5 {
//Example
//+------------------------------------------------------------+
//| 1 |                          English III |       Ms. Lapan |
//| 2 |                          Precalculus |     Mrs. Gideon |
//| 3 |                         Music Theory |       Mr. Davis |
//| 4 |                        Biotechnology |      Ms. Palmer |
//| 5 |           Principles of Technology I |      Ms. Garcia |
//| 6 |                             Latin II |    Mrs. Barnett |
//| 7 |                        AP US History | Ms. Johannessen |
//| 8 | Business Computer Infomation Systems |       Mr. James |
//+------------------------------------------------------------+

    public static void printTopBottom() {
        for (int i = 0; i <= 60; i++) {
            if (i == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.print("+\n");  //last column
    }

    public static void printRows(int iterator, String course, String teacher) {
        String displayString = "";
        displayString = "| " + iterator + " |";
        for (int i = 37 - course.length(); i > 0; i--) {
            displayString += " ";
        }
        displayString += course + " |";
        for (int i = 16 - teacher.length(); i > 0; i--) {
            displayString += " ";
        }
        displayString += teacher + " |";
        System.out.println(displayString);
    }

    public static void main(String[] args) {
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";

        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Ms. Johannessen";
        String teacher7 = "Mrs. Barnett";
        String teacher8 = "Mr. James";

        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0, 9 -> printTopBottom();
                case 1 -> printRows(i, course1, teacher1);
                case 2 -> printRows(i, course2, teacher2);
                case 3 -> printRows(i, course3, teacher3);
                case 4 -> printRows(i, course4, teacher4);
                case 5 -> printRows(i, course5, teacher5);
                case 6 -> printRows(i, course6, teacher6);
                case 7 -> printRows(i, course7, teacher7);
                case 8 -> printRows(i, course8, teacher8);
            }
        }
    }
}
