package data;

import java.util.ArrayList;
import java.util.Map;

import state.Floor;

public class Data {

	// 唯一实例
	private static Data data = new Data();
	
	private Data() { 
		mam = new Position( 8, 15 );
	}
	
	// 母
	private Position mam;
	
	// 友
	private Tank friend;
	
	// 敌
	private ArrayList<Tank> enemy;
	
	// 地板
	private Map<Floor, ArrayList<Square>> positions;
	
	// 获取母坐标
	public Position getMum() {
		return mam;
	}
	
	// 获取友坐标
	public Tank getFriend() {
		return friend;
	}
	
	// 获取敌坐标
	public ArrayList<Tank> getEnemy() {
		return enemy;
	}
	
	// 获取地形map
	public Map<Floor, ArrayList<Square>> getFloor() {
		return positions;
	}
	
	// 获得当前实例
	public static Data getData() {
		return data;
	}
	
	// 清除本关信息
	public void clear() {
		
	}
	
	// 加载数据
	public void load( Tank friend, ArrayList<Tank> enemy, Map<Floor, ArrayList<Square>> positions ) {
		this.friend = friend;
		this.enemy = enemy;
		this.positions = positions;
	}
	
	public String toString() {
		return positions.toString();
	}
}
