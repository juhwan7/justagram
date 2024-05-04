package com.example.justagram.Repository;

import com.example.justagram.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
