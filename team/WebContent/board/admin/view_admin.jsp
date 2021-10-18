<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>admin 페이지 - 글목록</title>
<meta charset="utf-8">

</head>
<body>

	<div class="header">
		<h1>중앙 커뮤니티 - 관리자 모드</h1>
		<form>
			<input type="text" name="search" placeholder="통합검색...">
			<button class="btn btn-info">
				<span class="glyphicon glyphicon-search"></span> 검색
			</button>
		</form>
	</div>


	<nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
  <div class="container-fluid">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">홈</a>
    </div>
    <div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
          <li><a href="#section1">공지</a></li>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">일상●취미 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#section41">자유</a></li>
              <li><a href="#section42">일상</a></li>
            </ul>
          </li>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">스포츠 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#section41">축구</a></li>
              <li><a href="#section42">야구</a></li>
            </ul>
          </li>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">게임 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#section41">D2&D2R</a></li>
              <li><a href="#section42">FF14</a></li>
            </ul>
          </li>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">연예 <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#section41">영화</a></li>
              <li><a href="#section42">tv방송</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </div>
</nav>  

	<div class="row">
		<div class="leftcolumn">
			<div class="card">
				<h2>TITLE HEADING</h2>
				<div class="fakeimg" style="height: 200px;">Image</div>
				<p>Some text..</p>
				<p>Sunt in culpa qui officia deserunt mollit anim id est laborum
					consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
					labore et dolore magna aliqua. Ut enim ad minim veniam, quis
					nostrud exercitation ullamco.</p>
			</div>
		</div>

		<div class="rightcolumn">
			<div class="card">
				<button class="btn 로그인">로그인</button>
				<button class="btn 회원가입">회원가입</button>
			</div>
		</div>
	</div>

	<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>

	<script>
		//Get the button
		var mybutton = document.getElementById("myBtn");

		// When the user scrolls down 20px from the top of the document, show the button
		window.onscroll = function() {
			scrollFunction()
		};

		function scrollFunction() {
			if (document.body.scrollTop > 20
					|| document.documentElement.scrollTop > 20) {
				mybutton.style.display = "block";
			} else {
				mybutton.style.display = "none";
			}
		}

		// When the user clicks on the button, scroll to the top of the document
		function topFunction() {
			document.body.scrollTop = 0;
			document.documentElement.scrollTop = 0;
		}
	</script>

	<div class="footer">
		<!-- 로고 추가 -->
		<p>Copyright© All rights reserved.</p>
		<dl>
			<dt>주소: 서울특별시</dt>
			<dt>상호: CHC</dt>
			<dt>담당자: 홍길동</dt>
			<dt>연락처: 111-1111-1111</dt>
		</dl>
		<h6>본 사이트에서는 각종 청소년유해정보로부터 청소년을 보호하고자 관련법률에 따라 19세미만의 청소년들이 유해정보에
			접근할 수 없도록 청소년취급방침을 마련하여 시행하고 있습니다. 또한 청소년의 건전한 성장을 저해하는 음란 · 불법 등의
			유해정보와 비윤리적 · 반사회적 행위에 대해서는 엄격하게 제재하고 있습니다.</h6>
	</div>


</body>

</html>
