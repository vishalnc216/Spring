package com.example.myapp.topics;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class TopicsController {
    @RequestMapping("/Topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("1","React","React description"),
                new Topic("2","Spring","Spring description")
        );
    }
}
