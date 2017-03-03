package com.annakondratenko.app.homework.Lesson11;

/**
 * Created by annak on 26.02.2017.
 */
public class WhiteCollar extends Human {
    private String companyName;

    public WhiteCollar(String name, int age, String company) {
        super(name, age);
        companyName = company;
    }

    public void setCompany(String company) {
        for (int i = 0; i < company.length(); i++) {
            char charAt2 = company.charAt(i);
            if (Character.isLetter(charAt2)) {
                companyName = company;
            } else {
                System.out.println("Company name is invalid");
                break;
            }
        }
        System.out.println("New company name is " + companyName + "\nAge is " + age + "\nName is " + name);
    }
}
