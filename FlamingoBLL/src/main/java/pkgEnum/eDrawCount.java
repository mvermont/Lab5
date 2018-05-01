package pkgEnum;

public enum eDrawCount {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

	private int iDrawCnt;

	private eDrawCount(int iDrawCnt) {
		this.iDrawCnt = iDrawCnt;
	}

	public int getiDrawCnt() {
		return iDrawCnt;
	}
}
