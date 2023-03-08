package com.example.jenkinspractice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jenkinspractice.TestEntity;


@Repository
public interface TestRepo extends JpaRepository<TestEntity,Long> {
    TestEntity findByName(String myname);
}
