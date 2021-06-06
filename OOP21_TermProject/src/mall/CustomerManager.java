package mall;

import java.util.Arrays;

//고객을 관리하기 위한 클래스
public class CustomerManager implements Manager {
	
	Customer[] customerArray = new Customer[20]; //고객 정보를 담는 자료구조, 배열 크기는 20 (임시)
	int count = 0;

	@Override
	//새로운 고객을 배열에 추가
	public void add(Object o) {
		if (count >= customerArray.length) {
			throw new ArrayIndexOutOfBoundsException("더이상 추가할 수 없습니다.");
		}
		customerArray[count++] = (Customer) o;
	}

	@Override
	//고객 정보 삭제
	public void remove(int i) {
		// 배열에서 고객 아이디를 가진 인덱스 값을 deleteKey에 저장
		int deleteKey = Arrays.binarySearch(customerArray, i);

		if (deleteKey < 0) // 배열에 해당 고객이 없을 경우
		{
			throw new ArrayIndexOutOfBoundsException("해당 고객을 찾을 수 없습니다");
		} else {
			//deleteKey 위치의 데이터를 삭제하고, index 뒤의 데이터는 한칸씩 당겨진다.
			for (int k = deleteKey; k < count - 1; k++) {
				customerArray[k] = customerArray[k + 1];
			}
			count--;
			customerArray[count] = null;
		}
	}

	@Override
	//고객 정보 변경
	public void modify(int i, Object o) {

		// 배열에서 고객 아이디를 가진 인덱스 값을 searchKey에 저장
		int searchKey = Arrays.binarySearch(customerArray, i);

		if (searchKey < 0) // 배열에 해당 고객이 없을 경우
		{
			throw new ArrayIndexOutOfBoundsException("해당 고객을 찾을 수 없습니다");
		} else {
			customerArray[searchKey] = (Customer) o;
		}
	}

	@Override
	//전체 고객 정보 화면에 출력
	public void display() {
		System.out.println(Arrays.toString(customerArray));
	}

}
