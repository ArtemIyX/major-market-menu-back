package lv.majormarket.menu.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lv.majormarket.menu.exception.MenuItemNotFoundException;
import lv.majormarket.menu.model.MenuItem;
import lv.majormarket.menu.repo.MenuItemRepo;

@Service
public class MenuItemService {
    private final MenuItemRepo menuItemRepo;

    @Autowired
    public MenuItemService(MenuItemRepo menuItemRepo) {
        this.menuItemRepo = menuItemRepo;
    }

    public MenuItem addItem(MenuItem item) {
        item.setCode(UUID.randomUUID().toString());
        return menuItemRepo.save(item);
    }

    public List<MenuItem> findAllMenuItems() {
        return menuItemRepo.findAll();
    }

    public MenuItem updateItem(MenuItem item) {
        return menuItemRepo.save(item);
    }

    public MenuItem findById(Long id) {
        return menuItemRepo.findItemById(id)
                .orElseThrow(() -> new MenuItemNotFoundException("Menu item with id " + id + " was not found"));
    }

    public void removeItem(Long id) {
        menuItemRepo.deleteItemById(id);
    }
}
