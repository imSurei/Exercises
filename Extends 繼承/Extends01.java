package Extends;

public class Extends01 {
    public static void main(String[] args){
        Pupil pupil = new Pupil();
        pupil.name = "银角大王";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(76);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }
}
