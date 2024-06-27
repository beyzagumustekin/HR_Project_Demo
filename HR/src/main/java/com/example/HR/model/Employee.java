package com.example.HR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.property.access.spi.Getter;
import org.hibernate.property.access.spi.Setter;

@Entity //bu sınıfın model sınıfı olduğunu belirtiyor.
public class Employee {


    @Id //Bu anotasyon 'ıd' alanının birincil anahtar olduğunu belirtir.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Bu,"ıd" alanının olarak artıralacağını belirtir.

    private Long Id; //Çalışanın benzersiz kimliği
    private String name; //Çalışanın adı
    private String position; //Çalışanın pozisyonu

    //Getter ve Setter metotları
    //Getter, özel alanların değerini okumak için kullanılır.
    //Setter, özel alanların değerini ayarlamak için kullanılır.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}
