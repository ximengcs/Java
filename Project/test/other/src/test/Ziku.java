package test;

public class Ziku {

	public void set( char ZIKU[][] ) {
		int i, decade, the_unit;

		for (i = 0; i < 100; i++) {

			decade = ((i + 1) / 10) % 10; // 十位
			the_unit = (i + 1) % 10; // 个位

			switch (decade) {
			case 0: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "HUNDRED");
					break;
				} else {
					strcpy(ZIKU[i++], "ONE");
					strcpy(ZIKU[i++], "TWO");
					strcpy(ZIKU[i++], "THREE");
					strcpy(ZIKU[i++], "FOUR");
					strcpy(ZIKU[i++], "FIVE");
					strcpy(ZIKU[i++], "SIX");
					strcpy(ZIKU[i++], "SEVEN");
					strcpy(ZIKU[i++], "EIGHT");
					strcpy(ZIKU[i], "NINE");
					break;
				}
			}
			case 1: {
				strcpy(ZIKU[i++], "TEN");
				strcpy(ZIKU[i++], "ELEVEN");
				strcpy(ZIKU[i++], "TWELVE");
				strcpy(ZIKU[i++], "THIRTEEN");
				strcpy(ZIKU[i++], "FORTEEN");
				strcpy(ZIKU[i++], "FIFTEEN");
				strcpy(ZIKU[i++], "SIXTEEN");
				strcpy(ZIKU[i++], "SEVENTEEN");
				strcpy(ZIKU[i++], "EIGHTEEN");
				strcpy(ZIKU[i], "NINTEEN");
				break;
			}
			case 2: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "TWENTY");
					break;
				} else {
					strcpy(ZIKU[i], ZIKU[19]);
					strcat(ZIKU[i], "-");
					strcat(ZIKU[i], ZIKU[the_unit - 1]);
					break;
				}
			}
			case 3: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "THIRTY");
					break;
				} else {
					strcpy(ZIKU[i], ZIKU[29]);
					strcat(ZIKU[i], "-");
					strcat(ZIKU[i], ZIKU[the_unit - 1]);
					break;
				}
			}
			case 4: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "FORTY");
					break;
				} else {
					strcpy(ZIKU[i], ZIKU[39]);
					strcat(ZIKU[i], "-");
					strcat(ZIKU[i], ZIKU[the_unit - 1]);
					break;
				}
			}
			case 5: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "FIFTY");
					break;
				} else {
					strcpy(ZIKU[i], ZIKU[49]);
					strcat(ZIKU[i], "-");
					strcat(ZIKU[i], ZIKU[the_unit - 1]);
					break;
				}
			}
			case 6: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "SISTY");
					break;
				} else {
					strcpy(ZIKU[i], ZIKU[59]);
					strcat(ZIKU[i], "-");
					strcat(ZIKU[i], ZIKU[the_unit - 1]);
					break;
				}
			}
			case 7: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "SEVENTY");
					break;
				} else {
					strcpy(ZIKU[i], ZIKU[69]);
					strcat(ZIKU[i], "-");
					strcat(ZIKU[i], ZIKU[the_unit - 1]);
					break;
				}
			}
			case 8: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "EIGHTY");
					break;
				} else {
					strcpy(ZIKU[i], ZIKU[79]);
					strcat(ZIKU[i], "-");
					strcat(ZIKU[i], ZIKU[the_unit - 1]);
					break;
				}
			}
			case 9: {
				if (the_unit == 0) {
					strcpy(ZIKU[i], "NINTY");
					break;
				} else {
					strcpy(ZIKU[i], ZIKU[89]);
					strcat(ZIKU[i], "-");
					strcat(ZIKU[i], ZIKU[the_unit - 1]);
					break;
				}
			}
			}
		}
	}
}
