package ch07.lab09;

// 介面練習步驟一：(本程式無法執行)
// 假設interface Weight如下:

interface Weight {
	int getWeight();
}

// 現有Plane, Rock, Dog三個類別, 必須實作Weight介面, 以便得到
// getWeight()這樣的行為。請完成這三個類別。

// 註:getWeight()應傳回該物件的重量

class Plane {
	int weight = 100000;

}

class Rock {
	int rockWeight = 50000;
}

class Dog {
	int dogWeight = 100;
}
