<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>麵包商城_商品資訊</title>

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
	<main class="mt-5">
		<div class="container">
			<div class="row justify-content-center ">
				<div class="col-8 ">
					<div class="mb-3 row ">
						<div class="col">
							<img class="img-thumbnail oldImg" style="width: 40%"
								src="${p.photo }"> <span class="mx-4 newSpan">>>></span> <img
								class="img-thumbnail newImg" style="width: 40%"
								src="${p.photo }">
						</div>

					</div>

					<form action="${root}/UpdateProduct.do" method="POST"
						enctype="multipart/form-data">
						<div class="mb-3">
							<label for="pID" class="form-label">商品ID</label> <input id="pID"
								name="productID" class="form-control" type="text"
								value="${p.id }" readonly>
						</div>
						<div class="mb-3">
							<label for="pName" class="form-label">商品名稱</label> <input
								id="pName" name="productName" type="text"
								placeholder="${p.name }" value="${p.name }" class="form-control">
						</div>
						<div class="mb-3">
							<label for="pPrice" class="form-label">商品價格</label> <input
								id="pPrice" name="productPrice" type="number"
								placeholder="${p.price }" value="${p.price }"
								class="form-control">
						</div>
						<div class="mb-3">
							<label for="pPhoto" class="form-label">圖片上傳</label> <input
								id="pPhoto" name="productPhoto" class="form-control" type="file"
								accept="image/*">
						</div>
						<button class="btn btn-primary">修改</button>
						<button class="btn btn-warning m-2" id="cancel">取消</button>
						<span style="color: red">${message }</span>
					</form>
				</div>
			</div>
		</div>
	</main>
</body>

<script type="text/javascript">
	const newImg = $(".newImg");
	const newSpan = $(".newSpan");

	newImg.hide();
	newSpan.hide();

	$("#cancel").click(function(e) {
		e.preventDefault();
		location.href = "${root}/1_mvc/ShowProduct.jsp";
	})

	$("#pPhoto").change(function(e) {
		let imgSource = e.target.files[0];
		newImg.attr("src", URL.createObjectURL(imgSource));
		newImg.show();
		newSpan.show();
	})
</script>
</html>