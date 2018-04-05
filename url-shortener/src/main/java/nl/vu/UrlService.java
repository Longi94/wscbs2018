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

    public String getUrl(String strId) {
        Long id;

        try {
            id = Long.valueOf(strId);
        } catch (NumberFormatException e) {
            throw new NotFoundException("id not found");
        }

        String url = urls.get(id);

        if (url == null) {
            throw new NotFoundException("id not found");
        }

        return url;
    }

    public void delete(String strId) {
        Long id;

        try {
            id = Long.valueOf(strId);
        } catch (NumberFormatException e) {
            throw new NotFoundException("id not found");
        }

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
}
