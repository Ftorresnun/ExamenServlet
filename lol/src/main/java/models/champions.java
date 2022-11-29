package models;

public class champions {
	private Integer id;
	private String champion_name;
	private String title;
	private String lore;
	private String tags;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChampion_name() {
		return champion_name;
	}
	public void setChampion_name(String champion_name) {
		this.champion_name = champion_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	
}
