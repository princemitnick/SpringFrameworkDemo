package demo;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Doctor implements Staff {

    public Doctor(){
    }

    public Doctor(String qualification, Nurse nurse){
        this.qualification = qualification;
        this.nurse = nurse;
    }

    private String qualification;
    private Nurse nurse;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Nurse getNurse(){
        return this.nurse;
    }

    public void setNurse(Nurse nurse){
        this.nurse = nurse;
    }



    @Override
    public void assist() {
        System.out.println("Doctor is assisting");
    }
}
