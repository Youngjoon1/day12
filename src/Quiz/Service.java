package Quiz;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Service {

	private DTO dto;
	public Service() {
		dto = new DTO();
	}
	
	
	
	
	
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		String ID,PWD = null;;
		boolean bool = true;
		while(bool) {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 탈퇴");
		System.out.println("4. 종료");
		System.out.print(">>>>>>");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1 :
			System.out.println("id : ");
			ID = sc.next();
			
			System.out.println("pwd : ");
			PWD = sc.next();
			
			if(ID.equals(null)) {
				System.out.println("회원가입해주세요");
			}else if(ID.equals(dto.getId()) && PWD.equals(dto.getPwd())){
				System.out.println("로그인 성공");
				setStartTime();
				System.out.println(getStartTime());
				
				
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
			break;
		case 2 :
			System.out.println("가입할 id : ");
			dto.setId(sc.next());
			System.out.println("가입할 pwd : ");
			dto.setPwd(sc.next());
			break;
		case 3 :
			dto.setId(null);
			dto.setPwd(null);
			break;
		case 4 :
			setEndTime();
			System.out.println("종료시간 : " + getEndTime());
			bool = false;
			
			
		}
		
		
		
		}
	}
	
	
	
	
	public void setStartTime() {
		System.out.println("시작시간");
		long start = System.currentTimeMillis();
		dto.setStart(start);
	}
	public String getStartTime() {
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 ss초");
		String sTime = s.format(dto.getStart());
		return sTime;
	}
	public void setEndTime() {
		long end = System.currentTimeMillis();
		dto.setEnd(end);
		dto.setTotal((end-dto.getStart() / 1000));
	}
	public String getEndTime() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 ss초");
		String eTime = s.format(dto.getEnd());
		
		return eTime;
		
	}
	public String getResultTime() {
		long total = dto.getTotal();
		int m = (int)total / 60;
		int s = (int)total % 60;
		return m+"분"+s+"초 사용";
		
		
	}
	
}
