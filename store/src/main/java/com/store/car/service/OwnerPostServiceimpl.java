package com.store.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.car.dto.OwnerPostDTO;
import com.store.car.entity.OwnerPostEntity;
import com.store.car.repository.OwnerPostRepository;

@Service
public class OwnerPostServiceimpl implements OwnerPostService {

    @Autowired
    private OwnerPostRepository ownerPostRepository;

    @Override
    public void createOwnerPost(OwnerPostDTO ownerPostDTO) {
        OwnerPostEntity ownerPost = new OwnerPostEntity();

        ownerPost.setName(ownerPostDTO.getName());
        ownerPost.setContactNumber(ownerPostDTO.getContactNumber());
        ownerPost.setType(ownerPostDTO.getType());

        ownerPostRepository.save(ownerPost);
    }
}
