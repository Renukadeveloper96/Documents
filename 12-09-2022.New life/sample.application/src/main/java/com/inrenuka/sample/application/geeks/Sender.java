package com.inrenuka.sample.application.geeks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

	public static void main(String[] args) throws IOException
    {
        // Creating object of class Random class which
        // contains two variables which are going to
        // Serialize In simpler words , object of class
        // 'Geeks'
        Geeks g = new Geeks();
 
        // Here xyz.txt is the file name where the object is
        // going to serialize
        FileOutputStream fos
            = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos
            = new ObjectOutputStream(fos);
 
        oos.writeObject(g);
    }
}
