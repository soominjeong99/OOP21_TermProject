package mall;

import java.util.Arrays;

//장바구니를 관리하기 위한 클래스
public class CartManager implements Manager {
	Cart[] cartArray = new Cart[20]; // 바구니를 담는 자료구조, 배열 크기는 20 (임시)
	int count = 0;

	@Override
	// 장바구니를 배열에 추가
	public void add(Object o) {
		// 배열 크기를 넘어갈 경우 추가 못함
		if (count >= cartArray.length) {
			throw new ArrayIndexOutOfBoundsException("더이상 추가할 수 없습니다.");
		}
		cartArray[count++] = (Cart) o;
	}

	@Override
	// 장바구니에서 상품 삭제
	public void remove(int i) {
		// 배열에서 상품 아이디를 가진 인덱스 값을 deleteKey에 저장
		int deleteKey = Arrays.binarySearch(cartArray, i);

		if (deleteKey < 0) // 배열에 해당 물품이 없을 경우
		{
			throw new ArrayIndexOutOfBoundsException("해당 물품을 찾을 수 없습니다");
		} else {
			// deleteKey 위치의 데이터를 삭제하고, index 뒤의 데이터는 한칸씩 당겨진다.
			for (int k = deleteKey; k < count - 1; k++) {
				cartArray[k] = cartArray[k + 1];
			}
			count--;
			cartArray[count] = null;
		}
	}

	@Override
	// 장바구니 내용 수정
	public void modify(int i, Object o) {

		// 배열에서 상품 아이디를 가진 인덱스 값을 searchKey에 저장
		int searchKey = Arrays.binarySearch(cartArray, i);

		if (searchKey < 0) // 배열에 해당 물품이 없을 경우
		{
			throw new ArrayIndexOutOfBoundsException("해당 물품을 찾을 수 없습니다");
		} else {
			cartArray[searchKey] = (Cart) o;
		}
	}

	@Override
	// 전체 장바구니 내용 화면 출력
	public void display() {
		System.out.println(Arrays.toString(cartArray));
	}
}
