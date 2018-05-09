package polymorphism_8.music;

public class Music {
	/**
	* 接受任何导出自Instrument的类，并且不需要转型
	* 因为Instrument的接口必定存在于Wind中，
	* Wind向上转型可能会缩小接口，但不会比Instrument全部接口还窄
	* 但从输出结果看，会发现为什么程序能确定他是Wind而不是替他对象呢
	* 这又引出了绑定这个话题	 
	* @param i
	*/	
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
