package com.codingdojo.formulade.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	//attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "Name cannot be empty")
	@Size(min=1)
	private String username;
	@Email(message="Please use a valid email format.")
	private String email;
	@Size(min=8, message="Password must be at least 8 characters.")
	private String password;
	@Transient
	private String passwordConfirmation;
	@NotEmpty(message = "You must have a Driver name.")
	private String driver_name;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	//driver points
	private int driver_points;
	// driver relationship to races
	@OneToMany(mappedBy="start_grid_1", fetch=FetchType.LAZY)
	private List<Race> start_grid_1;
	
	@OneToMany(mappedBy="finish_grid_1", fetch=FetchType.LAZY)
	private List<Race> finish_grid_1;
	
	@OneToMany(mappedBy="start_grid_2", fetch=FetchType.LAZY)
	private List<Race> start_grid_2;
	
	@OneToMany(mappedBy="finish_grid_2", fetch=FetchType.LAZY)
	private List<Race> finish_grid_2;
	
	@OneToMany(mappedBy="start_grid_3", fetch=FetchType.LAZY)
	private List<Race> start_grid_3;
	
	@OneToMany(mappedBy="finish_grid_3", fetch=FetchType.LAZY)
	private List<Race> finish_grid_3;
	
	@OneToMany(mappedBy="start_grid_4", fetch=FetchType.LAZY)
	private List<Race> start_grid_4;
	
	@OneToMany(mappedBy="finish_grid_4", fetch=FetchType.LAZY)
	private List<Race> finish_grid_4;
	
	@OneToMany(mappedBy="start_grid_5", fetch=FetchType.LAZY)
	private List<Race> start_grid_5;
	
	@OneToMany(mappedBy="finish_grid_5", fetch=FetchType.LAZY)
	private List<Race> finish_grid_5;
	
	@OneToMany(mappedBy="start_grid_6", fetch=FetchType.LAZY)
	private List<Race> start_grid_6;
	
	@OneToMany(mappedBy="finish_grid_6", fetch=FetchType.LAZY)
	private List<Race> finish_grid_6;
	
	@OneToMany(mappedBy="start_grid_7", fetch=FetchType.LAZY)
	private List<Race> start_grid_7;
	
	@OneToMany(mappedBy="finish_grid_7", fetch=FetchType.LAZY)
	private List<Race> finish_grid_7;
	
	@OneToMany(mappedBy="start_grid_8", fetch=FetchType.LAZY)
	private List<Race> start_grid_8;
	
	@OneToMany(mappedBy="finish_grid_8", fetch=FetchType.LAZY)
	private List<Race> finish_grid_8;
	
	@OneToMany(mappedBy="start_grid_9", fetch=FetchType.LAZY)
	private List<Race> start_grid_9;
	
	@OneToMany(mappedBy="finish_grid_9", fetch=FetchType.LAZY)
	private List<Race> finish_grid_9;
	
	@OneToMany(mappedBy="start_grid_10", fetch=FetchType.LAZY)
	private List<Race> start_grid_10;
	
	@OneToMany(mappedBy="finish_grid_10", fetch=FetchType.LAZY)
	private List<Race> finish_grid_10;
	
	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	public int getDriver_points() {
		return driver_points;
	}

	public void setDriver_points(int driver_points) {
		this.driver_points = driver_points;
	}

	public String getDriver_name() {
		return driver_name;
	}

	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public List<Race> getStart_grid_1() {
		return start_grid_1;
	}

	public void setStart_grid_1(List<Race> start_grid_1) {
		this.start_grid_1 = start_grid_1;
	}

	public List<Race> getFinish_grid_1() {
		return finish_grid_1;
	}

	public void setFinish_grid_1(List<Race> finish_grid_1) {
		this.finish_grid_1 = finish_grid_1;
	}
	
	public List<Race> getStart_grid_2() {
		return start_grid_2;
	}

	public void setStart_grid_2(List<Race> start_grid_2) {
		this.start_grid_2 = start_grid_2;
	}

	public List<Race> getFinish_grid_2() {
		return finish_grid_2;
	}

	public void setFinish_grid_2(List<Race> finish_grid_2) {
		this.finish_grid_2 = finish_grid_2;
	}
	
	public List<Race> getStart_grid_3() {
		return start_grid_3;
	}

	public void setStart_grid_3(List<Race> start_grid_3) {
		this.start_grid_3 = start_grid_3;
	}

	public List<Race> getFinish_grid_3() {
		return finish_grid_3;
	}

	public void setFinish_grid_3(List<Race> finish_grid_3) {
		this.finish_grid_3 = finish_grid_3;
	}

	public List<Race> getStart_grid_4() {
		return start_grid_4;
	}

	public void setStart_grid_4(List<Race> start_grid_4) {
		this.start_grid_4 = start_grid_4;
	}

	public List<Race> getFinish_grid_4() {
		return finish_grid_4;
	}

	public void setFinish_grid_4(List<Race> finish_grid_4) {
		this.finish_grid_4 = finish_grid_4;
	}

	public List<Race> getStart_grid_5() {
		return start_grid_5;
	}

	public void setStart_grid_5(List<Race> start_grid_5) {
		this.start_grid_5 = start_grid_5;
	}

	public List<Race> getFinish_grid_5() {
		return finish_grid_5;
	}

	public void setFinish_grid_5(List<Race> finish_grid_5) {
		this.finish_grid_5 = finish_grid_5;
	}

	public List<Race> getStart_grid_6() {
		return start_grid_6;
	}

	public void setStart_grid_6(List<Race> start_grid_6) {
		this.start_grid_6 = start_grid_6;
	}

	public List<Race> getFinish_grid_6() {
		return finish_grid_6;
	}

	public void setFinish_grid_6(List<Race> finish_grid_6) {
		this.finish_grid_6 = finish_grid_6;
	}

	public List<Race> getStart_grid_7() {
		return start_grid_7;
	}

	public void setStart_grid_7(List<Race> start_grid_7) {
		this.start_grid_7 = start_grid_7;
	}

	public List<Race> getFinish_grid_7() {
		return finish_grid_7;
	}

	public void setFinish_grid_7(List<Race> finish_grid_7) {
		this.finish_grid_7 = finish_grid_7;
	}

	public List<Race> getStart_grid_8() {
		return start_grid_8;
	}

	public void setStart_grid_8(List<Race> start_grid_8) {
		this.start_grid_8 = start_grid_8;
	}

	public List<Race> getFinish_grid_8() {
		return finish_grid_8;
	}

	public void setFinish_grid_8(List<Race> finish_grid_8) {
		this.finish_grid_8 = finish_grid_8;
	}

	public List<Race> getStart_grid_9() {
		return start_grid_9;
	}

	public void setStart_grid_9(List<Race> start_grid_9) {
		this.start_grid_9 = start_grid_9;
	}

	public List<Race> getFinish_grid_9() {
		return finish_grid_9;
	}

	public void setFinish_grid_9(List<Race> finish_grid_9) {
		this.finish_grid_9 = finish_grid_9;
	}

	public List<Race> getStart_grid_10() {
		return start_grid_10;
	}

	public void setStart_grid_10(List<Race> start_grid_10) {
		this.start_grid_10 = start_grid_10;
	}

	public List<Race> getFinish_grid_10() {
		return finish_grid_10;
	}

	public void setFinish_grid_10(List<Race> finish_grid_10) {
		this.finish_grid_10 = finish_grid_10;
	}

	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
