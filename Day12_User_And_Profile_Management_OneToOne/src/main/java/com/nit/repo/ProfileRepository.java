package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
