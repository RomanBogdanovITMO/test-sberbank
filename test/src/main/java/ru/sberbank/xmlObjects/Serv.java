package ru.sberbank.xmlObjects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "serv")
public class Serv {
    @JacksonXmlProperty(localName = "isClosed", isAttribute = true)
    private String isClosed;

    private String serv_id;

    private int bic;
    private String schet;
    private String corr_schet;
    private String sys_message;


    private List<Par> pars = new ArrayList<>();

    public List<Par> getPars() {
        return pars;
    }

    public void setPars(List<Par> pars) {
        this.pars = pars;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public int getBic() {
        return bic;
    }

    public void setBic(int bic) {
        this.bic = bic;
    }

    public String getSchet() {
        return schet;
    }

    public void setSchet(String schet) {
        this.schet = schet;
    }

    public String getCorr_schet() {
        return corr_schet;
    }

    public void setCorr_schet(String corr_schet) {
        this.corr_schet = corr_schet;
    }

    public String getSys_message() {
        return sys_message;
    }

    public void setSys_message(String sys_message) {
        this.sys_message = sys_message;
    }

    public String getServ_id() {
        return serv_id;
    }

    public void setServ_id(String serv_id) {
        this.serv_id = serv_id;
    }

    @Override
    public String toString() {
        return "XmlObgects.Serv{" +
                "isClosed='" + isClosed + '\'' +
                ", serv_id='" + serv_id + '\'' +
                ", bic=" + bic +
                ", schet='" + schet + '\'' +
                ", corr_schet='" + corr_schet + '\'' +
                ", sys_message='" + sys_message + '\'' +
                ", pars=" + pars +
                '}';
    }
}
