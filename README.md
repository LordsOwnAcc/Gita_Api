# 📖 Gita API

A Spring Boot REST API that provides structured access to Bhagavad Gita shlokas, enabling users to fetch chapters, verses, and search content efficiently.

---

## 🚀 Live Demo

https://gita-api-1.onrender.com  
Example: https://gita-api-1.onrender.com/shlok/1

---

## ✨ Features

- Fetch shlokas chapter-wise  
- Search shlokas using keywords  
- Fast and optimized API responses  
- Deployed and publicly accessible  
- JSON-based responses for easy integration  

---

## 🛠️ Tech Stack

Backend: Java, Spring Boot  
API Type: REST  
Database: JSON Dataset  
Deployment: Render  
Tools: Postman, Git  

---

## 📡 API Endpoints

Get Shlok by ID  
GET /shlok/{id}  
Example: https://gita-api-1.onrender.com/shlok/1  

Get Shlokas by Chapter  
GET /chapter/{chapterNumber}  
Example: /chapter/1  

Search Shlokas  
GET /search?keyword={word}  
Example: /search?keyword=karma  

---

## 📊 Sample Response

[
  {
    "chapter": 1,
    "verse": 1,
    "slok": "धृतराष्ट्र उवाच...",
    "transliteration": "dhṛtarāṣṭra uvāca...",
    "tej": {
      "author": "Swami Tejomayananda"
    },
    "siva": {
      "author": "Swami Sivananda"
    }
  }
]

---

## ⚙️ Run Locally

git clone https://github.com/LordsOwnAcc/gita-api.git  
cd gita-api  
./mvnw spring-boot:run  

Access: http://localhost:8080  

---

## 🧪 Testing

- Tested using Postman  
- Verified API responses  
- Error handling checked  
- Performance validated  

---

## 📈 Future Improvements

- JWT Authentication  
- Pagination support  
- NLP-based search  
- Caching for performance  

---

## 👨‍💻 Author

Sumit Yadav  
GitHub: https://github.com/LordsOwnAcc  
LinkedIn: https://linkedin.com/in/sumit-rajesh-yadav  

---

## 🙏 Acknowledgements

This project uses Bhagavad Gita data sourced from the Vedic Scriptures GitHub repository.  
I sincerely thank the contributors for making this dataset publicly available.

---

## ⭐ Support

If you like this project, consider giving it a star on GitHub!
