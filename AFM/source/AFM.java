import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class AFM extends PApplet {

/* [All Foods Matter] by 'The Three Of Us (뜨오어)' */

// 폰트 변수 선언
PFont font;

// 이미지 변수 선언
PImage img1, img2, img2_1, img3, img3_1, img4, img4_1, img4_2, img4_3;
PImage img5, img5_1, img6, img6_1, img6_2, img6_3, img6_4;
PImage img_profile, img_loading;
PImage img_timet1, img_timet2, img_timet3, img_timet4, img_timet5, img_timet6;
PImage gs_img40, gs_img41, gs_img42, gs_img43, moms_img76, moms_img78, h_img71, h_img72;
PImage y_img172, y_img174, y_img180, y_img184, gs_img20, gs_img21, gs_img30, gs_img37;
PImage img147, img148, img153, img157, i_img1, i_img2, i_img3, i_img4;
PImage img128, img134, img140, img143, img91, img96, img98, img102;
PImage img105, img111, img114, img121, img200, img201, img202, img203, img204;
PImage imgone, imgtwo;
PImage result1, result2, result3;
PImage t_1, t_2, t_3, t_4, t_5, t_6;
PImage goback1_y, goback2_y, goback1_b, goback2_b;
PImage menu;
PImage stick, stick1;

// page 변수 선언 (화면 전환 역할)
float page = -2;

// 각종 필요한 변수 선언 
int i = 0;
int j = 0;
int k = 0;
int l = 0;
int r1;
int r2;

int speed = 12;
float speed_2 = 1.75f;

int flag = 0;

int page_ = 0;
int result = 0;
int status;

int friend1 = 0;
int friend2 = 0;

// 시간표 그리드 변수 선언
int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0, s6 = 0, s7 = 0, s8 = 0;
int s2_1 = 0, s2_2 = 0, s2_3 = 0, s2_4 = 0, s2_5 = 0, s2_6 = 0, s2_7 = 0, s2_8 = 0;
int s3_1 = 0, s3_2 = 0, s3_3 = 0, s3_4 = 0, s3_5 = 0, s3_6 = 0, s3_7 = 0, s3_8 = 0;
int s4_1 = 0, s4_2 = 0, s4_3 = 0, s4_4 = 0, s4_5 = 0, s4_6 = 0, s4_7 = 0, s4_8 = 0;
int s5_1 = 0, s5_2 = 0, s5_3 = 0, s5_4 = 0, s5_5 = 0, s5_6 = 0, s5_7 = 0, s5_8 = 0;

int s_1 = 0, s_2 = 0, s_3 = 0, s_4 = 0, s_5 = 0, s_6 = 0, s_7 = 0, s_8 = 0;
int s2__1 = 0, s2__2 = 0, s2__3 = 0, s2__4 = 0, s2__5 = 0, s2__6 = 0, s2__7 = 0, s2__8 = 0;
int s3__1 = 0, s3__2 = 0, s3__3 = 0, s3__4 = 0, s3__5 = 0, s3__6 = 0, s3__7 = 0, s3__8 = 0;
int s4__1 = 0, s4__2 = 0, s4__3 = 0, s4__4 = 0, s4__5 = 0, s4__6 = 0, s4__7 = 0, s4__8 = 0;
int s5__1 = 0, s5__2 = 0, s5__3 = 0, s5__4 = 0, s5__5 = 0, s5__6 = 0, s5__7 = 0, s5__8 = 0;

// 토너먼트 랜덤 변수 선언
int rand_num;

// 토너먼트 배열 선언
int[] t4 = {1,2,3,4};
int[] t2 = new int[2];
int[] check = {1, 1, 1, 1};;

public void setup() {

   // 창 크기
  background(0);

  // 폰트 불러오기
  font = loadFont("ComicSansMS-20.vlw");

  // 이미지 불러오기
  img1 = loadImage("메뉴상자.jpg");
  
  img2 = loadImage("학관 맘스 아이콘.png");
  img2_1 = loadImage("학관 맘스 글씨.png");
  
  img3 = loadImage("야식 아이콘.png");
  img3_1 = loadImage("야식 글씨.png");
  
  img4 = loadImage("매점 아이콘.png");
  img4_1 = loadImage("과자 아이콘.png");
  img4_2 = loadImage("음료수 아이콘.png");
  img4_3 = loadImage("아이스크림 아이콘.png");
  
  img5 = loadImage("시간표 조율 상자.jpg");
  img5_1 = loadImage("시간표 조율 글씨.png");
  
  img6 = loadImage("교내식당 아이콘.png");
  img6_1 = loadImage("빨너 아이콘.png");
  img6_2 = loadImage("인브리즈.png");
  img6_3 = loadImage("버거킹 아이콘.png");
  img6_4 = loadImage("팜발.png");
  
  img_profile = loadImage("로고.png");
  
  img_loading = loadImage("배경.png");
  
  img_timet1 = loadImage("upback.png");
  img_timet2 = loadImage("chart.png");
  img_timet3 = loadImage("downback.png");
  img_timet4 = loadImage("AFM.png");
  img_timet5 = loadImage("would.png");
  img_timet6 = loadImage("control.png");
  
  gs_img40 = loadImage("꼬깔콘.png");
  gs_img41 = loadImage("바나나킥.png");
  gs_img42 = loadImage("새우깡.png");
  gs_img43 = loadImage("홈런볼.png");
  
  moms_img76 = loadImage("76.png");
  moms_img78 = loadImage("78.png");
  h_img71 = loadImage("71.png");
  h_img72 = loadImage("72.png");
  
  y_img172 = loadImage("172.png");
  y_img174 = loadImage("174.png");
  y_img180 = loadImage("180.png");
  y_img184 = loadImage("184.png");
  
  gs_img20 = loadImage("데.png");
  gs_img21 = loadImage("바.png");
  gs_img30 = loadImage("스.png");
  gs_img37 = loadImage("코.png");
  
  img147 = loadImage("147.png");
  img148 = loadImage("148.png");
  img153 = loadImage("153.png");
  img157 = loadImage("157.png");
  
  i_img1 = loadImage("메로나.png");
  i_img2 = loadImage("빠삐코.png");
  i_img3 = loadImage("슈퍼콘.png");
  i_img4 = loadImage("월드콘.png");
  
  img128 = loadImage("128.png");
  img134 = loadImage("134.png");
  img140 = loadImage("140.png");
  img143 = loadImage("143.png");
  
  img91 = loadImage("91.png");
  img96 = loadImage("96.png");
  img98 = loadImage("98.png");
  img102 = loadImage("102.png");
  
  img105 = loadImage("김불.png");
  img111 = loadImage("베이컨.png");
  img114 = loadImage("지고.png");
  img121 = loadImage("핫치킨.png");
  
  img200 = loadImage("냉면.png");
  img201 = loadImage("돈까스.png");
  img202 = loadImage("떡볶이.png");
  img203 = loadImage("파스타.png");
  img204 = loadImage("햄버거.png");
  
  imgone = loadImage("one.png");
  imgtwo = loadImage("two.png");
  
  result1 = loadImage("최종 결과 배경.png");
  result2 = loadImage("오늘은.png");
  result3 = loadImage("이거!.png");
  
  t_1 = loadImage("4강 1차.png");
  t_2 = loadImage("4강 2차.png");
  t_3 = loadImage("결승.png");
  t_4 = loadImage("상단 흰상자.png");
  t_5 = loadImage("중앙 검은 상자.png");
  t_6 = loadImage("하단 흰상자.png");
  
  goback1_y = loadImage("뒤로(노랑).png");
  goback2_y = loadImage("가기(노랑).png");
  goback1_b = loadImage("뒤로(검정).png");
  goback2_b = loadImage("가기(검정).png");
  
  menu = loadImage("뭐먹지.png");
  
  stick = loadImage("막대.png");
  stick1 = loadImage("막대2.png");
  
  /* 토너먼트 랜덤 */
  
  // 랜덤 숫자 생성
  r1 = (int)random(100) % 4;
  r2 = -1;
  
  do {
    r2 = (int)random(100) % 4;
  } while(r2 == r1);
  
  check[r1] = check[r2] = 2;

}

/* *** 로딩화면 *** */

public void loading(){
  
  background(0);
  
  fill(255);
  textFont(font);
  text("Washing Dishes...", 145, -30 + height - j/1.5f);// 글자1 등속도 이동 (위로)
  text("Making my Bed...", 146, -30 + height - j/1.5f + 60);// 글자2 등속도 이동 (위로)
  text("Playing Guitar...", 153, -30 + height - j/1.5f + 120);// 글자3 등속도 이동 (위로)
  text("Ready to Go!", 163, -30 + height - j/1.5f + 167);// 글자4 등속도 이동 (위로)
  
  fill(0);
  noStroke();
  rect(120,320,200,400);
  rect(120,750,200,400);
  
  image(img_profile, 70, 200, 300, 300); // 프로필 이미지 중앙 배치
  
  strokeWeight(3);
  stroke(255);
  line(50, 700, 50 + j, 700);
  
  j += speed_2;// y좌표 감소를 위한 speed_2 변수 더함
  
  if(50 + j >= width - 50){
  
    speed_2 = 0;
    delay(500);// 0.5초 딜레이
    page = 0;
  
  }
}

/* *** 메인화면 *** */

public void page0() {

  background(255);
  strokeWeight(3);

  // 시간표 그리드 변수 0으로 초기화
  // 친구 1
  s1 = 0;
  s2 = 0; 
  s3 = 0;
  s4 = 0;
  s5 = 0;
  s6 = 0;
  s7 = 0;
  s8 = 0;
  s2_1 = 0;
  s2_2 = 0;
  s2_3 = 0;
  s2_4 = 0;
  s2_5 = 0;
  s2_6 = 0;
  s2_7 = 0;
  s2_8 = 0;
  s3_1 = 0;
  s3_2 = 0;
  s3_3 = 0;
  s3_4 = 0;
  s3_5 = 0;
  s3_6 = 0;
  s3_7 = 0;
  s3_8 = 0;
  s4_1 = 0;
  s4_2 = 0;
  s4_3 = 0;
  s4_4 = 0;
  s4_5 = 0;
  s4_6 = 0;
  s4_7 = 0;
  s4_8 = 0;
  s5_1 = 0;
  s5_2 = 0;
  s5_3 = 0;
  s5_4 = 0;
  s5_5 = 0;
  s5_6 = 0;
  s5_7 = 0;
  s5_8 = 0;
  
  // 친구 2
  s_1 = 0;
  s_2 = 0; 
  s_3 = 0;
  s_4 = 0;
  s_5 = 0;
  s_6 = 0;
  s_7 = 0;
  s_8 = 0;
  s2__1 = 0;
  s2__2 = 0;
  s2__3 = 0;
  s2__4 = 0;
  s2__5 = 0;
  s2__6 = 0;
  s2__7 = 0;
  s2__8 = 0;
  s3__1 = 0;
  s3__2 = 0;
  s3__3 = 0;
  s3__4 = 0;
  s3__5 = 0;
  s3__6 = 0;
  s3__7 = 0;
  s3__8 = 0;
  s4__1 = 0;
  s4__2 = 0;
  s4__3 = 0;
  s4__4 = 0;
  s4__5 = 0;
  s4__6 = 0;
  s4__7 = 0;
  s4__8 = 0;
  s5__1 = 0;
  s5__2 = 0;
  s5__3 = 0;
  s5__4 = 0;
  s5__5 = 0;
  s5__6 = 0;
  s5__7 = 0;
  s5__8 = 0;
  
  // 토너먼트 랜덤 변수 0으로 초기화
  rand_num = 0;
  
  // 홈 화면 배경 설정
  image(img1, -5, 0);

  noFill();
  rect(0, 0, 435, 125);
  
  image(menu, 70, 15, 92, 32);
  
  image(img_timet4, -15, 70, 290, 62);

  // 홈 화면 메뉴버튼

  button0_0();

  stroke(0);  

  // 홈 화면 버튼 1

  button0_1();
  image(img2, 30, 160, 85, 85);

  // 홈 화면 버튼 2

  button0_2();
  image(img3,27,300,90,90);

  // 홈 화면 버튼 3
  
  noFill();
  stroke(0);
  rect(0, 425, 435, 150);
  
  button0_3_1();
  button0_3_2();
  button0_3_3();
  image(img4,30,455,85,85);

  // 홈 화면 버튼 4
  
  noFill();
  stroke(0);
  rect(0, 575, 435, 150);
  
  button0_4_1();
  button0_4_2();
  button0_4_3();
  button0_4_4();
  image(img6,35,610,80,80);

  // 홈 화면 버튼 5

  image(img5, -5, 725);
  noFill();
  stroke(0);
  rect(0, 725, 435, 100);
  
  button0_5();

  image(img_profile, 265, 28, 170, 170);
}

/* *** 홈 화면 *** */

public void page_menu() {

  fill(255);

  // '뭐먹지' 아이콘 눌러 왼쪽 추가창 표시
  menu_motion();
  
  // '뭐먹지' 창이 뜨고 랜덤으로 메뉴 추천
  if(speed == 0){
    if(rand_num == 1)image(img200,0,200,250,423);
    if(rand_num == 2)image(img201,0,200,250,388);
    if(rand_num == 3)image(img202,0,200,250,388);
    if(rand_num == 4)image(img203,0,200,250,431);
    if(rand_num == 5)image(img204,0,200,250,385);
  }

  stroke(0);  
  strokeWeight(3);

  // 뒤로가서 홈 화면으로 귀환
  button_menu_goback();
}

/* *** page 1 *** */
// 학관 & 맘스 토너먼트
public void page1(){

  //토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼
    
  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {
    
    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
        
    }
  } 
    
  else {
    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  
  }
}

