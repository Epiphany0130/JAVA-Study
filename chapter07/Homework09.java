public class Homework09 {

	//编写一个 main 方法
	public static void main(String[] args) {
		Music music = new Music("ABC", 300);
		music.play();
		System.out.println(music.getInfo());
	}
}  

class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	//播放 方法
	public void play() {
		System.out.println("音乐 " + name + " 正在播放中... 时长为" + times + "秒");	
	}
	//返回 方法
	public String getInfo() {
		return "音乐 " + name + " 播放时间为" + times;
	}
}	