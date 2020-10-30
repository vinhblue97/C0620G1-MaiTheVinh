package com.vinhblue.model.repository;

import com.vinhblue.model.entity.BookManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookManagement, Integer> {
}
