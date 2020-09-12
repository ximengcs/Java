package question.lib;

import java.math.BigDecimal;

import lib.net.mindview.util.Generator;

public class BigDecimalGenerator implements Generator<BigDecimal>{

	public BigDecimal next() {
		return new BigDecimal( new java.util.Random().nextInt() );
	}
}
