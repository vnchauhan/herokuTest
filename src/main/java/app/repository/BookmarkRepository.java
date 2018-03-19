package app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	Collection<Bookmark> findByAccountUsername(String username);
}