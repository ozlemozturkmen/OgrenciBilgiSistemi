package OgrenciBilgiSistemi;

public class Teacher {
    String name, mpno, dept;

    Teacher (String name, String mpno, String dept) {
        this.name = name;
        this.mpno = mpno;
        this.dept = dept;
    }

    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.mpno);
        System.out.println("Bölümü: " + this.dept);
    }
}
