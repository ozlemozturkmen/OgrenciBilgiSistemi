package OgrenciBilgiSistemi;

public class Student {
    String name, stuNo, classes;
    Course c1, c2, c3;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addWrittenExamNote(int written1, int written2, int written3) {
        if (written1 >= 0 & written1 <= 100) {
            this.c1.writtenNote = written1;
        }
        if (written2 >= 0 & written2 <= 100) {
            this.c2.writtenNote = written2;
        }
        if (written3 >= 0 & written3 <= 100) {
            this.c3.writtenNote = written3;
        }
    }

    void addOralExamNote(int oral1, int oral2, int oral3) {
        if (oral1 >= 0 & oral1 <= 100) {
            this.c1.oralNote = oral1;
        }
        if (oral2 >= 0 & oral2 <= 100) {
            this.c2.oralNote = oral2;
        }
        if (oral3 >= 0 & oral3 <= 100) {
            this.c3.oralNote = oral3;
        }
    }

    void isPass() {
        System.out.println("-------------------------------------------------------------");

        if (this.c1.writtenNote == 0 || this.c2.writtenNote == 0 || this.c3.writtenNote == 0
                || this.c1.oralNote == 0 || this.c2.oralNote == 0 || this.c3.oralNote == 0) {
            System.out.println("Sınav notları 1 - 100 arasında girilmelidir");
        } else {
            this.c1.result = this.c1.oralNote * this.c1.oralPercent + this.c1.writtenNote * (1 - this.c1.oralPercent);
            this.c2.result = this.c2.oralNote * this.c2.oralPercent + this.c2.writtenNote * (1 - this.c2.oralPercent);
            this.c3.result = this.c3.oralNote * this.c3.oralPercent + this.c3.writtenNote * (1 - this.c3.oralPercent);

            System.out.println(this.c1.name + " ortalaması: " + this.c1.result +
                    "\n" + this.c2.name + " ortalaması: " + this.c2.result +
                    "\n" + this.c3.name + " ortalaması: " + this.c3.result);

            this.average = (this.c1.result + this.c2.result + this.c3.result) / 3.0;

            System.out.println("Dönem ortalaması: " + this.average);

            if (this.average >= 55) {
                System.out.println(this.name + " sınıfı geçti.");
            } else {
                System.out.println(this.name + " sınıfta kaldı.");
            }
        }
    }
}
