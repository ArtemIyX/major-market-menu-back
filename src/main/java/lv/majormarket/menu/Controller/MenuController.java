package lv.majormarket.menu.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lv.majormarket.menu.model.MenuItem;
import lv.majormarket.menu.service.MenuItemService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/menu")
public class MenuController {
    private final MenuItemService menuItemService;

    public MenuController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<MenuItem>> getAllItems() {
        List<MenuItem> res = menuItemService.findAllMenuItems();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<MenuItem> getMethodName(@PathVariable("id") Long id) {
        MenuItem item = menuItemService.findById(id);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
    
}
