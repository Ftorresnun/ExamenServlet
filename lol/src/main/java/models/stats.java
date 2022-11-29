package models;

public class stats {
	private Integer champion;
	private String stat_name;
	private float stat_value;
	private float modifier_per_level;
	
	public Integer getChampion() {
		return champion;
	}
	public void setChampion(Integer champion) {
		this.champion = champion;
	}
	public String getStat_name() {
		return stat_name;
	}
	public void setStat_name(String stat_name) {
		this.stat_name = stat_name;
	}
	public float getStat_value() {
		return stat_value;
	}
	public void setStat_value(float stat_value) {
		this.stat_value = stat_value;
	}
	public float getModifier_per_level() {
		return modifier_per_level;
	}
	public void setModifier_per_level(float modifier_per_level) {
		this.modifier_per_level = modifier_per_level;
	}
	
}
