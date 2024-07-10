package com.hspedu.extend_.exercise.exercise03;

public class ExtendsExercise03 {

    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();

        NotePad notePad = new NotePad("intel", 16, 500, "OK");
        notePad.printInfo();
    }
}
