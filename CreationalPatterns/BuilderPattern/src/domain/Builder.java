package domain;

public interface Builder {

	void reset();

	void setCarType(CarType type);

	void setSeat(int seat);

	void setEngine(Engine engine);

	ICar getCar();

}