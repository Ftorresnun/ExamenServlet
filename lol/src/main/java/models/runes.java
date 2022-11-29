package models;

public class runes {
	private Integer id;
	private Integer tier;
	private String rune_name;
	private String rune_description;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTier() {
		return tier;
	}
	public void setTier(Integer tier) {
		this.tier = tier;
	}
	public String getRune_name() {
		return rune_name;
	}
	public void setRune_name(String rune_name) {
		this.rune_name = rune_name;
	}
	public String getRune_description() {
		return rune_description;
	}
	public void setRune_description(String rune_description) {
		this.rune_description = rune_description;
	}
	
}
