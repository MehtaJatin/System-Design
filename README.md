## 🧱 Level 1: OOP & Design Pattern Exercises

| Status | Problem | Pattern/Concept | Resource Link | Notes |
| --- | --- | --- | --- | --- |
| ⬜ | Vending Machine | State, Strategy | [GeeksforGeeks](https://www.geeksforgeeks.org/state-design-pattern/) / [JavaRevisited](https://javarevisited.blogspot.com/2021/07/state-design-pattern-example-java-vending-machine.html) / [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/vending-machine.md) | Focus on state transitions and product inventory |
| ⬜ | Parking Lot | OOP Modeling | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-a-parking-lot.md) | Model vehicle types, slots, floors |
| ⬜ | Snake & Ladder | OOP, Random | [GitHub Example](https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-oops/snake-and-ladder.md) | Good for clean class design |
| ⬜ | Tic Tac Toe | MVC, Rules Engine | [GitHub Implementation](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/tic-tac-toe.md) | Handle winner detection logic |
| ⬜ | Logger | Singleton, COR | [RefactoringGuru](https://refactoring.guru/design-patterns/chain-of-responsibility/java/example) | Practice different logging levels |
| ⬜ | ATM Machine | Interface Segregation | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-an-atm.md) | Include Cash dispenser logic |
| ⬜ | Music Playlist | OOP, Queue, Shuffle | [InterviewBit](https://www.interviewbit.com/problems/design-jukebox/) | Handle shuffle, repeat, queueing songs |
| ⬜ | Cab Invoice Generator | OOP, Inheritance | [GeeksforGeeks](https://www.geeksforgeeks.org/uber-ola-cab-service-system-design/) | Use interface for fare strategy |
| ⬜ | Digital Wallet | OOP, Transaction History | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/digital-wallet.md) | Handle balance, add money, transfers |
| ⬜ | Calendar Reminder | OOP, Alarm Manager | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/CalendarApp.md) | Design reminder/recurrence logic |
| ⬜ | Book Management | CRUD, Inheritance | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/library-management-system.md) | ISBN, Authors, Tags |
| ⬜ | Chess Game | State, Command | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/chess.md) | Handle piece movements, check/checkmate logic |
| ⬜ | Library System | Observer, Composite | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-a-library-management-system.md) | Track books, members, and due dates |
| ⬜ | Elevator System | State, Strategy | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-an-elevator-system.md) | Handle floor requests, direction logic |
| ⬜ | Flight Booking | Factory, Decorator | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-an-airline-management-system.md) | Manage seats, meals, and baggage |
| ⬜ | Employee Management | Composite, Visitor | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/employee-management-system.md) | Departments, roles, and salary calculations |
| ⬜ | Car Rental System | Strategy, Observer | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-a-car-rental-system.md) | Dynamic pricing, availability notifications |
| ⬜ | Quiz App | Builder, Iterator | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/quiz-application.md) | Multiple question types, scoring logic |
| ⬜ | Restaurant Ordering | Command, Chain of Responsibility | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-a-restaurant-management-system.md) | Order workflow (kitchen, billing, delivery) |
| ⬜ | Hospital Management | Observer, Proxy | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/hospital-management-system.md) | Patient appointments, doctor schedules |
| ⬜ | E-Commerce Cart | Strategy, Composite | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/shopping-cart.md) | Discounts, bundles, and checkout |
| ⬜ | Text Editor | Command, Memento | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/text-editor.md) | Undo/Redo, text formatting |
| ⬜ | Traffic Light | State, Observer | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/traffic-light-system.md) | Signal timing, pedestrian crossing |
| ⬜ | Blackjack Game | Strategy, Factory | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/blackjack.md) | Card dealing, betting, game rules |
| ⬜ | Movie Theater | Composite, Factory | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/movie-theater-seating.md) | Seat selection, show scheduling |
| ⬜ | Online Exam | Template Method, State | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/OnlineExam.md) | Timer, question navigation |
| ⬜ | File System | Composite, Visitor | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/file-system.md) | Directory structure, permissions |
| ⬜ | Coffee Machine | State, Builder | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/coffee-machine.md) | Beverage selection, ingredient management |

## 🧰 Level 2: Reusable Components