/* *** page 2 *** */
// 야식 토너먼트
public void page2(){

  background(200, 0, 0);
  
  //토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {
    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
    }
  } else {
    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  }
}

/* *** page 3 *** */
// 편의점 과자 토너먼트
public void page3_1(){

  background(0, 200, 0);
  //토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {
    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
    }
  } else {
    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  }
}

// 편의점 음료수 토너먼트
public void page3_2(){

  background(0, 200, 0);
  //토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {

    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
    }
  } else {

    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  }
}

// 편의점 아이스크림 토너먼트
public void page3_3(){

  background(0, 200, 0);

  // 토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {

    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
    }
  } else {

    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  }
}

/* *** page 4 *** */
// 학교 내 음식점 빨너 토너먼트
public void page4_1(){

  background(0, 0, 200);
  
  // 토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {

    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
    }
  } else {

    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  }
}

// 학교 내 음식점 인브리즈 토너먼트
public void page4_2(){

  background(0, 0, 200);
  
  // 토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {

    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
    }
  } else {

    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  }
}

// 학교 내 음식점 버거킹 토너먼트
public void page4_3(){

  background(0, 0, 200);
  
  // 토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {

    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
    }
  } else {

    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  }
} 

// 학교 내 음식점 팜 발 토너먼트
public void page4_4(){

  background(0, 0, 200);
  
  // 토너먼트 함수 실행
  tournament();

  // 뒤로가기 버튼

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 765 && mouseY <= 810) {

    if(page_ == 3)image(goback2_y, 330, 760, 120, 72);
    else image(goback2_b, 330, 760, 120, 72);

    if (mousePressed) {

      page = 0;
      page_ = 0;
    }
  } else {

    if(page_ == 3)image(goback1_y, 330, 760, 120, 72);
    else image(goback1_b, 330, 760, 120, 72);
  }
} 

