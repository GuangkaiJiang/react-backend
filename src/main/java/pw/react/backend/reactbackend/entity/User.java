package pw.react.backend.reactbackend.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private final UUID id;
    private String login;
    private final String first_name;
    private final String last_name;
    private int year;
    private int month;
    private int day;
    private  boolean isActive;

    public UUID getId()
    {
        return id;
    }
    public String getFirstName()
    {
        return first_name;
    }
    public String getLastName()
    {
        return last_name;
    }
    public String getLogin()
    {
        return login;
    }
    public void  setLogin(String login)
    {
        this.login=login;
    }
    public String getDoB()
    {
        return year+"/"+month+"/"+day;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public User(@JsonProperty("id") UUID id,@JsonProperty("firstName") String first_name, @JsonProperty("lastName")String last_name)
    {
        this.id=id;
        this.first_name=first_name;
        this.last_name=last_name;
    }




}
