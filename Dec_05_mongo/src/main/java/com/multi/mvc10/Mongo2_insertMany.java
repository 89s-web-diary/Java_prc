package com.multi.mvc10;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo2_insertMany {

	public static void main(String[] args) {

		try {
			// 1.mongoDB에 연결할 수 있는 클라이언트 객체 생성
			MongoClient client = new MongoClient("localhost", 27017);

			// 2. shop2 DB에 연결
			MongoDatabase database = client.getDatabase("shop2");

			// 3. memo 컬렉션에 연결
			MongoCollection<Document> collection = database.getCollection("memo");

			// 4. insert할 document객체 생성
			Document doc = new Document();
			doc.append("age", 27);
			doc.append("name", "hyell");
			doc.append("office", "sudo");
			doc.append("phone", "1113335555");

			Document doc2 = new Document();
			doc2.append("age", 27);
			doc2.append("name", "hyell2");
			doc2.append("office", "sudo2");
			doc2.append("phone", "1113335555");
			
			List<Document> list = new ArrayList<Document>();
			list.add(doc);
			list.add(doc2);

			// 5.mongoDB로 전송
			collection.insertMany(list);
			System.out.println("insert성공");
			client.close();

		} catch (Exception e) {

		}

	}

}
