package mall;

import java.util.Arrays;

//상품을 관리하기 위한 클래스
public class GoodsManager implements Manager {

	Goods[] goodsArray = new Goods[20]; //상품을 담는 자료구조, 배열 크기는 20 (임시)
	int count = 0;

	@Override
	//상품을 배열에 추가
	public void add(Object o) {
		if (count >= goodsArray.length) {
			throw new ArrayIndexOutOfBoundsException("더이상 추가할 수 없습니다.");
		}
		goodsArray[count++] = (Goods) o;
	}

	@Override
	//상품을 배열에서 삭제
	public void remove(int i) {
		// 배열에서 상품 아이디를 가진 인덱스 값을 deleteKey에 저장
		int deleteKey = Arrays.binarySearch(goodsArray, i);

		if (deleteKey < 0) // 배열에 해당 물품이 없을 경우
		{
			throw new ArrayIndexOutOfBoundsException("해당 물품을 찾을 수 없습니다");
		} else {
			//deleteKey 위치의 데이터를 삭제하고, index 뒤의 데이터는 한칸씩 당겨진다.
			for (int k = deleteKey; k < count - 1; k++) {
				goodsArray[k] = goodsArray[k + 1];
			}
			count--;
			goodsArray[count] = null;
		}
	}

	@Override
	//상품내용 변경
	public void modify(int i, Object o) {

		// 배열에서 상품 아이디를 가진 인덱스 값을 searchKey에 저장
		int searchKey = Arrays.binarySearch(goodsArray, i);

		if (searchKey < 0) // 배열에 해당 물품이 없을 경우
		{
			throw new ArrayIndexOutOfBoundsException("해당 물품을 찾을 수 없습니다");
		} else {
			goodsArray[searchKey] = (Goods) o;
		}
	}

	@Override
	//전체 상품 화면에 출력
	public void display() {
		System.out.println(Arrays.toString(goodsArray));
	}

}