/* *** page 5 *** */
// 시간표 조율 화면
public void page5() {
  
  //시간표 조율 화면 구성
  background(251, 246, 243);
  
  image(img_timet1, -5, 0, 450, 135);
  image(img_timet2, 10, 150, 410, 570);
  image(img_timet3, -5, 735, 450, 100);
  image(img_timet4, 80, 12, 280, 60);
  image(img_timet5, 60, 45, 320, 100);
  image(imgone, 27, 758, 150, 50);
  image(imgtwo, 192, 758, 150, 50);
  image(stick, -20, 0);
  image(stick, 428, 0);
  
  //
  if(mouseY > 0 && mouseY < 730)flag = 0;
  
  if((mouseX >= 27 && mouseX <= 177) && (mouseY >= 758 && mouseY <= 808)){
    if(mousePressed && flag == 0){
      friend1 = 1;
      friend2 = 0;
    }
    else{
      image(imgone, 17, 755, 170, 56);
    }
  }
  if((mouseX >= 192 && mouseX <= 342) && (mouseY >= 758 && mouseY <= 808)){
    if(mousePressed && flag == 0){
      friend2 = 1;
      friend1 = 0;
    }
    else{
      image(imgtwo, 182, 755, 170, 56);
    }
  }
  
  // 시간표 조율 함수 실행(색칠)
  timetable();

  // 뒤로가기 함수 실행
  button_5_goback();
}

/* *** 시간표 *** */

