package pl.edu.pw.pik.pikactivitytrackerserver.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String login;
    //Contains hash of a password
    private  String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {

    }
}
