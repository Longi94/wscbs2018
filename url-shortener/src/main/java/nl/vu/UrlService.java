package nl.vu;

import nl.vu.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lngtr
 * @since 2018-04-05
 */
@Service
public class UrlService {

    private long counter = 0;

    private Map<Long, String> urls = new HashMap<>();

    public String getUrl(Long id) {
        String url = urls.get(id);

        if (url == null) {
            throw new NotFoundException("id not found");
        }

        return url;
    }

    public void delete(Long id) {
        if (!urls.containsKey(id)) {
            throw new NotFoundException("id not found");
        }

        urls.remove(id);
    }

    public Set<Long> getKeys() {
        return urls.keySet();
    }

    public long addUrl(String url) {
        long id = counter++;
        urls.put(id, url);
        return id;
    }

    public void deleteAll() {
        urls.clear();
    }

    public void update(Long id, String url) {
        if (!urls.containsKey(id)) {
            throw new NotFoundException("id not found");
        }

        urls.put(id, url);
    }
}
