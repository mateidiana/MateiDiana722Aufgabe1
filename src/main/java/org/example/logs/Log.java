package org.example.logs;
import java.util.List;
public class Log {
    private int id;
    private String patient;
    private String symptom;
    private String diagnosis;
    private String date;
    private String hospital;

    public Log(int id, String patient, String symptom, String diagnosis, String date,String hospital){
        this.id=id;
        this.patient=patient;
        this.symptom=symptom;
        this.diagnosis=diagnosis;
        this.date=date;
        this.hospital=hospital;
    }

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    @Override
    public String toString() {
        return "Log{" +
                "id=" + this.id +
                ", patient=" + this.patient +
                ", symptom=" + this.symptom +
                ", diagnosis=" + this.diagnosis +
                ", date=" + this.date +
                ", hospital=" + this.hospital +
                '}';
    }
}
