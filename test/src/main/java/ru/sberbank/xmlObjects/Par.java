package ru.sberbank.xmlObjects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "pars")
public class Par {

    @JacksonXmlProperty(localName = "step", isAttribute = true)
    private String step;

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    private String name;

    @JacksonXmlProperty(localName = "fullname", isAttribute = true)
    private String fullname;

    @JacksonXmlProperty(localName = "comment", isAttribute = true)
    private String comment;

    @JacksonXmlProperty(localName = "isEditable", isAttribute = true)
    private String isEditable;

    @JacksonXmlProperty(localName = "isScanable", isAttribute = true)
    private String isScanable;

    @JacksonXmlProperty(localName = "isVisible", isAttribute = true)
    private String isVisible;

    @JacksonXmlProperty(localName = "isRequired", isAttribute = true)
    private String isRequired;

    @JacksonXmlProperty(localName = "isPrinted", isAttribute = true)
    private String isPrinted;

    @JacksonXmlProperty(localName = "isValidateOnLine", isAttribute = true)
    private String isValidateOnLine;

    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    @JacksonXmlProperty(localName = "min_length", isAttribute = true)
    private String min_length;

    @JacksonXmlProperty(localName = "max_length", isAttribute = true)
    private String max_length;

    @JacksonXmlProperty(localName = "double_input", isAttribute = true)
    private String double_input;

    @JacksonXmlProperty(localName = "value", isAttribute = true)
    private String value;

    @JacksonXmlProperty(localName = "reg_exp", isAttribute = true)
    private String reg_exp;

    @JacksonXmlProperty(localName = "from_debt", isAttribute = true)
    private String from_debt;

    @JacksonXmlProperty(localName = "par_list")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ParList> par_list = new ArrayList<>();

    public List<ParList> getPar_list() {
        return par_list;
    }

    public void setPar_list(List<ParList> par_list) {
        this.par_list = par_list;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(String isEditable) {
        this.isEditable = isEditable;
    }

    public String getIsScanable() {
        return isScanable;
    }

    public void setIsScanable(String isScanable) {
        this.isScanable = isScanable;
    }

    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }

    public String getIsPrinted() {
        return isPrinted;
    }

    public void setIsPrinted(String isPrinted) {
        this.isPrinted = isPrinted;
    }

    public String getIsValidateOnLine() {
        return isValidateOnLine;
    }

    public void setIsValidateOnLine(String isValidateOnLine) {
        this.isValidateOnLine = isValidateOnLine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMin_length() {
        return min_length;
    }

    public void setMin_length(String min_length) {
        this.min_length = min_length;
    }

    public String getMax_length() {
        return max_length;
    }

    public void setMax_length(String max_length) {
        this.max_length = max_length;
    }

    public String getDouble_input() {
        return double_input;
    }

    public void setDouble_input(String double_input) {
        this.double_input = double_input;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getReg_exp() {
        return reg_exp;
    }

    public void setReg_exp(String reg_exp) {
        this.reg_exp = reg_exp;
    }

    public String getFrom_debt() {
        return from_debt;
    }

    public void setFrom_debt(String from_debt) {
        this.from_debt = from_debt;
    }

    @Override
    public String toString() {
        return "XmlObgects.Par{" +
                "step='" + step + '\'' +
                ", name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", comment='" + comment + '\'' +
                ", isEditable='" + isEditable + '\'' +
                ", isScanable='" + isScanable + '\'' +
                ", isVisible='" + isVisible + '\'' +
                ", isRequired='" + isRequired + '\'' +
                ", isPrinted='" + isPrinted + '\'' +
                ", isValidateOnLine='" + isValidateOnLine + '\'' +
                ", type='" + type + '\'' +
                ", min_length='" + min_length + '\'' +
                ", max_length='" + max_length + '\'' +
                ", double_input='" + double_input + '\'' +
                ", value='" + value + '\'' +
                ", reg_exp='" + reg_exp + '\'' +
                ", from_debt='" + from_debt + '\'' +
                ", par_list=" + par_list +
                '}';
    }
}
