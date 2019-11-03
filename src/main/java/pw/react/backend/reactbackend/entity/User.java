package pw.react.backend.reactbackend.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

import  java.sql.Date;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "login")
	private String login;

	@Column(name = "birthofdate")
	private Date birthOfDate;

	@Column(name = "activestatus")
	private boolean isActive;


	protected User() {
	}

	public User(@JsonProperty("firstName") String firstName, @JsonProperty("lastName")String lastName, @JsonProperty("login")String login, @JsonProperty("birthOfDate")Date birthOfDate, @JsonProperty("isActive")boolean isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.login=login;
		this.birthOfDate=birthOfDate;
		this.isActive=isActive;
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id){this.id=id;}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String first_name)
	{
		this.firstName=first_name;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String last_name)
	{
		this.lastName=last_name;
	}
	public String getLogin()
	{
		return login;
	}
	public void  setLogin(String login)
	{
		this.login=login;
	}
	public Date getDoB()
	{
		return birthOfDate;
	}
	public void setDoB(Date BoD)
	{
		this.birthOfDate=birthOfDate;
	}
	public boolean getisActive() {
		return isActive;
	}
	public void setisActive(boolean active) {
		isActive = active;
	}

	@Override
	public String toString() {
		return String.format("User[id=%d, firstName='%s', lastName='%s',login='%s',birthOfDate='%s',isActive='%s']", id, firstName, lastName,login,birthOfDate,isActive);
	}
}
