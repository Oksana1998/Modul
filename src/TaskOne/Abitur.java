package TaskOne;

/**
 * Created by Ксюша on 30.11.2017.
 */
public class Abitur extends Person {

    String fuculty;
    String spec;

    String nameOfExam1;
    String nameOfExam2;
    String nameOfExam3;

    int mark1;
    int mark2;
    int mark3;
    double middleMark;




    public Abitur(String name, int age, String sex, String fuculty, String spec, String nameOfExam1, String nameOfExam2, String nameOfExam3, int mark1, int mark2, int mark3, double middleMark) {
        super(name, age, sex);
        this.fuculty = fuculty;
        this.spec = spec;
        this.nameOfExam1 = nameOfExam1;
        this.nameOfExam2 = nameOfExam2;
        this.nameOfExam3 = nameOfExam3;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.middleMark = (mark1+mark2+mark3)/3;

    }

    @Override
    public String toString() {
        return super.toString() +
                "fuculty='" + fuculty + '\'' +
                ", spec='" + spec + '\'' +
                ", nameOfExam1='" + nameOfExam1 + '\'' +
                ", nameOfExam2='" + nameOfExam2 + '\'' +
                ", nameOfExam3='" + nameOfExam3 + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", mark3=" + mark3 +
                ", middleMark=" + middleMark +
                '}';
    }
}
