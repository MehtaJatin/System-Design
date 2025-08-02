# 🔗 URL Shortener

A simple Java-based URL shortener service that encodes long URLs into 8-character Base62 short codes, simulating how services like Bitly work. The project uses in-memory storage and is multithread-safe with simulation for large-scale traffic.

---

## 🚀 Features

- ✅ Converts long URLs into short, 8-character Base62 strings
- ✅ Ensures uniqueness using atomic ID generation
- ✅ Optional offset for prettier short codes (e.g., avoid "00000000")
- ✅ Bidirectional lookup: encode & decode
- ✅ Simulation for 1 million unique URL shortenings with performance/mismatch check

---

## 🧱 Code Structure

org.problems.urlShortning/
├── Base62Encoder.java # Encodes/decodes long ID into Base62 string
├── Shortner.java # Core logic to shorten and expand URLs
├── URLMappingDaoImpl.java # In-memory DAO to store URL <-> ID mapping
├── URlMappingDAO.java # DAO interface
├── Main.java # Sample demo
└── ShortenerSimulator.java # Multithreaded test simulator

yaml
Copy
Edit

---

## 🧪 How It Works

1. A unique `id` is generated using `AtomicInteger`.
2. The ID is **offset** (default: 1,000,000) to avoid short codes like `00000000`.
3. It is then encoded into a Base62 string and **left-padded** to ensure exactly 8 characters.
4. Both long-to-id and id-to-long mappings are stored.
5. Reverse lookup decodes the short code, removes offset, and returns the long URL.

---

## 📦 Example

```java
shortener.shorten("https://www.google.com", "user1");
// Output: www.shortner.com/00004c92

shortener.getLongUrl("00004c92");
// Output: https://www.google.com
⚡ Simulator Output
The simulator tests:

1 million unique URLs

10 threads, each shortening 100,000 URLs

Validates uniqueness of short codes

Verifies that decoding returns the original long URL

bash
Copy
Edit
✅ Total unique short codes: 1000000
❌ Duplicates found: 0
⚠️  Mismatches in decoding: 0
⏱ Time taken: 5XXXms