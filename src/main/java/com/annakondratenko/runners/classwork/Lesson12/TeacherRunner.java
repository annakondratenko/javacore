package com.annakondratenko.runners.classwork.Lesson12;

import com.annakondratenko.app.classwork.Lesson12.Teacher;

/**
 * Created by annak on 27.02.2017.
 */
public class TeacherRunner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Aleksey",11);
        teacher.specifyTeacherSpecialization("Literature");
        teacher.askAge(28);
    }

}
