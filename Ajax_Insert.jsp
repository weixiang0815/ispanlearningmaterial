<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>使用Ajax新增員工資料</title>
</head>
<body>
	員工編號 : <input type="text" name="empno" id="empno" /><p>
	姓名 : <input type="text" name="ename" id="ename"/><p>
	到職日 : <input type="text" name="hiredate" id="hiredate"/><p>
	薪水 : <input type="text" name="salary" id="salary"/><p>
	部門編號 : <input type="text" name="deptno" id="deptno"/><p>
	職稱 : <input type="text" name="title" id="title"/><p>
	
	<div>
	<button id="submitBtn">OK</button>
	</div>
</body>

<script type="text/javascript">

	const empno = document.querySelector("#empno");
	const ename = document.querySelector("#ename");
	const hiredate = document.querySelector("#hiredate");
	const salary = document.querySelector("#salary");
	const deptno = document.querySelector("#deptno");
	const title = document.querySelector("#title");
	const submitBtn = document.querySelector("#submitBtn");

	submitBtn.addEventListener("click",function(){
		
		let fd = new FormData();
		fd.append("empno",empno.value)
		
		
		fetch("../AjaxInsert.do",{method:"POST",body:fd}).then(result => result.text()).then(message => {
			console.log(message)
		})
		
	})

	
	
</script>
</html>