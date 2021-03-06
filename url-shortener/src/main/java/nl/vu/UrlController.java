package nl.vu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

/**
 * @author lngtr
 * @since 2018-04-05
 */
@RestController
public class UrlController {

    private final UrlService urlService;

    @Autowired
    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/{id}")
    public void get(HttpServletResponse response, @PathVariable("id") Long id) throws IOException {
        response.sendRedirect(urlService.getUrl(id));
    }

    @PutMapping("/{id}")
    public void put(@PathVariable("id") Long id, @RequestParam("url") String url) {
        urlService.update(id, url);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        urlService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    public Set<Long> get() {
        return urlService.getKeys();
    }

    @PostMapping
    public ResponseEntity<Void> post(@RequestParam("url") String url) throws URISyntaxException {
        long id = urlService.addUrl(url);
        return ResponseEntity.created(new URI("/" + id)).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        urlService.deleteAll();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
