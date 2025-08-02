package org.problems.urlShortning;

import lombok.NonNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class URLMappingDaoImpl implements URlMappingDAO {
    private final Map<String, Long> longUrlToIdMapping = new ConcurrentHashMap<>();
    private final Map<Long, String> idToLongUrlMapping = new ConcurrentHashMap<>();

    volatile AtomicInteger id = new AtomicInteger(0);

    /**
     * @param url
     * @param user
     * @return
     */
    @Override
    public long insert(@NonNull final String url, @NonNull final String user) {
        if (longUrlToIdMapping.containsKey(url)) {
            System.out.println("URL already exists: " + url);
            return longUrlToIdMapping.get(url);
        }
        System.out.println("Inserting URL: " + url);
        long id = this.id.getAndIncrement();
        longUrlToIdMapping.put(url,id);
        idToLongUrlMapping.put(id, url);
        return id;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public String getLongUrl(@NonNull final long id) {
        return idToLongUrlMapping.get(id);
    }
}
