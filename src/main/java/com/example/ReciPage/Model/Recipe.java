package com.example.ReciPage.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="recipies_Table")
@Table(name="recipies_table")

public class Recipe {

    @Id
    @SequenceGenerator(name= "recipe_sequence", sequenceName = "recipe_sequence", allocationSize =1)
    @GeneratedValue( strategy = SEQUENCE, generator = "recipe_sequence")
    @Column(name = "id", updatable = false)
    @NonNull
    private Long id;

   // @Column(name = "Name", nullable = false, columnDefinition = "TEXT")
  //  @NonNull
    private String Name;
  //  @Column(name = "Description", nullable = false, columnDefinition = "TEXT")
  //  @NonNull
    private String Description;
   @Column(name = "Steps", nullable = false, columnDefinition = "LONGTEXT")
 @NonNull
    private String Steps;
  //  @Column(name = "Total Steps", nullable = false, columnDefinition = "TEXT")
   // @NonNull
    private String TotalSteps;
   // @Column(name = "Price", nullable = false, columnDefinition = "TEXT")
   // @NonNull
    private String Price;
   // @Column(name = "Time", nullable = false, columnDefinition = "TEXT")
  //  @NonNull
    private String Time;


    public Recipe( String Name, String Description, String Steps, String TotalSteps, String Price,
            String Time) {
      
        this.Name = Name;
        this.Description = Description;
        this.Steps = Steps;
        this.TotalSteps =TotalSteps;
        this.Price = Price;
        this.Time = Time;

    }


    public Recipe(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
    return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription(){
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getSteps(){
        return Steps;
    }

    public void setSteps(String Steps) {
        this.Steps = Steps;
    }

    public String getTotalSteps(){
        return TotalSteps;
    }

    public void setTotalSteps(String TotalSteps) {
        this.TotalSteps = TotalSteps;
    }

    public String getPrice(){
        return Price;
    }

    public void setPrice(String Price){
        this.Price = Price;
    }

    public String getTime(){
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }


    @Override
    public String toString(){
        return "Recipe{" + 
        "id=" + id +
        ", Name='" + Name + '\'' +
        ", Description='" + Description + '\'' +
        ", Steps='" + Steps + '\'' +
        ", Total Steps='" + TotalSteps + '\'' +
        ", Price='" + Price + '\'' +
        ", Time="+Time+ '}';
    }


    


}