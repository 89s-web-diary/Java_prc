<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HTML Table 5x2</title>
    <style>
        /* Add your CSS styles here */
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
	<form action="update.memo">
		<table>
			<thead style="background: yellow">
				<tr>
					<th width="200px">항목명</th>
					<th>값</th>
				</tr>
			</thead>
			<tbody style="background: pink">
				<tr>
					<td>아이디</td>
					<td><input name ="_id" value = "${vo._id}" type="hidden"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input name ="name" size = "30" value="${vo.name}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>내용</td>
					<td><input name ="content" size = "30" value="${vo.content}"></td>
				</tr>
				<tr>
					<td>날씨</td>
					<td><input name ="weather" size = "30" value="${vo.weather}" readonly="readonly"></td>
				</tr>
				<tr>
					<td>날짜</td>
					<td><input name ="date" size = "30" value="${vo.date}" readonly="readonly"></td>
				</tr>
			</tbody>
		</table>
    	<button style="background: lime">메모 수정 요청</button>
	</form>
    
    <a href="delete.memo?_id=${vo._id}">
    	<button style="background: red">메모 삭제 요청</button>
    </a>
    <a href="mongo_memo.jsp">
    	<button style="background: lightblue">전체 메모 요청</button>
    </a>
</body>
</html>