/**
 * @(#) Menuitem.java
 */

public abstract class Menuitem
{
	private String name;
	
	private Quality quality;
	
	public abstract double getIngredientPrice( );

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
