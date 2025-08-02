package org.problems.urlShortning;

public interface URlMappingDAO {
    long insert(String url, String user);
    String getLongUrl(long id);
}
