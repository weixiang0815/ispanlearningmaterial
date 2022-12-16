<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>麵包商城</title>

<!-- bootstrap 5.1.3 CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<!-- jQuery 3.6.0 -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>

</head>
<body>
	<main>
		<div class="row justify-content-center mt-5">
			<div class="col-6">
				<div class="input-group mb-3 ">

					<a href="${root}/GetAllProduct.do ">
						<button class="btn btn-primary" type="button">所有商品</button>
					</a> <input type="text" class="form-control" id="keywordInput"
						placeholder="請輸入商品名稱(模糊搜尋)">
					<button class="btn btn-primary" type="button" id="searchBTN">搜尋商品(Enter)</button>

				</div>
			</div>


			<div class="col-2">
				<div class="input-group mb-3 ">
					<a href="${root}/1_mvc/AddProduct.jsp">
						<button class="btn btn-primary" type="button">新增商品</button>
					</a>
				</div>
			</div>
		</div>

		<div class="text-center">
			計時器(觀察頁面刷新)：<span id="timer">0</span>
		</div>

		<div class="album py-5 bg-light">
			<div class="container">

				<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">

					<c:forEach var="p" items="${products}">
						<div class="col">
							<div class="card">
								<img src="${p.photo }" class="card-img-top" alt="">
								<div class="card-body text-center fs-4">${p.name }</div>
								<div class="card-footer text-center">
									<span class="me-5">$${p.price }</span>
									<button class="btn btn-primary update" productID="${p.id}">修改</button>
									<button class="btn btn-danger delete" productID="${p.id}">刪除</button>
								</div>

							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</main>

</body>

<script type="text/javascript">
	/*----- 初始化 -----*/
	//使用jQuery選取元素
	const timer = $("#timer");
	const keywordInput = $("#keywordInput");
	const searchBTN = $("#searchBTN");
	const delteBTNList = $(".delete");
	const updateBTNList = $(".update");
	
	//一進此頁面，使焦點鎖定在keywordInput欄位
	keywordInput.focus(); 
	
	
	
	/*----- 設定計時器 -----*/
	setInterval(()=>{
		timer.html(parseInt(timer.html())+1)
	},1000)
	
	
	
	/*----- 模糊搜尋 -----*/
	//進行模糊搜尋時呼叫的方法
	function search(){
		location.href = '${root}/GetProductByKeyword.do?keyword=' + keywordInput.val();
	}
	
	//點擊按鈕後進行模糊搜尋
	searchBTN.click(search); 
	
	//按下Enter鍵後進行模糊搜尋
	keywordInput.keypress(function(e){
		 if (e.key === 'Enter') {
		    	search();
		 }
	});
	
	
	
	/*----- 刪除商品 -----*/
	delteBTNList.click(function(){
		let pID = this.getAttribute('productId');
		if(confirm("確定刪除?")){
			location.href = '${root}/DeleteProductByID.do?productID=' + pID;
		}
	})
	
	
	
	/*----- 修改商品 -----*/
	//點擊按鈕 → 導向取得商品資訊的controller → 在Controller儲存後端共享的資訊 → 導向呈現商品資訊的頁面
	updateBTNList.click(function(){
		let pID = this.getAttribute('productId');
		location.href = '${root}/GetProductByID.do?productID=' + pID;
	})
	
	
</script>
</html>