package com.example.server;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PicturesRepository extends MongoRepository<Pictures, ObjectId> {
    Optional<Pictures> findPicturesByPictureID(String pictureID);
}
