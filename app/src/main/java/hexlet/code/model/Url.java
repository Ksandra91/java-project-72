package hexlet.code.model;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Url {

    private long id;

    private String name;
    private Timestamp createdAt;


    public Url(String name, Timestamp createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }

//    public Url(String name) {
//        this.name = name;
//
//    }

    public String dateToString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        return createdAt.toLocalDateTime().format(formatter);
    }
}
