package ru.sberbank.xmlObjects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "services")
public class Services {
    @JacksonXmlProperty(localName = "serv")
    private Serv serv;

    public Serv getServ() {
        return serv;
    }

    public void setServ(Serv serv) {
        this.serv = serv;
    }

    @Override
    public String toString() {
        return "XmlObgects.Services{" +
                "serv=" + serv +
                '}';
    }
}
