/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafale.vcard.gen;

/**
 *
 * @author Erdna
 */
public class VCard {
    
    private String name = "";
    private String surname = "";
    private String phone = "";
    private String email = "";
    private String job = "";
    
    private final String organism = "Rafale - ETS";
    private final String emailEnd = "@ens.etsmtl.ca";
    
    private final String vCardBegin = "BEGIN:VCARD";
    private final String vCardVersion = "\nVERSION:3.0";
    private final String vCardFormatedName = "\nFN;CHARSET=UTF-8:"; // + Surname Name
    private final String vCardName = "\nN;CHARSET=UTF-8:"; //Name + ';' + Surname
    private final String vCardNameEnd = ";;;";
    private final String vCardEmail = "\nEMAIL;CHARSET=UTF-8;type=WORK,INTERNET:"; //+ email
    private final String vCardPhone = "\nTEL;TYPE=CELL:"; // + unformated phone # (eg: 4501234567)
    private final String vCardJob = "\nTITLE;CHARSET=UTF-8:"; // + job title
    private final String vCardOrg = "\nORG;CHARSET=UTF-8:"; // + organism
    private final String vCardEnd = "\nEND:VCARD\n";
    
    public VCard(){
        
    }
    
    public VCard(String name, String surname, String phone, String emailStub, String job){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = emailStub + this.emailEnd;
        this.job = job;
    }
    
    String getName() { return this.name; }
    String getSurname() { return this.surname; }
    String getPhone() { return this.phone; }
    String getFormatedPhone() {
        String forPhone = "(";
        
        forPhone += this.phone.substring(0, 3);
        forPhone += ") ";
        forPhone += this.phone.substring(3, 6);
        forPhone += "-";
        forPhone += this.phone.substring(6, 10);
        
        return forPhone;
    }
    String getEmail() { return this.email; }
    String getJob() { return this.job; }
    String getOrganism() { return this.organism; }
    
    void setName(String name) { this.name = name; }
    void setSurname(String surname) { this.surname = surname; }
    void setPhone(String phone) { this.phone = phone; }
    void setEmail(String emailStub) { this.email = email + this.emailEnd; }
    void setJob(String job) { this.job = job; }
    
    String getAsString(){
        String vCard = "";
        
        vCard += this.vCardBegin;
        vCard += this.vCardVersion;
        vCard += (this.vCardFormatedName + this.surname + " " + this.name);
        vCard += (this.vCardName + this.name + ";" + this.surname + this.vCardNameEnd);
        vCard += (this.vCardEmail + this.email);
        vCard += (this.vCardPhone + this.phone);
        vCard += (this.vCardJob + this.job);
        vCard += (this.vCardOrg + this.organism);
        vCard += this.vCardEnd;
        
        return vCard;
    }
        
}
