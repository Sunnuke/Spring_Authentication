package com.practice.authentication.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="users")
public class User {
    
//	ATTRIBUTES
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    
    @Transient
    private String passwordConfirmation;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
//	Constructors
    
    public User() {
    }
    
//	PRESETS
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

//	METHODS
    
	// Id
    public Long getId() {
		return id;
	}

    // Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	// Password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	// Password Confirmation
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	// Date/Time
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}


}