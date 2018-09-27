package com.codingdojo.formulade.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="races")
public class Race {
	//attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date race_date;
	private Date start_time;
	private Date end_time;
	private String weather;
	private String notes;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_1")
	private User start_grid_1;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_1")
	private User finish_grid_1;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_2")
	private User start_grid_2;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_2")
	private User finish_grid_2;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_3")
	private User start_grid_3;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_3")
	private User finish_grid_3;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_4")
	private User start_grid_4;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_4")
	private User finish_grid_4;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_5")
	private User start_grid_5;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_5")
	private User finish_grid_5;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_6")
	private User start_grid_6;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_6")
	private User finish_grid_6;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_7")
	private User start_grid_7;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_7")
	private User finish_grid_7;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_8")
	private User start_grid_8;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_8")
	private User finish_grid_8;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_9")
	private User start_grid_9;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_9")
	private User finish_grid_9;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_grid_10")
	private User start_grid_10;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="finish_grid_10")
	private User finish_grid_10;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	//ManyToMany relationship to Drivers(users)
//	@ManyToMany(fetch=FetchType.LAZY)
//	@JoinTable(
//			name = "drivers_races",
//			joinColumns = @JoinColumn(name = "race_id"),
//			inverseJoinColumns = @JoinColumn(name = "driver_id")
//	)
//	private List<User> users;
	
	//ManyToOne relationship for Track(racing venue)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="track_id")
	private RaceTrack track;
	
	public Race() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public Date getRace_date() {
		return race_date;
	}

	public void setRace_date(Date race_date) {
		this.race_date = race_date;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public User getStart_grid_1() {
		return start_grid_1;
	}

	public void setStart_grid_1(User start_grid_1) {
		this.start_grid_1 = start_grid_1;
	}

	public User getFinish_grid_1() {
		return finish_grid_1;
	}

	public void setFinish_grid_1(User finish_grid_1) {
		this.finish_grid_1 = finish_grid_1;
	}
	
	public User getStart_grid_2() {
		return start_grid_2;
	}

	public void setStart_grid_2(User start_grid_2) {
		this.start_grid_2 = start_grid_2;
	}

	public User getFinish_grid_2() {
		return finish_grid_2;
	}

	public void setFinish_grid_2(User finish_grid_2) {
		this.finish_grid_2 = finish_grid_2;
	}
	
	public User getStart_grid_3() {
		return start_grid_3;
	}

	public void setStart_grid_3(User start_grid_3) {
		this.start_grid_3 = start_grid_3;
	}

	public User getFinish_grid_3() {
		return finish_grid_3;
	}

	public void setFinish_grid_3(User finish_grid_3) {
		this.finish_grid_3 = finish_grid_3;
	}

	public User getStart_grid_4() {
		return start_grid_4;
	}

	public void setStart_grid_4(User start_grid_4) {
		this.start_grid_4 = start_grid_4;
	}

	public User getFinish_grid_4() {
		return finish_grid_4;
	}

	public void setFinish_grid_4(User finish_grid_4) {
		this.finish_grid_4 = finish_grid_4;
	}

	public User getStart_grid_5() {
		return start_grid_5;
	}

	public void setStart_grid_5(User start_grid_5) {
		this.start_grid_5 = start_grid_5;
	}

	public User getFinish_grid_5() {
		return finish_grid_5;
	}

	public void setFinish_grid_5(User finish_grid_5) {
		this.finish_grid_5 = finish_grid_5;
	}

	public User getStart_grid_6() {
		return start_grid_6;
	}

	public void setStart_grid_6(User start_grid_6) {
		this.start_grid_6 = start_grid_6;
	}

	public User getFinish_grid_6() {
		return finish_grid_6;
	}

	public void setFinish_grid_6(User finish_grid_6) {
		this.finish_grid_6 = finish_grid_6;
	}

	public User getStart_grid_7() {
		return start_grid_7;
	}

	public void setStart_grid_7(User start_grid_7) {
		this.start_grid_7 = start_grid_7;
	}

	public User getFinish_grid_7() {
		return finish_grid_7;
	}

	public void setFinish_grid_7(User finish_grid_7) {
		this.finish_grid_7 = finish_grid_7;
	}

	public User getStart_grid_8() {
		return start_grid_8;
	}

	public void setStart_grid_8(User start_grid_8) {
		this.start_grid_8 = start_grid_8;
	}

	public User getFinish_grid_8() {
		return finish_grid_8;
	}

	public void setFinish_grid_8(User finish_grid_8) {
		this.finish_grid_8 = finish_grid_8;
	}

	public User getStart_grid_9() {
		return start_grid_9;
	}

	public void setStart_grid_9(User start_grid_9) {
		this.start_grid_9 = start_grid_9;
	}

	public User getFinish_grid_9() {
		return finish_grid_9;
	}

	public void setFinish_grid_9(User finish_grid_9) {
		this.finish_grid_9 = finish_grid_9;
	}

	public User getStart_grid_10() {
		return start_grid_10;
	}

	public void setStart_grid_10(User start_grid_10) {
		this.start_grid_10 = start_grid_10;
	}

	public User getFinish_grid_10() {
		return finish_grid_10;
	}

	public void setFinish_grid_10(User finish_grid_10) {
		this.finish_grid_10 = finish_grid_10;
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

	public RaceTrack getTrack() {
		return track;
	}

	public void setTrack(RaceTrack track) {
		this.track = track;
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
