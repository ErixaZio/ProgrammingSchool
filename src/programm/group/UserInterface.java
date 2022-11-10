package programm.group;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
   private Scanner sc = new Scanner(System.in);
   private CourseRepository repo= new CourseRepository();

    public void start() {
        while(true) {
            System.out.println("Menù:\n" +
                    "-V = visualizza dettagli corsi;\n" +
                    "-S = visualizza dettagli studenti;\n" +
                    "-C = crea un nuovo corso;\n" +
                    "-A = iscriviti\n");
            System.out.println("Seleziona operazione");

            String s = sc.nextLine();
            if (s.equals("V")) {
                var courses = repo.getAllCourses();
                for (Course c : courses) {
                    System.out.println(c.informationCourse());
                }


            } else if (s.equals("S")) {
                var students = repo.getAllStudents();
                for (Student st : students) {
                    System.out.println(st.informationStudent());
                }
            } else if (s.equals("C")) {
                System.out.println("inserisci id corso: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("inserisci titolo corso: ");
                String title = sc.nextLine();
                System.out.println("inserisci durata corso: ");
                int duration = sc.nextInt();
                sc.nextLine();
                System.out.println("inserisci costo corso: ");
                double cost = sc.nextDouble();
                sc.nextLine();
                Course c = new Course(id, title, duration, cost);
                int n = repo.addCourse(c);
                System.out.println("inserimento effettuato, totale numero corsi: " + n);
            } else if (s.equals("A")) {
                System.out.println("inserisci id studente: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("inserisci nome studente: ");
                String name = sc.nextLine();
                System.out.println("inserisci cognome studente: ");
                String surname = sc.nextLine();
                System.out.println("inserisci data di nascita (aaaa-mm-gg): ");
                String db = sc.nextLine();
                LocalDate dob =LocalDate.parse(db);
                System.out.println("inserisci l'id del corso di iscrizione:");
                int idCorso = sc.nextInt();
                sc.nextLine();
                Student s1 = new Student(id, name, surname, dob);
                repo.enrollStudent(s1, idCorso);

            } else {
                System.out.println("Hai sbagliato lettera,riprova");
            }
        }

        }

    }



/*
Scanner sc=new Scanner(System.in);
        System.out.println("inserisci id corso");
        int ID= sc.nextInt();
        sc.nextLine();
        System.out.println(ID);
        System.out.println("inserisci titolo del corso");
        String title= sc.nextLine();
        System.out.println(title);
        System.out.println("inserisci la durarta dei giorni del corso");
        String ts=sc.nextLine();
        int duration= Integer.parseInt(ts);
        System.out.println(duration);
 */