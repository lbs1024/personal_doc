package com.xml.controller;

import com.xml.entity.Pet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lbs
 * @description 使用@PathVariable 和 @ModelAttribute 注解进行参数绑定
 */
@RestController
public class RestfulController {

    @GetMapping("restful/owners/{ownerId}/{petId}")
    public void get(@PathVariable String ownerId, @PathVariable String petId) {
        System.out.println("ownerId: " + ownerId);
        System.out.println("petId: " + petId);
    }

    @GetMapping("restful2/owners/{ownerId}/pets/{petId}")
    public void get(@ModelAttribute Pet pet) {
        System.out.println("ownerId: " + pet.getOwnerId());
        System.out.println("petId: " + pet.getPetId());
    }
}
