package org.problems.urlShortning;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class UrlShortenerSimulator {

    private static final int THREAD_COUNT = 10;
    private static final int URLS_PER_THREAD = 100_000;

    public static void main(String[] args) throws InterruptedException {
        Set<String> shortCodes = ConcurrentHashMap.newKeySet();
        Map<String, String> codeToOriginalUrl = new ConcurrentHashMap<>();
        URLMapper shortner = new URLMapper();
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        long startTime = System.currentTimeMillis();

        CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
        AtomicInteger duplicateCount = new AtomicInteger(0);
        AtomicInteger mismatchCount = new AtomicInteger(0);

        for (int i = 0; i < THREAD_COUNT; i++) {
            int threadId = i;
            executor.submit(() -> {
                try {
                    for (int j = 0; j < URLS_PER_THREAD; j++) {
                        String longUrl = "https://example.com/" + threadId + "/" + j;
                        String shortUrl = shortner.shorten(longUrl, "user");
                        System.out.println("Short URL: " + shortUrl);
                        System.out.println();
                        if (!shortCodes.add(shortUrl)) {
                            duplicateCount.incrementAndGet();
                        }

                        codeToOriginalUrl.put(shortUrl, longUrl);

                        String decoded = shortner.getLongUrl(shortUrl);
                        if (!longUrl.equals(decoded)) {
                            mismatchCount.incrementAndGet();
                            System.err.println("❌ Mismatch: " + longUrl + " ≠ " + decoded);
                        }
                    }
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();
        executor.shutdown();

        long endTime = System.currentTimeMillis();
        System.out.println("✅ Total unique short codes: " + shortCodes.size());
        System.out.println("❌ Duplicates found: " + duplicateCount.get());
        System.out.println("⚠️  Mismatches in decoding: " + mismatchCount.get());
        System.out.println("⏱ Time taken: " + (endTime - startTime) + "ms");
    }
}
