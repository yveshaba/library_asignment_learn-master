
package domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
    @Id
    private String clientId;
    private String names;
    private String gender;
    @Enumerated(EnumType.STRING)
    private ClientCategory clientCategory;

    @OneToMany(mappedBy = "client")
    private List<CheckInOut> checkInOut;
    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ClientCategory getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(ClientCategory clientCategory) {
        this.clientCategory = clientCategory;
    }

    public List<CheckInOut> getCheckInOut() {
        return checkInOut;
    }

    public void setCheckInOut(List<CheckInOut> checkInOut) {
        this.checkInOut = checkInOut;
    }
    
}
