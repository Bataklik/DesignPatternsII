package domain;

public interface IProfileIterator {

	boolean hasNext();

	Profile next();

	void reset();

}