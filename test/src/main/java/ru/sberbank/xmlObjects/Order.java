package ru.sberbank.xmlObjects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "")
public class Order {

    private Services services;

    private String summa;

    public String getSumma() {
        return summa;
    }

    public void setSumma(String summa) {
        this.summa = summa;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "XmlObgects.Order{" +
                "services=" + services +
                ", summa='" + summa + '\'' +
                '}';
    }
}


