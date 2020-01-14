package com.rednavis.vaadin.showcase.backend;

/**
 *  Model.
 */
public class Employee {

  private String firstname;
  private String lastname;
  private String title;
  private String email;
  private String notes = "";

  /**
   * Employee.
   *
   * @param firstname firstname
   * @param lastname  lastname
   * @param email     email
   * @param title     title
   */
  public Employee(String firstname, String lastname, String email, String title) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.title = title;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return firstname + " " + lastname + "(" + email + ")";
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
}
