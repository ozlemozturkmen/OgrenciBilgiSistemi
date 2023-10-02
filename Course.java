package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name, code, prefix;
    double writtenNote, oralNote;
    double oralPercent, result;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        writtenNote = 0;
        oralNote = 0;

        if (this.prefix.equals("TRH")){
            this.oralPercent = 0.25;
        }
        if (this.prefix.equals("FZK")){
            this.oralPercent = 0.20;
        }
        if (this.prefix.equals("BIO")){
            this.oralPercent = 0.15;
        }
    }

    void addTeacher(Teacher teacher) {
        if (teacher.dept.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println(teacher + " : Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }

}
