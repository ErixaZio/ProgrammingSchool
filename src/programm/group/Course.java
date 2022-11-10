package programm.group;

import java.util.ArrayList;
import java.util.Scanner;

/*creare un programma che gestisca una scuola di porgrammazione con studenti
        e corsi lo studente è una cosa che ha un id INTERO, un nome un cognome e una
        data di nascita, il corso invece ha anche lui un id numerica intera, un titolo
        una durata, costo, il programma dovrà mostrare un menù, e dirà:
        -V per vedere stampati i dettagli di tutti i corsi;
        -S per vedere tutti gli studenti nella scuola;
        -C per creare un nuovo corso;
        -A per iscrivere uno studente a un corso;
        user interface, usare per l'interfaccia
        classe studente
        classe corso (inserire arraylist con gli studenti iscritti)
        classe courseRepository
        */
public class Course {
    private int id;
    private String title;
    private int duration;
    private double cost;
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    private ArrayList<Student> students= new ArrayList<>();

    public Course(int id, String title, int duration, double cost) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.cost = cost;
    }

    public Course() {

    }
    public int enrollStudent(Student s){
        students.add(s);
        return students.size();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String informationCourse(){
        return "Corso: "+this.title+","+this.duration+", "+this.id+", "+this.cost;

    }
//    public Course createCourse(int id,String title,int duration,double cost){
//        Course c= new Course();
//        System.out.println("inserisci id corso: ");
//        c.setId(sc.nextInt());
//        sc.nextLine();
//        System.out.println("inserisci titolo corso: ");
//        c.setTitle(sc.nextLine());
//        System.out.println("inserisci durata corso: ");
//        c.setDuration(sc.nextInt());
//        sc.nextLine();
//        System.out.println("inserisci costo corso: ");
//        c.setCost(sc.nextDouble());
//        sc.nextLine();
//        return c;
//    }

}
