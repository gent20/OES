package com.OES.onlineexamsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean eshteAdmin;
    private String emri;
    private String mbiemri;
    private String email;
    private String vendi_lindjes;
    private LocalDate dataLindjes;
    private Character gjinia;

    public User() {
    }

    public User(boolean eshteAdmin, String emri, String mbiemri, String email, String vendi_lindjes, LocalDate dataLindjes, Character gjinia) {
        this.eshteAdmin = eshteAdmin;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.email = email;
        this.vendi_lindjes = vendi_lindjes;
        this.dataLindjes = dataLindjes;
        this.gjinia = gjinia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getEshteAdmin() {
        return admin;
    }

    public void setEshteAdmin(boolean eshteAdmin) {
        this.eshteAdmin = eshteAdmin;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVendi_lindjes() {
        return vendi_lindjes;
    }

    public void setVendi_lindjes(String vendi_lindjes) {
        this.vendi_lindjes = vendi_lindjes;
    }

    public LocalDate getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(LocalDate dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", eshteAdmin=" + eshteAdmin +
                ", emri='" + emri + '\'' +
                ", mbiemri='" + mbiemri + '\'' +
                ", email='" + email + '\'' +
                ", vendi_lindjes='" + vendi_lindjes + '\'' +
                ", dataLindjes=" + dataLindjes +
                ", gjinia=" + gjinia +
                '}';
    }
}
