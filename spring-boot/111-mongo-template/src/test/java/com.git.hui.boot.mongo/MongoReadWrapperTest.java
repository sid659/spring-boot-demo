package com.git.hui.boot.mongo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.git.hui.boot.mongo.wrapper.MongoAddWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jiangxg
 * @version 2019/11/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoReadWrapperTest {

    @Autowired
    private MongoAddWrapper mongoAddWrapper;

    @Test
    public void insertTest() {
        mongoAddWrapper.insert();
    }

    @Test
    public void insertManyTest() throws JsonProcessingException {
        mongoAddWrapper.insertMany();
    }
}
