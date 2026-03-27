📖 Gita API — Spring Boot Backend

A RESTful API built using Spring Boot that provides access to structured Bhagavad Gita shlokas, allowing users to fetch chapters, verses, and search content efficiently.

🚀 Live API

👉 https://gita-api-1.onrender.com

✨ Features
📜 Fetch shlokas chapter-wise
🔍 Search shlokas using keywords
⚡ Fast and optimized REST API responses
🌐 Deployed and accessible via public endpoint
📦 JSON-based responses for easy integration
🛠️ Tech Stack
Backend: Java, Spring Boot
Architecture: REST API
Deployment: Render
Tools: Postman, Git
📡 API Endpoints
1️⃣ Get Shlok by ID
GET /shlok/{id}

📌 Example:

https://gita-api-1.onrender.com/shlok/1

2️⃣ Get Shlokas by Chapter
GET /chapter/{chapterNumber}

📌 Example:

/chapter/1
3️⃣ Search Shlokas by Keyword
GET /search?keyword={word}

📌 Example:

/search?keyword=karma
📊 Sample Response
[
  {
    "chapter": 1,
    "verse": 1,
    "slok": "धृतराष्ट्र उवाच |\nधर्मक्षेत्रे कुरुक्षेत्रे समवेता युयुत्सवः |\nमामकाः पाण्डवाश्चैव किमकुर्वत सञ्जय ||१-१||",
    "transliteration": "dhṛtarāṣṭra uvāca .\ndharmakṣetre kurukṣetre samavetā yuyutsavaḥ .\nmāmakāḥ pāṇḍavāścaiva kimakurvata sañjaya ||1-1||",
    "tej": {
      "author": "Swami Tejomayananda",
      "ht": "।।1.1।।धृतराष्ट्र ने कहा -- हे संजय ! धर्मभूमि कुरुक्षेत्र में एकत्र हुए युद्ध के इच्छुक (युयुत्सव:) मेरे और पाण्डु के पुत्रों ने क्या किया?"
    },
    "siva": {
      "author": "Swami Sivananda",
      "et": "1.1 Dhritarashtra said  What did my people and the sons of Pandu do when they had assembled\ntogether eager for battle on the holy plain of Kurukshetra, O Sanjaya.",
      "ec": "1.1 धर्मक्षेत्रे on the holy plain? कुरुक्षेत्रे in Kurukshetra? समवेताः assembled together? युयुत्सवः desirous to fight? मामकाः my people? पाण्डवाः the sons of Pandu? च and? एव also? किम् what? अकुर्वत did do? सञ्जय O Sanjaya.Commentary Dharmakshetra -- that place which protects Dharma is Dharmakshetra. Because it was in the land of the Kurus? it was called Kurukshetra.Sanjaya is one who has conered likes and dislikes and who is impartial."
    },........
    }
    
⚙️ How to Run Locally

1. Clone the repository
git clone https://github.com/LordsOwnAcc/gita-api.git
cd gita-api

2. Run the application
./mvnw spring-boot:run

3. Access API
http://localhost:8080

🧪 Testing
Tested using Postman
Verified endpoints for:
Correct responses
Error handling
Performance

📈 Future Improvements
Add authentication (JWT-based)
Add pagination for large data
Improve search with NLP
Add caching for faster responses

👨‍💻 Author
Sumit Yadav

GitHub: https://github.com/LordsOwnAcc
LinkedIn: https://linkedin.com/in/sumit-rajesh-yadav

🙏 Acknowledgements
This project uses Bhagavad Gita data sourced from the Vedic Scriptures GitHub repository.
I sincerely thank the contributors for making this dataset publicly available.

⭐ If you like this project
Give it a ⭐ on GitHub and feel free to contribute!
