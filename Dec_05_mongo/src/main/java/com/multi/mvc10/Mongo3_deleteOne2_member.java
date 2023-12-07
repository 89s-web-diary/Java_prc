package com.multi.mvc10;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo3_deleteOne2_member {

	public static void main(String[] args) {
		
		try {
			// 1.mongoDB에 연결할 수 있는 클라이언트 객체 생성
			MongoClient client = new MongoClient("localhost", 27017);
			
			// 2. shop2 DB에 연결
			MongoDatabase database = client.getDatabase("shop2");
			
			// 3. memo 컬렉션에 연결
			MongoCollection<Document> collection = database.getCollection("member");
			
			// 4. insert할 document객체 생성
			Document filter = new Document();
			filter.append("id", "banana");
			
			// 5.mongoDB로 전송
			collection.deleteOne(filter);
			System.out.println("deleteOne성공");
			client.close();
			
		} catch (Exception e) {
			
		}
		
	}

}
