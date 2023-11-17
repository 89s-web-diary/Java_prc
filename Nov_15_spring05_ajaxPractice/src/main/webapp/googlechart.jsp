<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js">
</script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url : "chart",
			success : function(array) {
				console.log(array)
		  	    google.charts.load("current", {packages:["corechart"]});
		   	    google.charts.setOnLoadCallback(drawChart);
		   	    
		    	function drawChart() {
			     	var dataArray =[['Task', 'Hours per Day']];
			        $(array).each(function(i, json) {
			        	dataArray.push([json.task, json.hours])
			        })
			        var data = google.visualization.arrayToDataTable(dataArray)
			        var options = {
			          title: 'My Daily Activities',
			          pieHole: 0.4
		        	};
		
		        var chart = new google.visualization.PieChart(document.getElementById('donutchart'));
		        chart.draw(data, options);
		      	}
			}
		})
	})
})

</script>
</head>
<body>
	<div id="donutchart" style="width: 900px; height: 500px;"></div>
	<button id="b1">버튼</button>
</body>
</html>