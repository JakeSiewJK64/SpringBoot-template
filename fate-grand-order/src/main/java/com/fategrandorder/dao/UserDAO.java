package com.fategrandorder.dao;

import com.fategrandorder.model.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    public UserModel findUserByUserName(String username) {
        return this.mongoTemplate.findOne(new Query(new Criteria("UserName").is(username)), UserModel.class);
    }
}
