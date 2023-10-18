package me.kbh.querydslapplication.repository;

import me.kbh.querydslapplication.entity.Hello;
import me.kbh.querydslapplication.repository.custom.CustomHelloRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, Long>, CustomHelloRepository {
}
