package demo;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Pharmacist {

    public Pharmacist(){
    }

    public Pharmacist(String qualification) {
        this.qualification = qualification;
    }

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Pharmacist{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
