package models;

public class abilities {
	private Integer id;
	private Integer champion;
	private String champion_name;
	private String champion_description;
	private String effect;
	private String cost;
	private Integer rango;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getChampion() {
		return champion;
	}
	public void setChampion(Integer champion) {
		this.champion = champion;
	}
	public String getChampion_name() {
		return champion_name;
	}
	public void setChampion_name(String champion_name) {
		this.champion_name = champion_name;
	}
	public String getChampion_description() {
		return champion_description;
	}
	public void setChampion_description(String champion_description) {
		this.champion_description = champion_description;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Integer getRango() {
		return rango;
	}
	public void setRango(Integer rango) {
		this.rango = rango;
	}
	
}
