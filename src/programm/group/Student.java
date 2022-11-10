package programm.group;
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
import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private String surname;
    private LocalDate dob;


    public Student(int id, String name, String surname, LocalDate dob){
        this.id=id;
        this.name=name;
        this.surname = surname;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String informationStudent(){
        return "Studente: "+this.name+","+this.surname+", "+this.id+", "+this.dob;
    }
}
