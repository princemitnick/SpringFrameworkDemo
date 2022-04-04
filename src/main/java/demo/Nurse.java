package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class Nurse implements  Staff {

    private String qualification;

    public Nurse(){}

    public Nurse(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification(){
        return this.qualification;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    @Override
    public void assist() {

        System.out.println("Nurse is assisting");
    }
}
