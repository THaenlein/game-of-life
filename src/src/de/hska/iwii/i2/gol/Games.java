package src.de.hska.iwii.i2.gol;

/**
 * Diese Klasse kapselt einige vordefinierte Startgenerationen
 * fuer das Game of Life.
 * @author Holger Vogelsang
 *
 */
public class Games {

	public static final boolean[][] BLOCK = new boolean[][]{
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, true,  true,  false, false, false, false},
		{false, false, false, false, true,  true,  false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false}
	};

	public static final boolean[][] BEHIVE = new boolean[][]{
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, true,  true,  false, false, false, false},
		{false, false, false, true,  false, false, true,  false, false, false},
		{false, false, false, false, true,  true,  false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false}
	};

	public static final boolean[][] BLINKER2 = new boolean[][]{
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, true,  true,  true,  false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false}
	};

	public static final boolean[][] BEACON2 = new boolean[][]{
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, true,  true,  false, false, false, false, false},
		{false, false, false, true,  true,  false, false, false, false, false},
		{false, false, false, false, false, true,  true,  false, false, false},
		{false, false, false, false, false, true,  true,  false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false, false}
	};

	public static final boolean[][] SMALL_GUN = new boolean[][]{
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, true, true, true, true, true, true, true,
					true, false, true, true, true, true, true, false, false,
					false, true, true, true, false, false, false, false, false,
					false, true, true, true, true, true, true, true, false,
					true, true, true, true, true, false, false, false, false,
					false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false}
		};

	public static final boolean[][] GOSPER_GLIDER_GUN = new boolean[][]{
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					true, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, true, false,
					true, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, true, true, false, false,
					false, false, false, false, true, true, false, false,
					false, false, false, false, false, false, false, false,
					false, false, true, true, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, true, false, false, false, true,
					false, false, false, false, true, true, false, false,
					false, false, false, false, false, false, false, false,
					false, false, true, true, false, false, false},
			{false, true, true, false, false, false, false, false, false,
					false, false, true, false, false, false, false, false,
					true, false, false, false, true, true, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false},
			{false, true, true, false, false, false, false, false, false,
					false, false, true, false, false, false, true, false, true,
					true, false, false, false, false, true, false, true, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, true, false, false, false, false, false,
					true, false, false, false, false, false, false, false,
					true, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, true, false, false, false, true,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, true, true, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false},
			{false, false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false, false,
					false, false, false, false, false, false, false}
		};

	/**
	 * Beschreibt eine Startgeneration mit ihrem Namen. Ohne eine
	 * Startgeneration wird fuer den Namen eine Zufallsanordnung
	 * der lebenden und toten Zellen erzeugt.
	 */
	public static class Description {
		private String name;
		private boolean[][] generation;
		
		/**
		 * Neue Simulation mit Namen und Startgeneration erzeugen.
		 * @param name Name der Simulation.
		 * @param generation Startgeneration.
		 */
		public Description(String name, boolean[][] generation) {
			this.name = name;
			this.generation = generation;
		}
		
		/**
		 * Namen einer Generation auslesen.
		 * @return Name der Generation.
		 */
		public String getName() {
			return name;
		}
		
		/**
		 * Startgeneration einer Simulation auslesen.
		 * @return Startgeneration.
		 */
		public boolean[][] getGeneration() {
			return generation;
		}
		
		/**
		 * Erzeugt eine Zufallsanordnung der lebenden und toten
		 * Zellen und gibt ihr einen Namen.
		 * @param name Name der Anordnung.
		 */
		public Description(String name) {
			this.name = name;
			this.generation = new boolean[ 30 ][ 30 ];
			for (int i = 0; i < generation.length; i++) {
				for (int j = 0; j < generation[ i ].length; j++) {
					generation[ i ][ j ] = (Math.random() <= 0.6);
				}
			}
		}
	}
	
	/**
	 * Aufzaehlung aller moeglichen vordefinierten Startgenerationen.
	 */
	public static final Description[] DESCRIPTIONS = new Description[] {
		new Description("Block", BLOCK),
		new Description("Behive", BEHIVE),
		new Description("Blinker 2", BLINKER2),
		new Description("Beacon 2", BEACON2),
		new Description("Small Gun", SMALL_GUN),
		new Description("Gosper Glider Gun", GOSPER_GLIDER_GUN),
		new Description("Zufall")
	};
	
	/**
	 * Suche eine Generation anhand ihres Namens. Existiert
	 * keine Generation dieses Namens, dann wird die Zufallsanordnung
	 * verwendet.
	 * @param name Name der gesuchten Startgeneration.
	 * @return Anordnung der Zellen.
	 */
	public static boolean[][] findGenerationByName(String name) {
		for (Description descr: DESCRIPTIONS) {
			if (name.equals(descr.getName())) {
				return descr.getGeneration();
			}
		}
		// Nicht gefunden: Zufallsgeneration verwenden.
		return findGenerationByName("Zufall");
	}

}