public void timetable(){
  // 친구 1 선택시
  if(friend1 == 1){
    // 월요일 교시 선택시
   if(mouseX < 147 && mouseX > 78){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
        s1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
       s3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
       s4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
       s5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
       s6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
       s7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
       s8 = 1;
     }
   }
    // 화요일 교시 선택시
   if(mouseX < 216 && mouseX > 147){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
        s2_1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s2_2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
        s2_3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
        s2_4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
        s2_5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
        s2_6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
        s2_7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
        s2_8 = 1;
     }
   }
     // 수요일 교시 선택시
   if(mouseX < 284 && mouseX > 215){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
       s3_1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s3_2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
        s3_3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
        s3_4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
        s3_5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
        s3_6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
        s3_7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
        s3_8 = 1;
     }
   }
    // 목요일 교시 선택시
   if(mouseX < 352 && mouseX > 283){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
        s4_1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s4_2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
        s4_3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
        s4_4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
        s4_5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
        s4_6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
        s4_7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
        s4_8 = 1;
     }
   }
    // 금요일 교시 선택시
   if(mouseX < 420 && mouseX > 351){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
        s5_1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s5_2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
        s5_3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
        s5_4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
        s5_5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
        s5_6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
        s5_7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
        s5_8 = 1;
     }
   }
 }
 // 해당 그리드 변수 값이 1이면 색칠
  noStroke();
  fill(224, 179, 81, 90);
  if(s1 == 1)rect(78, 150 + 63, 69, 63);
  if(s2 == 1)rect(78, 150 + 63 * 2, 69, 63);
  if(s3 == 1)rect(78, 150 + 63 * 3, 69, 63);
  if(s4 == 1)rect(78, 150 + 63 * 4, 69, 63);
  if(s5 == 1)rect(78, 150 + 63 * 5, 69, 63);
  if(s6 == 1)rect(78, 150 + 63 * 6, 69, 63);
  if(s7 == 1)rect(78, 150 + 63 * 7, 69, 63);
  if(s8 == 1)rect(78, 150 + 63 * 8, 69, 63);

   if(s2_1 == 1)rect(147, 213, 69, 63);
   if(s2_2 == 1)rect(147, 213 + 63, 69, 63);
   if(s2_3 == 1)rect(147, 213 + 63 * 2, 69, 63);
   if(s2_4 == 1)rect(147, 213 + 63 * 3, 69, 63);
   if(s2_5 == 1)rect(147, 213 + 63 * 4, 69, 63);
   if(s2_6 == 1)rect(147, 213 + 63 * 5, 69, 63);
   if(s2_7 == 1)rect(147, 213 + 63 * 6, 69, 63);
   if(s2_8 == 1)rect(147, 213 + 63 * 7, 69, 63);

   if(s3_1 == 1)rect(215, 213, 69, 63);
   if(s3_2 == 1)rect(215, 213 + 63, 69, 63);
   if(s3_3 == 1)rect(215, 213 + 63 * 2, 69, 63);
   if(s3_4 == 1)rect(215, 213 + 63 * 3, 69, 63);
   if(s3_5 == 1)rect(215, 213 + 63 * 4, 69, 63);
   if(s3_6 == 1)rect(215, 213 + 63 * 5, 69, 63);
   if(s3_7 == 1)rect(215, 213 + 63 * 6, 69, 63);
   if(s3_8 == 1)rect(215, 213 + 63 * 7, 69, 63);

   if(s4_1 == 1)rect(283, 213, 69, 63);
   if(s4_2 == 1)rect(283, 213 + 63, 69, 63);
   if(s4_3 == 1)rect(283, 213 + 63 * 2, 69, 63);
   if(s4_4 == 1)rect(283, 213 + 63 * 3, 69, 63);
   if(s4_5 == 1)rect(283, 213 + 63 * 4, 69, 63);
   if(s4_6 == 1)rect(283, 213 + 63 * 5, 69, 63);
   if(s4_7 == 1)rect(283, 213 + 63 * 6, 69, 63);
   if(s4_8 == 1)rect(283, 213 + 63 * 7, 69, 63);
   
   if(s5_1 == 1)rect(351, 213, 69, 63);
   if(s5_2 == 1)rect(351, 213 + 63, 69, 63);
   if(s5_3 == 1)rect(351, 213 + 63 * 2, 69, 63);
   if(s5_4 == 1)rect(351, 213 + 63 * 3, 69, 63);
   if(s5_5 == 1)rect(351, 213 + 63 * 4, 69, 63);
   if(s5_6 == 1)rect(351, 213 + 63 * 5, 69, 63);
   if(s5_7 == 1)rect(351, 213 + 63 * 6, 69, 63);
   if(s5_8 == 1)rect(351, 213 + 63 * 7, 69, 63);
  
  // 친구 2 선택시
  if(friend2 == 1){
    // 월요일 교시 선택시
   if(mouseX < 147 && mouseX > 78){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
        s_1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s_2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
       s_3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
       s_4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
       s_5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
       s_6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
       s_7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
       s_8 = 1;
     }
   }
   // 화요일 교시 선택시
   if(mouseX < 216 && mouseX > 147){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
        s2__1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s2__2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
        s2__3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
        s2__4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
        s2__5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
        s2__6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
        s2__7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
        s2__8 = 1;
     }
   }
    // 수요일 교시 선택시
   if(mouseX < 284 && mouseX > 215){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
       s3__1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s3__2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
        s3__3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
        s3__4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
        s3__5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
        s3__6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
        s3__7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
        s3__8 = 1;
     }
   }
   // 목요일 교시 선택시
   if(mouseX < 352 && mouseX > 283){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
        s4__1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s4__2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
        s4__3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
        s4__4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
        s4__5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
        s4__6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
        s4__7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
        s4__8 = 1;
     }
   }
   // 금요일 교시 선택시
   if(mouseX < 420 && mouseX > 351){
     if(mouseY < 276 && mouseY > 213 && mousePressed){
        s5__1 = 1;
     }if(mouseY < 340 && mouseY > 276 && mousePressed){
        s5__2 = 1;
     }if(mouseY < 403 && mouseY > 339 && mousePressed){
        s5__3 = 1;
     }if(mouseY < 466 && mouseY > 402 && mousePressed){
        s5__4 = 1;
     }if(mouseY < 529 && mouseY > 466 && mousePressed){
        s5__5 = 1;
     }if(mouseY < 592 && mouseY > 529 && mousePressed){
        s5__6 = 1;
     }if(mouseY < 655 && mouseY > 592 && mousePressed){
        s5__7 = 1;
     }if(mouseY < 718 && mouseY > 655 && mousePressed){
        s5__8 = 1;
     }
   }
  }
   // 해당 그리드 변수 값이 1이면 색칠
  noStroke();
  fill(150, 77, 29, 90);
  if(s_1 == 1)rect(78, 150 + 63, 69, 63);
  if(s_2 == 1)rect(78, 150 + 63 * 2, 69, 63);
  if(s_3 == 1)rect(78, 150 + 63 * 3, 69, 63);
  if(s_4 == 1)rect(78, 150 + 63 * 4, 69, 63);
  if(s_5 == 1)rect(78, 150 + 63 * 5, 69, 63);
  if(s_6 == 1)rect(78, 150 + 63 * 6, 69, 63);
  if(s_7 == 1)rect(78, 150 + 63 * 7, 69, 63);
  if(s_8 == 1)rect(78, 150 + 63 * 8, 69, 63);

   if(s2__1 == 1)rect(147, 213, 69, 63);
   if(s2__2 == 1)rect(147, 213 + 63, 69, 63);
   if(s2__3 == 1)rect(147, 213 + 63 * 2, 69, 63);
   if(s2__4 == 1)rect(147, 213 + 63 * 3, 69, 63);
   if(s2__5 == 1)rect(147, 213 + 63 * 4, 69, 63);
   if(s2__6 == 1)rect(147, 213 + 63 * 5, 69, 63);
   if(s2__7 == 1)rect(147, 213 + 63 * 6, 69, 63);
   if(s2__8 == 1)rect(147, 213 + 63 * 7, 69, 63);

   if(s3__1 == 1)rect(215, 213, 69, 63);
   if(s3__2 == 1)rect(215, 213 + 63, 69, 63);
   if(s3__3 == 1)rect(215, 213 + 63 * 2, 69, 63);
   if(s3__4 == 1)rect(215, 213 + 63 * 3, 69, 63);
   if(s3__5 == 1)rect(215, 213 + 63 * 4, 69, 63);
   if(s3__6 == 1)rect(215, 213 + 63 * 5, 69, 63);
   if(s3__7 == 1)rect(215, 213 + 63 * 6, 69, 63);
   if(s3__8 == 1)rect(215, 213 + 63 * 7, 69, 63);

   if(s4__1 == 1)rect(283, 213, 69, 63);
   if(s4__2 == 1)rect(283, 213 + 63, 69, 63);
   if(s4__3 == 1)rect(283, 213 + 63 * 2, 69, 63);
   if(s4__4 == 1)rect(283, 213 + 63 * 3, 69, 63);
   if(s4__5 == 1)rect(283, 213 + 63 * 4, 69, 63);
   if(s4__6 == 1)rect(283, 213 + 63 * 5, 69, 63);
   if(s4__7 == 1)rect(283, 213 + 63 * 6, 69, 63);
   if(s4__8 == 1)rect(283, 213 + 63 * 7, 69, 63);

   if(s5__1 == 1)rect(351, 213, 69, 63);
   if(s5__2 == 1)rect(351, 213 + 63, 69, 63);
   if(s5__3 == 1)rect(351, 213 + 63 * 2, 69, 63);
   if(s5__4 == 1)rect(351, 213 + 63 * 3, 69, 63);
   if(s5__5 == 1)rect(351, 213 + 63 * 4, 69, 63);
   if(s5__6 == 1)rect(351, 213 + 63 * 5, 69, 63);
   if(s5__7 == 1)rect(351, 213 + 63 * 6, 69, 63);
   if(s5__8 == 1)rect(351, 213 + 63 * 7, 69, 63);
  
}

/* *** 토너먼트 *** */

