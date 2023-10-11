public class Px6_1 {

}

class Student {
    public String name;
    public int ban;
    public int no;
    public int kor;
    public int eng;
    public int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        return name+ban+no+kor+eng+math;
    }

    public int getTotal() {
        return this.kor + this.eng + this.math;
    }

    public int getAverage() {
        return (this.getTotal())/3;
    }
}
