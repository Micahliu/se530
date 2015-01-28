/**
 * wentuo modified at 2015 2015年1月27日 上午10:32:13
 */
package edu.olivet.se530.entry;

/**
 * @author wentuo
 *
 */
public class Foo {
	private String bar;
	
	private int height;
	
	private int weight;

	public void boo(){
		try {
			bar = "BAR";
		}finally{
			System.out.println(bar);
		}
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Foo [bar=" + bar + ", height=" + height + ", weight=" + weight
				+ ", getHeight()=" + getHeight() + ", getWeight()="
				+ getWeight() + "]";
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
