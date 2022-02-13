package patika.demo.bean;


import javax.persistence.*;

@Entity
@Table(name = "credit")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 25)
    private int creditScore;

    @Column(nullable = false, length = 30)
    private String creditSituation;


    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getCreditSituation() {
        return creditSituation;
    }

    public void setCreditSituation(String creditSituation) {
        this.creditSituation = creditSituation;
    }
}