| Status | Problem | Pattern/Concept | Resource Link | Notes |
| --- | --- | --- | --- | --- |
| ⬜ | Rate Limiter | Token Bucket / Leaky Bucket | [GitHub](https://github.com/donnemartin/system-design-primer#rate-limiter) | Try both fixed window & sliding |
| ⬜ | LRU Cache | LinkedHashMap, DS | [Baeldung](https://www.baeldung.com/java-lru-cache) / [GeeksforGeeks](https://www.geeksforgeeks.org/design-a-data-structure-for-lru-cache/) / [LeetCode](https://leetcode.com/problems/lru-cache/) | Try from scratch or use Java's collection |
| ⬜ | Config Manager | Singleton, Versioning | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/configuration-manager.md) | Config from file/db |
| ⬜ | Metrics Collector | Observer, Strategy | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/MetricsCollector.md) | Think about counters, histograms |
| ⬜ | Notification Service | Observer, Queue | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/notification-service.md) | Email/SMS push logic |
| ⬜ | URL Shortener | Hashing, DB schema | [GitHub](https://github.com/donnemartin/system-design-primer#design-a-url-shortener) | Handle collision, expiry logic |
| ⬜ | CSV Parser | FileReader, Split logic | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/csv-parser.md) | Add validation and mapping |
| ⬜ | RBAC System | Strategy, Role Mapping | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/role-based-access-control.md) | User-Role-Access relationship |
| ⬜ | Document Versioning | Snapshotting, Diff | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/DocumentVersioning.md) | Like Google Docs version history |
| ⬜ | Feature Toggle Manager | Singleton, Configs | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/feature-flag-system.md) | Enable/disable at runtime |
| ⬜ | Leaderboard System | Sorted Set, Ranking | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/leaderboard.md) | Support top-K, pagination |
| ⬜ | Captcha Validator | Security, Token | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/CaptchaSystem.md) | Generate + validate captcha codes |
| ⬜ | Auto-Save System | Timer, Debounce | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/auto-save-system.md) | Useful in form inputs like Docs |
| ⬜ | Thread Pool | Executor Service | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/ThreadPool.md) | Build custom ThreadPoolExecutor |
| ⬜ | Circuit Breaker | State, Retry Logic | [Martin Fowler](https://martinfowler.com/bliki/CircuitBreaker.html) | Fail-fast for external service failures |
| ⬜ | Distributed Lock | Singleton, Timeout | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/distributed-lock.md) | Prevent race conditions in distributed systems |
| ⬜ | Job Scheduler | Priority Queue, Cron | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/task-scheduler.md) | Recurring/one-time task execution |
| ⬜ | API Gateway | Proxy, Caching | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/APIGateway.md) | Auth, rate limiting, and request routing |
| ⬜ | Data Pipeline | Producer-Consumer, Batch | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/data-pipeline.md) | Chained processing (ETL) |
| ⬜ | Web Crawler | BFS, DFS, Politeness | [GitHub](https://github.com/donnemartin/system-design-primer#design-a-web-crawler) | URL frontier, duplicate detection |
| ⬜ | GraphQL Resolver | Caching, Lazy Loading | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/GraphQLResolver.md) | Nested query optimization |
| ⬜ | Payment Gateway | Adapter, Facade | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/payment-gateway.md) | Unified interface for multiple providers |
| ⬜ | A/B Testing Engine | Strategy, Stats | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/ab-testing-framework.md) | Feature rollout and metric tracking |
| ⬜ | Real-Time Dashboard | Pub-Sub, Caching | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/RealTimeDashboard.md) | Live updates with WebSockets |
| ⬜ | Connection Pool | Pool Pattern, Lifecycle | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/connection-pool.md) | Database connection management |
| ⬜ | Event Bus | Observer, Async | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/event-bus.md) | Pub-sub messaging system |
| ⬜ | Template Engine | Interpreter, Visitor | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/TemplateEngine.md) | Parse and render templates |
| ⬜ | Retry Mechanism | Decorator, Backoff | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/retry-mechanism.md) | Exponential backoff, circuit breaking |

## 🛠️ Level 3: Mid-Size Systems

