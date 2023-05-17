package ManagerTest;

import Manager.Manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @ Test
    public void searchTest(){
        Manager manager=new Manager();
        String []expected={};
        String[]actual=manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @ Test
    public void addTest(){
        Manager manager=new Manager();
        manager.addMovie("Kino1");
        String []expected={"Kino1"};
        String[]actual=manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @ Test
    public void addSomeTest(){
        Manager manager=new Manager();
        manager.addMovie("Kino1");
        manager.addMovie("Kino2");
        manager.addMovie("Kino3");

        String []expected={"Kino1","Kino2","Kino3"};
        String[]actual=manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void reverseOrderTest(){
        Manager manager=new Manager();
        manager.addMovie("Kino1");
        manager.addMovie("Kino2");
        manager.addMovie("Kino3");


        String []expected={"Kino3","Kino2","Kino1"};
        String[]actual=manager.findLast();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void maxOrderTest(){
        Manager manager=new Manager();
        manager.addMovie("Kino1");
        manager.addMovie("Kino2");
        manager.addMovie("Kino3");
        manager.addMovie("Kino4");
        manager.addMovie("Kino5");
        manager.addMovie("Kino6");

        String []expected={"Kino6","Kino5","Kino4","Kino3","Kino2"};
        String[]actual=manager.findLast();
        Assertions.assertArrayEquals(expected,actual);
    }
}
