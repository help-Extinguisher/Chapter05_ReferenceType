package ch05_array;

public class ArratCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		/* ����� �۾Ƽ� �迭�� �߰��ϰ� ���� ���
		 * �� ū �迭�� ���� �� ������ �����Ѵ�.
		 */
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		oldIntArray = newIntArray;
//		�̷��� �ؼ� �̸��� �ٲ��ټ�����
		
	}

}
