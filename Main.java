package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ahmet Hoca", "+905550000000", "TRH");
        Teacher t2 = new Teacher("Serkan Hoca", "+905550000001", "FZK");
        Teacher t3 = new Teacher("Ayşe Hoca", "+905550000002", "BIO");

        Course tarih = new Course("Tarih", "MAT101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "FZK101", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "BIO101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Ali", "123", "4", tarih, fizik, biyo);
        s1.addWrittenExamNote(100, 80, 20);
        s1.addOralExamNote(20, 75, 80);
        s1.isPass();

        Student s2 = new Student("Mehmet", "222", "3", tarih, fizik, biyo);
        s2.addWrittenExamNote(40, 21, 14);
        s2.addOralExamNote(15, 22, 35);
        s2.isPass();

    }
}
