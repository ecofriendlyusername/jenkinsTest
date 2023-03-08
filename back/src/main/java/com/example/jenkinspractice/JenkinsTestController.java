package com.example.jenkinspractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
// d
@RestController
public class JenkinsTestController {

    @Autowired
    TestRepo testRepo;

    @GetMapping("/helloworld")
    public ResponseEntity<?> helloWorld() {
        System.out.println("hello world ! ");
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }

    @GetMapping("/helloworld/setmyname/{myname}")
    public ResponseEntity<?> putMyName(@PathVariable String myname) {
        TestEntity testEntity = new TestEntity();
        testEntity.setName(myname);
        testRepo.save(testEntity);
        return new ResponseEntity<String>("Done",HttpStatus.OK);
    }

    @GetMapping("/helloworld/getmyname/{myname}")
    public ResponseEntity<?> getMyName(@PathVariable String myname) {
        TestEntity testEntity = (TestEntity) testRepo.findByName(myname);
        String a = testEntity.getId().toString() + testEntity.getName();
        return new ResponseEntity<String>(a,HttpStatus.OK);
    }
}
