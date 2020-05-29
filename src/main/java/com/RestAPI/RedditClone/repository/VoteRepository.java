package com.RestAPI.RedditClone.repository;


import com.RestAPI.RedditClone.model.Post;
import com.RestAPI.RedditClone.model.User;
import com.RestAPI.RedditClone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
