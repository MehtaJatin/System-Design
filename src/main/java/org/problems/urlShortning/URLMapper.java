package org.problems.urlShortning;

public class URLMapper {

    private final URlMappingDAO urlMappingDao = new URLMappingDaoImpl();
    private static final long ID_OFFSET = 1_000_000L;

    public String shorten(String url, String user) {
        long id = urlMappingDao.insert(url, user);
        System.out.println("DB ID: " + id);
        String code = Base62Encoder.encode(id + ID_OFFSET);
        return "www.shortner.com/" + code;
    }

    public String getLongUrl(String shortUrl) {
        String code = shortUrl.replace("www.shortner.com/", "");
        long id = Base62Encoder.decode(code) - ID_OFFSET;
        return urlMappingDao.getLongUrl(id);
    }
}
