package com.example.HR.model.repository;

import com.example.HR.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository  // Bu anotasyon bu sınıfın bir Spring veritabanı deposu olduğu belirtir.
public interface EmployeeRepossitory extends JpaRepository<Employee, Long> {
}

//JPA--->CRUD işlemleri için gerekli metodları sağlar.
