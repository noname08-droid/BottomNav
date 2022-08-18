package com.example.labexam;

import android.widget.Button;

public class Person {
    int Image;
    String Name;
    String Label;

    public Person(int image, String name, String label) {
        Image = image;
        Name = name;
        Label = label;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }
}
