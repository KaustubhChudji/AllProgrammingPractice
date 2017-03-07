package com.highOrderFunction.demo;

public class HighOrderFunction {
	public static int twiceApply(HighOrderFuctionInterface demo, int x) {
		return demo.apply(demo.apply(x));
	}

	public static void main(String[] args) {
		HighOrderFuctionInterface demo = new HigherOrderImpl();
		int twiceApply = twiceApply(demo, 20);
		System.out.println(twiceApply);
	}
}