public void tournament(){

  if(page_ == 0){
    
    // 토너먼트 화면구성
    background(250);
    image(t_4, 0, 0, 435, 118);
    image(t_5, 0, 129, 435, 348);
    image(t_6, 0, 129 + 348, 435, 348);
    image(t_1, 40, 14, 350, 120);
    
    // 생성된 랜덤 숫자를 토대로 값 불러오기 및 저장
    j = 0;
    int[] temp = new int[2];
    for(int i = 0; i < 4; i++){
      if(check[i] == 1){
        
        // 사진 불러오기
        // 학관 & 맘스
        if(t4[i] == 1 && page == 1){
          image(moms_img76, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 1){
          image(moms_img78, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 1){
          image(h_img71, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 1){
          image(h_img72, 0, 129 + 348 * j, 435, 348);
        }
        // 야식
        if(t4[i] == 1 && page == 2){
          image(y_img172, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 2){
          image(y_img174, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 2){
          image(y_img180, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 2){
          image(y_img184, 0, 129 + 348 * j, 435, 348);
        }
        // 과자
        if(t4[i] == 1 && page == 3.1f){
          image(gs_img40, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 3.1f){
          image(gs_img41, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 3.1f){
          image(gs_img42, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 3.1f){
          image(gs_img43, 0, 129 + 348 * j, 435, 348);
        }
        // 음료수
        if(t4[i] == 1 && page == 3.2f){
          image(gs_img20, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 3.2f){
          image(gs_img21, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 3.2f){
          image(gs_img30, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 3.2f){
          image(gs_img37, 0, 129 + 348 * j, 435, 348);
        }
        // 아이스크림
        if(t4[i] == 1 && page == 3.3f){
          image(i_img1, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 3.3f){
          image(i_img2, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 3.3f){
          image(i_img3, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 3.3f){
          image(i_img4, 0, 129 + 348 * j, 435, 348);
        }
        // 빨너
        if(t4[i] == 1 && page == 4.1f){
          image(img147, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 4.1f){
          image(img148, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 4.1f){
          image(img153, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 4.1f){
          image(img157, 0, 129 + 348 * j, 435, 348);
        }
        // 인브리즈
        if(t4[i] == 1 && page == 4.2f){
          image(img128, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 4.2f){
          image(img134, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 4.2f){
          image(img140, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 4.2f){
          image(img143, 0, 129 + 348 * j, 435, 348);
        }
        // 버거킹
        if(t4[i] == 1 && page == 4.3f){
          image(img91, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 4.3f){
          image(img96, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 4.3f){
          image(img98, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 4.3f){
          image(img102, 0, 129 + 348 * j, 435, 348);
        }
        // 팜발
        if(t4[i] == 1 && page == 4.4f){
          image(img105, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 4.4f){
          image(img111, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 4.4f){
          image(img114, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 4.4f){
          image(img121, 0, 129 + 348 * j, 435, 348);
        }
        
        //결승 사진 temp 저장
        temp[j] = t4[i];
        j++;
      }
    }
    
    // 중복클릭 방지
    if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 477 && mouseY <= 825) && (page == 1 || page == 2)){
        flag = 1;
    }
    if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 129 && mouseY <= 477) && (page == 3.1f || page == 3.2f || page == 3.3f || page == 4.1f || page == 4.2f || page == 4.3f || page == 4.4f)){
        flag = 1;
    }

    //윗 사진 클릭시 temp 값 결승 배열에 저장
    if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 129 && mouseY <= 477) && mousePressed && flag == 1){
      t2[0] = temp[0];
      page_ = 1;
      status = 0;
    }

    // 아랫 사진 클릭시 temp 값 
    if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 477 && mouseY <= 825) && mousePressed && flag == 1){
      t2[0] = temp[1];
      page_ = 1;
      status = 1;
    }
  }
  
  // 4강 두번째
  if(page_ == 1){
    
    background(250);
    image(t_4, 0, 0, 435, 118);
    image(t_5, 0, 129, 435, 348);
    image(t_6, 0, 129 + 348, 435, 348);
    image(t_2, 40, 14, 350, 120);
  
  // 생성된 랜덤 숫자를 토대로 값 불러오기 및 저장
    j = 0;
    int[] temp = new int[2];
    
    for(int i = 0; i < 4; i++){
      
      if(check[i] == 2){
        // 학관 & 맘스
        if(t4[i] == 1 && page == 1){
          image(moms_img76, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 1){
          image(moms_img78, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 1){
          image(h_img71, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 1){
          image(h_img72, 0, 129 + 348 * j, 435, 348);
        }
        // 야식
        if(t4[i] == 1 && page == 2){
          image(y_img172, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 2){
          image(y_img174, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 2){
          image(y_img180, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 2){
          image(y_img184, 0, 129 + 348 * j, 435, 348);
        }
        // 과자
        if(t4[i] == 1 && page == 3.1f){
          image(gs_img40, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 3.1f){
          image(gs_img41, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 3.1f){
          image(gs_img42, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 3.1f){
          image(gs_img43, 0, 129 + 348 * j, 435, 348);
        }
        // 음료수
        if(t4[i] == 1 && page == 3.2f){
          image(gs_img20, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 3.2f){
          image(gs_img21, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 3.2f){
          image(gs_img30, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 3.2f){
          image(gs_img37, 0, 129 + 348 * j, 435, 348);
        }
        // 아이스크림
        if(t4[i] == 1 && page == 3.3f){
          image(i_img1, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 3.3f){
          image(i_img2, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 3.3f){
          image(i_img3, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 3.3f){
          image(i_img4, 0, 129 + 348 * j, 435, 348);
        }
        // 빨너
        if(t4[i] == 1 && page == 4.1f){
          image(img147, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 4.1f){
          image(img148, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 4.1f){
          image(img153, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 4.1f){
          image(img157, 0, 129 + 348 * j, 435, 348);
        }
        // 인브리즈
        if(t4[i] == 1 && page == 4.2f){
          image(img128, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 4.2f){
          image(img134, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 4.2f){
          image(img140, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 4.2f){
          image(img143, 0, 129 + 348 * j, 435, 348);
        }
        // 버거킹
        if(t4[i] == 1 && page == 4.3f){
          image(img91, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 4.3f){
          image(img96, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 4.3f){
          image(img98, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 4.3f){
          image(img102, 0, 129 + 348 * j, 435, 348);
        }
        // 팜발
        if(t4[i] == 1 && page == 4.4f){
          image(img105, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 2 && page == 4.4f){
          image(img111, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 3 && page == 4.4f){
          image(img114, 0, 129 + 348 * j, 435, 348);
        }
        if(t4[i] == 4 && page == 4.4f){
          image(img121, 0, 129 + 348 * j, 435, 348);
        }
        
        temp[j] = t4[i];
        j++;
      }
    }
    
    // 중복클릭 방지
    if(status == 0){
      if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 477 && mouseY <= 825)){
        flag = 2;
      }
    }
    if(status == 1){
      if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 129 && mouseY <= 477)){
        flag = 2;
      }
    }

    // 윗 사진 클릭시 temp 값 결승 배열에 저장
    if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 129 && mouseY <= 477) && mousePressed && flag == 2){
      t2[1] = temp[0];
      page_ = 2;
      status = 0;
    }
    // 아랫 사진 클릭시 temp 값 결승 배열에 저장
    if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 477 && mouseY <= 825) && mousePressed && flag == 2){
      t2[1] = temp[1];
      page_ = 2;
      status = 1;
    }
  }
  
  // 결승
  if(page_ == 2){
  
    // 결승 페이지 구성
    background(250);
    image(t_4, 0, 0, 435, 118);
    image(t_5, 0, 129, 435, 348);
    image(t_6, 0, 129 + 348, 435, 348);
    image(t_3, 40, 14, 350, 120);
    
    // 학관 & 맘스 1
    if(t2[0] == 1 && page == 1){
      image(moms_img76, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 1){
      image(moms_img78, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 1){
      image(h_img71, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 1){
      image(h_img72, 0, 129, 435, 348);
    }
    // 야식 1
    if(t2[0] == 1 && page == 2){
      image(y_img172, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 2){
      image(y_img174, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 2){
      image(y_img180, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 2){
      image(y_img184, 0, 129, 435, 348);
    }
    // 과자 1
    if(t2[0] == 1 && page == 3.1f){
      image(gs_img40, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 3.1f){
      image(gs_img41, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 3.1f){
      image(gs_img42, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 3.1f){
      image(gs_img43, 0, 129, 435, 348);
    }
    // 음료수 1
    if(t2[0] == 1 && page == 3.2f){
      image(gs_img20, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 3.2f){
      image(gs_img21, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 3.2f){
      image(gs_img30, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 3.2f){
      image(gs_img37, 0, 129, 435, 348);
    }
    // 아이스크림 1
    if(t2[0] == 1 && page == 3.3f){
      image(i_img1, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 3.3f){
      image(i_img2, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 3.3f){
      image(i_img3, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 3.3f){
      image(i_img4, 0, 129, 435, 348);
    }
    // 빨너 1
    if(t2[0] == 1 && page == 4.1f){
      image(img147, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 4.1f){
      image(img148, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 4.1f){
      image(img153, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 4.1f){
      image(img157, 0, 129, 435, 348);
    }
    // 인브리즈 1
    if(t2[0] == 1 && page == 4.2f){
      image(img128, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 4.2f){
      image(img134, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 4.2f){
      image(img140, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 4.2f){
      image(img143, 0, 129, 435, 348);
    }
    // 버거킹 1
    if(t2[0] == 1 && page == 4.3f){
      image(img91, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 4.3f){
      image(img96, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 4.3f){
      image(img98, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 4.3f){
      image(img102, 0, 129, 435, 348);
    }
    // 팜발 1
    if(t2[0] == 1 && page == 4.4f){
      image(img105, 0, 129, 435, 348);
    }
    if(t2[0] == 2 && page == 4.4f){
      image(img111, 0, 129, 435, 348);
    }
    if(t2[0] == 3 && page == 4.4f){
      image(img114, 0, 129, 435, 348);
    }
    if(t2[0] == 4 && page == 4.4f){
      image(img121, 0, 129, 435, 348);
    }
    
    // 학관 & 맘스 2
    if(t2[1] == 1 && page == 1){
      image(moms_img76, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 1){
      image(moms_img78, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 1){
      image(h_img71, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 1){
      image(h_img72, 0, 477, 435, 348);
    }
    // 야식 2
    if(t2[1] == 1 && page == 2){
      image(y_img172, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 2){
      image(y_img174, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 2){
      image(y_img180, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 2){
      image(y_img184, 0, 477, 435, 348);
    }
    // 과자 2
    if(t2[1] == 1 && page == 3.1f){
      image(gs_img40, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 3.1f){
      image(gs_img41, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 3.1f){
      image(gs_img42, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 3.1f){
      image(gs_img43, 0, 477, 435, 348);
    }
    // 음료수 2
    if(t2[1] == 1 && page == 3.2f){
      image(gs_img20, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 3.2f){
      image(gs_img21, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 3.2f){
      image(gs_img30, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 3.2f){
      image(gs_img37, 0, 477, 435, 348);
    }
    // 아이스크림 2
    if(t2[1] == 1 && page == 3.3f){
      image(i_img1, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 3.3f){
      image(i_img2, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 3.3f){
      image(i_img3, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 3.3f){
      image(i_img4, 0, 477, 435, 348);
    }
    // 빨너 2
    if(t2[1] == 1 && page == 4.1f){
      image(img147, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 4.1f){
      image(img148, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 4.1f){
      image(img153, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 4.1f){
      image(img157, 0, 477, 435, 348);
    }
    // 인브리즈 2
    if(t2[1] == 1 && page == 4.2f){
      image(img128, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 4.2f){
      image(img134, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 4.2f){
      image(img140, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 4.2f){
      image(img143, 0, 477, 435, 348);
    }
    // 버거킹 2
    if(t2[1] == 1 && page == 4.3f){
      image(img91, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 4.3f){
      image(img96, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 4.3f){
      image(img98, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 4.3f){
      image(img102, 0, 477, 435, 348);
    }
    // 팜발 2
    if(t2[1] == 1 && page == 4.4f){
      image(img105, 0, 477, 435, 348);
    }
    if(t2[1] == 2 && page == 4.4f){
      image(img111, 0, 477, 435, 348);
    }
    if(t2[1] == 3 && page == 4.4f){
      image(img114, 0, 477, 435, 348);
    }
    if(t2[1] == 4 && page == 4.4f){
      image(img121, 0, 477, 435, 348);
    }
    
    // 중복클릭 방지
    if(status == 0){
      if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 477 && mouseY <= 825)){
        flag = 3;
      }
    }
    if(status == 1){
      if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 129 && mouseY <= 477)){
        flag = 3;
      }
    }
    // 결승 윗 사진 선택시 최종 선택 저장
    if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 129 && mouseY <= 477) && mousePressed && flag == 3){
      result = t2[0];
      page_ = 3;
      status = 0;
    }
    // 결승 아랫 사진 선택시 최종선택 저장 
    if((mouseX >= 0 && mouseX <= 435) && (mouseY >= 477 && mouseY <= 825) && mousePressed && flag == 3){
      result = t2[1];
      page_ = 3;
      status = 1;
    }
  }
  
  // 최종 화면
  if(page_ == 3){
    
    // 최종화면 구성
    background(0);
    
    image(result1, 0, 0, 435, 825);
    image(result2, 96, 100, 250, 139);
    image(result3, 115, 600, 210, 140);
    
    // 학관 & 맘스
    if(result == 1 && page == 1){
      image(moms_img76, 0, 235, 435, 348);
    }
    if(result == 2 && page == 1){
      image(moms_img76, 0, 235, 435, 348);
    }
    if(result == 3 && page == 1){
      image(h_img71, 0, 235, 435, 348);
    }
    if(result == 4 && page == 1){
      image(h_img72, 0, 235, 435, 348);
    }
    // 야식
    if(result == 1 && page == 2){
      image(y_img172, 0, 235, 435, 348);
    }
    if(result == 2 && page == 2){
      image(y_img174, 0, 235, 435, 348);
    }
    if(result == 3 && page == 2){
      image(y_img180, 0, 235, 435, 348);
    }
    if(result == 4 && page == 2){
      image(y_img184, 0, 235, 435, 348);
    }
    // 과자
    if(result == 1 && page == 3.1f){
      image(gs_img40, 0, 235, 435, 348);
    }
    if(result == 2 && page == 3.1f){
      image(gs_img41, 0, 235, 435, 348);
    }
    if(result == 3 && page == 3.1f){
      image(gs_img42, 0, 235, 435, 348);
    }
    if(result == 4 && page == 3.1f){
      image(gs_img43, 0, 235, 435, 348);
    }
    // 음료수
    if(result == 1 && page == 3.2f){
      image(gs_img20, 0, 235, 435, 348);
    }
    if(result == 2 && page == 3.2f){
      image(gs_img21, 0, 235, 435, 348);
    }
    if(result == 3 && page == 3.2f){
      image(gs_img30, 0, 235, 435, 348);
    }
    if(result == 4 && page == 3.2f){
      image(gs_img37, 0, 235, 435, 348);
    }
    // 아이스크림
    if(result == 1 && page == 3.3f){
      image(i_img1, 0, 235, 435, 348);
    }
    if(result == 2 && page == 3.3f){
      image(i_img2, 0, 235, 435, 348);
    }
    if(result == 3 && page == 3.3f){
      image(i_img3, 0, 235, 435, 348);
    }
    if(result == 4 && page == 3.3f){
      image(i_img4, 0, 235, 435, 348);
    }
    // 빨너
    if(result == 1 && page == 4.1f){
      image(img147, 0, 230, 435, 348);
    }
    if(result == 2 && page == 4.1f){
      image(img148, 0, 230, 435, 348);
    }
    if(result == 3 && page == 4.1f){
      image(img153, 0, 230, 435, 348);
    }
    if(result == 4 && page == 4.1f){
      image(img157, 0, 230, 435, 348);
    }
    // 인브리즈
    if(result == 1 && page == 4.2f){
      image(img128, 0, 235, 435, 348);
    }
    if(result == 2 && page == 4.2f){
      image(img134, 0, 235, 435, 348);
    }
    if(result == 3 && page == 4.2f){
      image(img140, 0, 235, 435, 348);
    }
    if(result == 4 && page == 4.2f){
      image(img143, 0, 235, 435, 348);
    }
    // 버거킹
    if(result == 1 && page == 4.3f){
      image(img91, 0, 235, 435, 348);
    }
    if(result == 2 && page == 4.3f){
      image(img96, 0, 235, 435, 348);
    }
    if(result == 3 && page == 4.3f){
      image(img98, 0, 235, 435, 348);
    }
    if(result == 4 && page == 4.3f){
      image(img102, 0, 235, 435, 348);
    }
    // 팜발
    if(result == 1 && page == 4.4f){
      image(img105, 0, 235, 435, 348);
    }
    if(result == 2 && page == 4.4f){
      image(img111, 0, 235, 435, 348);
    }
    if(result == 3 && page == 4.4f){
      image(img114, 0, 235, 435, 348);
    }
    if(result == 4 && page == 4.4f){
      image(img121, 0, 235, 435, 348);
    }
  }
}

/* *** 메뉴버튼 *** */

public void button0_0() {

  if (mouseX >= 20 && mouseX <= 50 && mouseY >= 16 && mouseY <= 43) {

    stroke(123); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜 
    
    line(20, 20, 50, 20);
    line(20, 30, 50, 30);
    line(20, 40, 50, 40);

    if (mousePressed) {
      flag = 1; // 버튼 5(시간표 버튼) 중복 클릭 방지용 변수값 설정 (메뉴화면에서 뒤로가기 버튼을 누를 경우)
      page = -1;
      rand_num = (int)random(100) % 5 + 1; // 1 ~ 5의 수 중에서 랜덤으로 rand_num에 저장
    }
  } else {

    stroke(229,184,83); // 원래 버튼의 색

    line(20, 20, 50, 20);
    line(20, 30, 50, 30);
    line(20, 40, 50, 40);
  }

  return;
}

/* *** 메인화면 버튼 1 *** */

public void button0_1() {

  if (mouseX >= 0 && mouseX <= 522 && mouseY >= 125 && mouseY <= 275) {
    
    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    rect(0, 125, 435, 150);
    
    image(img2_1, 163, 175, 175, 60);
    
    if (mousePressed) {
      page = 1;
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    rect(0, 125, 435, 150);
    
    image(img2_1, 163, 175, 175, 60);
  }

  return;
}

/* *** 메인화면 버튼 2 *** */

public void button0_2() {

  if (mouseX >= 0 && mouseX <= 522 && mouseY >= 275 && mouseY <= 425) {

    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    rect(0, 275, 435, 150);

    image(img3_1,202,326,90,60);

    if (mousePressed) {

      page = 2;
    
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    rect(0, 275, 435, 150);
    
    image(img3_1,202,326,90,60);
    
  }

  return;
}

/* *** 메인화면 버튼 3_1 *** */

public void button0_3_1() {

  if (mouseX >= 150 && mouseX < 230 && mouseY >= 453 && mouseY <= 543) {

    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    noStroke();
    rect(150, 453, 80, 90, 15);

    image(img4_1,160,470,60,80);
    image(img4_2,230,460,80,90);
    image(img4_3,300,461,115,90);

    if (mousePressed) {

      page = 3.1f;
    
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    noStroke();
    rect(145, 453, 85, 90);
    
    image(img4_1,160,470,60,80);
    image(img4_2,230,460,80,90);
    image(img4_3,300,461,115,90);
  
  }

  return;
}

/* *** 메인화면 버튼 3_2 *** */

public void button0_3_2() {

  if (mouseX >= 230 && mouseX < 310 && mouseY >= 453 && mouseY <= 543) {

    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    noStroke();
    rect(230, 453, 80, 90, 15);

    image(img4_1,160,470,60,80);
    image(img4_2,230,460,80,90);
    image(img4_3,300,461,115,90);

    if (mousePressed) {

      page = 3.2f;
    
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    noStroke();
    rect(230, 453, 80, 90);
    
    image(img4_1,160,470,60,80);
    image(img4_2,230,460,80,90);
    image(img4_3,300,461,115,90);
  
  }

  return;
}

/* *** 메인화면 버튼 3_3 *** */

public void button0_3_3() {

  if (mouseX >= 310 && mouseX <= 400 && mouseY >= 453 && mouseY <= 543) {

    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    noStroke();
    rect(310, 453, 95, 90, 15);

    image(img4_1,160,470,60,80);
    image(img4_2,230,460,80,90);
    image(img4_3,300,461,115,90);

    if (mousePressed) {

      page = 3.3f;
    
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    noStroke();
    rect(310, 453, 95, 90);
    
    image(img4_1,160,470,60,80);
    image(img4_2,230,460,80,90);
    image(img4_3,300,461,115,90);
  
  }

  return;
}

/* *** 메인화면 버튼 4_1 *** */

public void button0_4_1() {

  if (mouseX >= 142 && mouseX < 197 && mouseY >= 600 && mouseY <= 690) {

    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    noStroke();
    rect(142, 600, 55, 90, 15);

    image(img6_1,130,615,80,80);
    image(img6_2,190,614,90,80);
    image(img6_3,265,615,80,80);
    image(img6_4,330,615,80,80);

    flag = 0; // 마우스 커서가 이 영역에 있을 때 버튼 5(시간표 버튼)가 활성화됨 (중복클릭 방지)

    if (mousePressed) {

      page = 4.1f;
    
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    noStroke();
    rect(142, 600, 55, 90);

    image(img6_1,130,615,80,80);
    image(img6_2,190,614,90,80);
    image(img6_3,265,615,80,80);
    image(img6_4,330,615,80,80);
  
  }

  return;
}

/* *** 메인화면 버튼 4_2 *** */

public void button0_4_2() {

  if (mouseX >= 197 && mouseX < 273 && mouseY >= 600 && mouseY <= 690) {

    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    noStroke();
    rect(197, 600, 76, 90, 15);

    image(img6_1,130,615,80,80);
    image(img6_2,190,614,90,80);
    image(img6_3,265,615,80,80);
    image(img6_4,330,615,80,80);

    flag = 0; // 마우스 커서가 이 영역에 있을 때 버튼 5(시간표 버튼)가 활성화됨 (중복클릭 방지)

    if (mousePressed) {

      page = 4.2f;
    
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    noStroke();
    rect(197, 600, 76, 90);

    image(img6_1,130,615,80,80);
    image(img6_2,190,614,90,80);
    image(img6_3,265,615,80,80);
    image(img6_4,330,615,80,80);
  
  }

  return;
}

/* *** 메인화면 버튼 4_3 *** */

public void button0_4_3() {

  if (mouseX >= 273 && mouseX < 337 && mouseY >= 600 && mouseY <= 690) {

    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    noStroke();
    rect(273, 600, 64, 90, 15);

    image(img6_1,130,615,80,80);
    image(img6_2,190,614,90,80);
    image(img6_3,265,615,80,80);
    image(img6_4,330,615,80,80);

    flag = 0; // 마우스 커서가 이 영역에 있을 때 버튼 5(시간표 버튼)가 활성화됨 (중복클릭 방지)

    if (mousePressed) {

      page = 4.3f;
    
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    noStroke();
    rect(273, 600, 64, 90);

    image(img6_1,130,615,80,80);
    image(img6_2,190,614,90,80);
    image(img6_3,265,615,80,80);
    image(img6_4,330,615,80,80);
  
  }

  return;
}

/* *** 메인화면 버튼 4_4 *** */

public void button0_4_4() {

  if (mouseX >= 337 && mouseX <= 401 && mouseY >= 600 && mouseY <= 690) {

    fill(190); // 마우스 커서가 이 영역에 있을 때 버튼의 색이 바뀜
    noStroke();
    rect(337, 600, 64, 90, 15);

    image(img6_1,130,615,80,80);
    image(img6_2,190,614,90,80);
    image(img6_3,265,615,80,80);
    image(img6_4,330,615,80,80);

    flag = 0; // 마우스 커서가 이 영역에 있을 때 버튼 5(시간표 버튼)가 활성화됨 (중복클릭 방지)

    if (mousePressed) {

      page = 4.4f;
    
    }
  } 
  
  else {

    fill(255); // 원래 버튼의 색
    noStroke();
    rect(337, 600, 64, 90);

    image(img6_1,130,615,80,80);
    image(img6_2,190,614,90,80);
    image(img6_3,265,615,80,80);
    image(img6_4,330,615,80,80);
  
  }

  return;
}

/* *** 메인화면 버튼 5 *** */

public void button0_5() {

  if (mouseX >= 115 && mouseX <= 315 && mouseY >= 755 && mouseY <= 805) {

    image(img5_1,108,741,220,77); // 마우스 커서가 이 영역에 있을 때 버튼의 사이즈가 커짐

    if (mousePressed && flag == 0) {
      page = 5;
      flag = 1; // 버튼을 클릭했을 때 친구 2 버튼이 중복으로 눌리지 않게 함
    }
  } 
  
  else {

    image(img5_1,133,750,170,60); // 원래 버튼의 사이즈
  }

  return;
}

/* *** page 5 뒤로가기 버튼 *** */

public void button_5_goback() {

  if (mouseX >= 355 && mouseX <= 420 && mouseY >= 755 && mouseY <= 800) {

    image(goback2_y, 330, 750, 120, 72); // 마우스 커서가 이 영역에 있을 때 노란색 "가기"로 바뀜

    if (mousePressed) { // 마우스 클릭 시 메인화면으로 돌아감
      
      friend1 = 0;
      friend2 = 0;
      page = 0;
    
    }
  } 
  
  else {
    
    image(goback1_y, 330, 750, 120, 72); // 노란색 "뒤로"
  }

  return;
}

/* *** page -1 뒤로가기 버튼 *** */

public void button_menu_goback() {

  if (mouseX >= 150 && mouseX <= 220 && mouseY >= 750 && mouseY <= 800 && speed == 0) {
    noStroke();
    rect(160, 750, 60, 72); // 마우스 커서가 이 영역에 있을 때 하얀색 테두리 없는 사각형이 그려짐 (뒤로가기 버튼이 겹쳐 보이지 않게 함)
    image(goback2_b, 130, 750, 120, 72); // 마우스 커서가 이 영역에 있을 때 검정색 "가기"로 바뀜 

    if (mousePressed) {
      page = 0; // 메인화면으로 복귀
      speed = 12; // speed 값이 다시 12로 초기화됨
      i = 0;
    }
  } else if (speed == 0) {
    noStroke();
    rect(160, 750, 60, 72); // 마우스 커서가 이 영역에 있을 때 하얀색 테두리 없는 사각형이 그려짐 (뒤로가기 버튼이 겹쳐 보이지 않게 함)
    image(goback1_b, 130, 750, 120, 72); // 검정색 "뒤로"
  }

  return;
}

/* *** page -1 모션 *** */

public void menu_motion() {

  if (i >= 250) {
    speed = 0; // 메뉴창의 가로가 250이 될 때 모션속도가 0이 됨
  } else if (i >= 0) {
    rect(0, 0, i, 825);
  }

  i += speed;
}

public void draw() {

  //페이지 -2
  
  if(page == -2){
    loading();
  }

  // 페이지 -1

  if(page == -1){
    page_menu();
  }
  
  // 페이지 0
  
  if(page == 0){
    page0();
  }

  // 페이지 1

  if(page == 1){
    page1();
  }

  // 페이지 2

  if(page == 2){
    page2();
  }

  // 페이지 3_1

  if(page == 3.1f){
    page3_1();
  }
  
  // 페이지 3_2
  
  if(page == 3.2f){
    page3_2();
  }
  
  // 페이지 3_3
  
  if(page == 3.3f){
    page3_3();
  }

  // 페이지 4_1

  if(page == 4.1f){
    page4_1();
  }
  
  // 페이지 4_2
  
  if(page == 4.2f){
    page4_2();
  }
  
  // 페이지 4_3
  
  if(page == 4.3f){
    page4_3();
  }
  
  // 페이지 4_4
  
  if(page == 4.4f){
    page4_4();
  }

  // 페이지 5

  if(page == 5){
    page5();
  }
}
  public void settings() {  size(435, 825); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "AFM" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
