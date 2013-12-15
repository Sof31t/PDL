
package msgtypeid.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "identifyMsgType", namespace = "http://msgtypeid/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifyMsgType", namespace = "http://msgtypeid/")
public class IdentifyMsgType {

    @XmlElement(name = "message", namespace = "")
    private String message;

    /**
     * 
     * @return
     *     returns String
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 
     * @param message
     *     the value for the message property
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
