package ru.dilmar.user;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

@Entity()
@Table(name = "users")
public class User {
public final static Logger log= LoggerFactory.getLogger(User.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "login",length = 30)
    String login;

    @Column(name="password",length = 30)
    String password;

    @Column(name = "email", length = 100)
    String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
        log.info("User was created with login, password, email!!!");
    }

    public User() {
        log.info("User was created empty!!!");
    }

}
