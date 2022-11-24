package lv.majormarket.menu.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import lv.majormarket.menu.model.MenuItem;

public interface MenuItemRepo extends JpaRepository<MenuItem, Long> {
    public void deleteItemById(Long id);
    public Optional<MenuItem> findItemById(Long id);
}