| Status | Problem | Pattern/Concept | Resource Link | Notes |
| --- | --- | --- | --- | --- |
| ⬜ | Splitwise | Modeling, Debt Graph | [WorkAt.Tech](https://workat.tech/machine-coding/practice/splitwise-problem-6kob4sx3k7mj) | Track balances with graph approach |
| ⬜ | Trello | RBAC, Boards, Cards | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/trello.md) | Handle labels, permissions |
| ⬜ | WhatsApp | Message Queue, Delivery | [GitHub](https://github.com/donnemartin/system-design-primer#design-a-chat-service) | Sync, delivery receipts |
| ⬜ | Food Ordering System | Menu, Delivery, Inventory | [WorkAt.Tech](https://workat.tech/machine-coding/practice/food-ordering-system-oyvj48y7zlrx) | Handle restaurants, delivery matching |
| ⬜ | Movie Booking | Seat Locking, Booking | [WorkAt.Tech](https://workat.tech/machine-coding/practice/design-bookmyshow-vmg8086e7jps) | Concurrency handling |
| ⬜ | Uber | Location Match, Pricing | [GitHub](https://github.com/donnemartin/system-design-primer#design-uber) | Location, surge pricing |
| ⬜ | File Uploader | Chunking, Retry | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/file-uploader.md) | Resumable upload |
| ⬜ | Audit Trail Manager | Decorator, Event Log | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/AuditTrail.md) | Useful in fintech, compliance systems |
| ⬜ | Banking System | Account, Txn Logic | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/banking-system.md) | Withdrawals, deposits, txns |
| ⬜ | Document Sharing | ACL, Link Sharing | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/document-sharing.md) | Permissions + public/private links |
| ⬜ | Inventory System | Stock Update, Alerts | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/inventory-management.md) | Track restock alerts |
| ⬜ | Helpdesk Ticketing | Queue, Escalation | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/helpdesk-ticketing.md) | Priorities + escalation |
| ⬜ | E-Learning Platform | Composite, Observer | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/e-learning-platform.md) | Courses, progress tracking, notifications |
| ⬜ | Stock Portfolio | Observer, Proxy | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/stock-portfolio.md) | Real-time stock prices, trade execution |
| ⬜ | Hotel Management | State, Strategy | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-a-hotel-management-system.md) | Room booking, pricing, cancellations |
| ⬜ | Airline Check-In | Queue, State | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/airline-check-in.md) | Seat allocation, boarding passes |
| ⬜ | Social Media Posts | Decorator, Memento | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/social-media-feed.md) | Edit history, post formatting |
| ⬜ | Bug Tracking System | State, Observer | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/bug-tracking-system.md) | Ticket lifecycle, assignee workflows |
| ⬜ | Gym Membership | Strategy, Proxy | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/gym-membership.md) | Membership tiers, access control |
| ⬜ | Auction System | Observer, State | [GitHub](https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-an-online-stock-brokerage-system.md) | Bidding, timers, winner selection |
| ⬜ | CRM System | Command, Facade | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/crm-system.md) | Lead management, follow-up reminders |
| ⬜ | IoT Device Manager | Command, Proxy | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/iot-device-manager.md) | Remote control, status updates |
| ⬜ | Online Forum | Composite, Observer | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/online-forum.md) | Threads, replies, moderation |
| ⬜ | Video Streaming | Strategy, Adapter | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/video-streaming.md) | Quality adaptation, buffering |
| ⬜ | Task Management | Command, State | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/task-management.md) | Projects, assignments, deadlines |
| ⬜ | Messaging App | Observer, Chain | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/messaging-app.md) | Groups, encryption, file sharing |
| ⬜ | Code Review System | State, Observer | [GitHub](https://github.com/ashishps1/awesome-low-level-design/blob/main/problems/code-review-system.md) | Pull requests, approvals, comments |

## 🚀 Level 4: Scalable System Designs

| Status | Problem | Pattern/Concept | Resource Link | Notes |
| --- | --- | --- | --- | --- |
| ⬜ | Instagram | Feed Gen, Sharding | [GitHub](https://github.com/donnemartin/system-design-primer#design-the-facebook-news-feed) | Pull vs push feed |
| ⬜ | YouTube | Video Processing, CDN | [GitHub](https://github.com/donnemartin/system-design-primer#design-youtube-or-netflix) | Chunked uploads |
| ⬜ | Twitter | Timeline Fanout | [GitHub](https://github.com/donnemartin/system-design-primer#design-the-twitter-timeline-and-search) | Scale timeline |
| ⬜ | Amazon | Cart, Inventory, Checkout | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Payment flow, inventory |
| ⬜ | Google Docs | Real-Time Sync | [GitHub](https://github.com/prasadgujar/low-level-design-primer/blob/master/solutions/GoogleDocs.md) | OT / CRDT |
| ⬜ | Kafka-like Log Service | Append-only Log System | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Partition, replication |
| ⬜ | Travel Booking | Flights, Hotels | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Cancel policy, itinerary |
| ⬜ | Freelancing Platform | Profiles, Ratings | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Bidding system |
| ⬜ | Trading System | Order Matching Engine | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Bid/Ask Engine |
| ⬜ | Cloud Storage System | ACL, Versioning | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | File permissions + sync |
| ⬜ | Task Queue | Worker Pool, Retry Logic | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Retry, Dead-letter Queue |
| ⬜ | Email Scheduler | Cron + Retry Logic | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Schedule + bounce retry |
| ⬜ | Netflix-like Recommender | Collaborative Filtering, Caching | [GitHub](https://github.com/donnemartin/system-design-primer#design-a-recommendation-system) | Personalized content suggestions |
| ⬜ | Spotify Playback | Distributed Queue, Consensus | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Sync across devices, offline mode |
| ⬜ | Slack-like Messaging | Pub-Sub, WebSockets | [GitHub](https://github.com/donnemartin/system-design-primer#design-a-chat-service) | Channels, threads, and search |
| ⬜ | Dropbox File Sync | Conflict Resolution, CDN | [GitHub](https://github.com/donnemartin/system-design-primer#design-dropbox) | Handle offline edits and merges |
| ⬜ | Uber Eats | Geolocation, Event Sourcing | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Live order tracking, delivery ETA |
| ⬜ | Airbnb Booking | Availability Calendar, Search | [GitHub](https://github.com/donnemartin/system-design-primer#design-airbnb-or-a-hotel-booking-service) | Dynamic pricing, instant booking |
| ⬜ | Stock Exchange | Event Sourcing, CQRS | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Order matching with low latency |
| ⬜ | Healthcare Records | Blockchain, Access Control | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Audit trails, patient data sharing |
| ⬜ | Multiplayer Game Server | State Sync, Lag Compensation | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Real-time player interactions |
| ⬜ | AdTech Bidder | Real-Time Bidding, Cache | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Low-latency auction decisions |
| ⬜ | Zoom Video Conferencing | WebRTC, Load Balancing | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Screen sharing, recording |
| ⬜ | GitHub Code Repository | Version Control, Merge | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Branch management, CI/CD |
| ⬜ | Ride Sharing Analytics | Stream Processing, ML | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Demand prediction, pricing |
| ⬜ | Food Delivery Tracking | Geolocation, Real-time | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Driver tracking, ETA updates |
| ⬜ | Search Engine | Crawling, Indexing, Ranking | [GitHub](https://github.com/donnemartin/system-design-primer#design-a-search-engine) | Page rank, autocomplete |
| ⬜ | Live Streaming | CDN, Transcoding | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Multiple quality streams |

## 🌌 Level 5: Advanced Distributed Systems

| Status | Problem | Pattern/Concept | Resource Link | Notes |
| --- | --- | --- | --- | --- |
| ⬜ | Distributed Cache | Consistent Hashing, Gossip | [GitHub](https://github.com/donnemartin/system-design-primer#design-a-cache-system) | Like Redis Cluster |
| ⬜ | Global ID Generator | Snowflake, UUID | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Unique IDs across DCs |
| ⬜ | Sharded Database | Partitioning, Query Routing | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Horizontal scaling |
| ⬜ | Consensus Algorithm | Paxos/Raft | [Raft](https://raft.github.io/) | Leader election, log replication |
| ⬜ | Distributed File Store | Erasure Coding, Replication | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Like HDFS |
| ⬜ | Service Mesh | Sidecar Proxy, Circuit Breaker | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Istio/Linkerd-like |
| ⬜ | Real-Time Analytics | Lambda Architecture, Stream Processing | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Batch + Stream |
| ⬜ | ML Model Serving | Canary Deployments, A/B Tests | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Rolling updates |
| ⬜ | Blockchain Lite | Merkle Trees, PoW/PoS | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Mini-Bitcoin clone |
| ⬜ | Global Load Balancer | Anycast, GeoDNS | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Traffic steering |
| ⬜ | Time Series Database | Compression, Indexing | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Metrics storage, querying |
| ⬜ | Message Queue System | Partitioning, Ordering | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Like Apache Kafka |
| ⬜ | Distributed Scheduler | Consensus, Fault Tolerance | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Cron across clusters |
| ⬜ | CDN System | Edge Caching, Invalidation | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Global content delivery |
| ⬜ | Event Sourcing System | CQRS, Snapshots | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Audit trail, replay |
| ⬜ | Search Index | Inverted Index, Sharding | [GitHub](https://github.com/ashishps1/awesome-system-design-resources) | Distributed search |

## 📚 Additional Learning Resources

### Comprehensive Guides

- [System Design Primer](https://github.com/donnemartin/system-design-primer) - Complete system design guide
- [Awesome System Design Resources](https://github.com/ashishps1/awesome-system-design-resources) - Curated resources
- [Low Level Design Primer](https://github.com/prasadgujar/low-level-design-primer) - Object-oriented design focus
- [System Design Interview Guide](https://github.com/karanpratapsingh/system-design) - Interview preparation

### Practice Platforms